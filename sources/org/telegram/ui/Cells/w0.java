package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class w0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final ai.k0 a;
    public final RadialProgressView b;
    public final org.telegram.ui.ActionBar.e6 c;
    public float d;
    public int e;

    public w0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.c = e6Var;
        ai.k0 k0Var = new ai.k0(this, context);
        this.a = k0Var;
        k0Var.setWillNotDraw(false);
        addView(k0Var, c8.ja.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, e6Var);
        this.b = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(28.0f));
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.i1(e6Var) ? org.telegram.ui.ActionBar.j6.Ka : org.telegram.ui.ActionBar.j6.Zc, e6Var));
        k0Var.addView(radialProgressView, c8.ja.e(32, 32, 17));
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

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        try {
            this.b.setProgressColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.i1(e6Var) ? org.telegram.ui.ActionBar.j6.Ka : org.telegram.ui.ActionBar.j6.Zc, e6Var));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
