package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final ai.c0 a;
    public final RadialProgressView b;
    public final org.telegram.ui.ActionBar.e6 c;
    public float d;
    public int e;

    public w0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.c = e6Var;
        ai.c0 c0Var = new ai.c0(this, context);
        this.a = c0Var;
        c0Var.setWillNotDraw(false);
        addView(c0Var, mf.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, e6Var);
        this.b = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(28.0f));
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i1(e6Var) ? org.telegram.ui.ActionBar.k6.Ka : org.telegram.ui.ActionBar.k6.Wc, e6Var));
        c0Var.addView(radialProgressView, mf.e(32, 32, 17));
    }

    public final void a(float f10, int i3) {
        if (this.d != f10) {
            invalidate();
        }
        this.d = f10;
        this.e = i3;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), TLObject.FLAG_30));
    }

    public void setProgressVisible(boolean z10) {
        this.a.setVisibility(z10 ? 0 : 4);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        try {
            this.b.setProgressColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i1(e6Var) ? org.telegram.ui.ActionBar.k6.Ka : org.telegram.ui.ActionBar.k6.Wc, e6Var));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
