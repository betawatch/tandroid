package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class y0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final ai.l0 a;
    public final RadialProgressView b;
    public final org.telegram.ui.ActionBar.h6 c;
    public float d;
    public int e;

    public y0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.c = h6Var;
        ai.l0 l0Var = new ai.l0(this, context);
        this.a = l0Var;
        l0Var.setWillNotDraw(false);
        addView(l0Var, c8.ma.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, h6Var);
        this.b = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(28.0f));
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.i1(h6Var) ? org.telegram.ui.ActionBar.m6.Ka : org.telegram.ui.ActionBar.m6.Zc, h6Var));
        l0Var.addView(radialProgressView, c8.ma.e(32, 32, 17));
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        org.telegram.ui.ActionBar.h6 h6Var = this.c;
        try {
            this.b.setProgressColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.i1(h6Var) ? org.telegram.ui.ActionBar.m6.Ka : org.telegram.ui.ActionBar.m6.Zc, h6Var));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
