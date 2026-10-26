package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class md extends PopupWindow {
    public final lh.e a;
    public final FrameLayout b;
    public final ld c;
    public final org.telegram.ui.ActionBar.u6 d;
    public ValueAnimator e;
    public Bitmap f;
    public boolean g;
    public Runnable h;
    public final bi.i6 i;

    public md(org.telegram.ui.lk lkVar, org.telegram.ui.ActionBar.u6 u6Var, ch.b bVar) {
        super(lkVar.getContext());
        this.i = new bi.i6(this, 8);
        this.a = lkVar;
        this.b = lkVar.getContainer();
        this.d = u6Var;
        ld ldVar = new ld(this, bVar);
        this.c = ldVar;
        setContentView(ldVar);
        setBackgroundDrawable(new ColorDrawable(0));
        setFocusable(true);
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(2);
        setAnimationStyle(0);
        setOnDismissListener(new org.telegram.ui.ActionBar.c0(1, this, lkVar));
    }

    public final void b(int i10, String str, boolean z10, Runnable runnable) {
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, this.b.getContext(), this.d, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        g1Var.j(str, i10, null);
        g1Var.c(z10 ? org.telegram.ui.ActionBar.y6.p7 : org.telegram.ui.ActionBar.y6.E8, z10 ? org.telegram.ui.ActionBar.y6.p7 : org.telegram.ui.ActionBar.y6.F8);
        g1Var.h(0.12f, z10 ? org.telegram.ui.ActionBar.y6.p7 : org.telegram.ui.ActionBar.y6.E8);
        g1Var.setOnClickListener(new ga(2, this, runnable));
        this.c.a.addView(g1Var, gb1.r(-1, 48));
    }

    public final void c(float f7) {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.e.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.c.n, f7);
        this.e = ofFloat;
        ofFloat.setDuration(f7 == 1.0f ? 280L : 200L);
        this.e.setInterpolator(ds.h);
        this.e.addUpdateListener(new n6(this, 8));
        this.e.addListener(new org.telegram.ui.ActionBar.a1(this, f7, 5));
        this.e.start();
    }

    public final void d() {
        this.h = null;
        super.dismiss();
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        if (!isShowing() || this.g) {
            return;
        }
        this.g = true;
        c(0.0f);
    }
}
