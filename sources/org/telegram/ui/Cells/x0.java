package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class x0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final ai.k0 a;
    public final RadialProgressView b;
    public final org.telegram.ui.ActionBar.i6 c;
    public float d;
    public int e;

    public x0(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.c = i6Var;
        ai.k0 k0Var = new ai.k0(this, context);
        this.a = k0Var;
        k0Var.setWillNotDraw(false);
        addView(k0Var, c8.ma.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, i6Var);
        this.b = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(28.0f));
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.i1(i6Var) ? org.telegram.ui.ActionBar.n6.Ka : org.telegram.ui.ActionBar.n6.Zc, i6Var));
        k0Var.addView(radialProgressView, c8.ma.e(32, 32, 17));
    }

    public final void a(float f10, int i7) {
        if (this.d != f10) {
            invalidate();
        }
        this.d = f10;
        this.e = i7;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), TLObject.FLAG_30));
    }

    public void setProgressVisible(boolean z10) {
        this.a.setVisibility(z10 ? 0 : 4);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        org.telegram.ui.ActionBar.i6 i6Var = this.c;
        try {
            this.b.setProgressColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.i1(i6Var) ? org.telegram.ui.ActionBar.n6.Ka : org.telegram.ui.ActionBar.n6.Zc, i6Var));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
