package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class dd1 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ wd1 e;

    public dd1(wd1 wd1Var, boolean z10, int i10, int i11, boolean z11) {
        this.e = wd1Var;
        this.a = z10;
        this.b = i10;
        this.c = i11;
        this.d = z11;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        wd1 wd1Var = this.e;
        FrameLayout[] frameLayoutArr = wd1Var.L0;
        wd1Var.r1 = null;
        int i10 = this.c;
        int i11 = this.b;
        boolean z10 = this.a;
        if (z10 && frameLayoutArr[i11].getVisibility() == 0) {
            frameLayoutArr[i11].setAlpha(1.0f);
            frameLayoutArr[i11].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i10].setVisibility(4);
        }
        int i12 = wd1Var.b;
        if (i12 == 1 || i12 == 2) {
            wd1Var.J0[this.d ? (char) 0 : (char) 2].setVisibility(4);
        } else if (i10 == 1) {
            frameLayoutArr[i11].setAlpha(0.0f);
        }
    }
}
