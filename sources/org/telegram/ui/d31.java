package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d31 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Runnable e;
    public final /* synthetic */ e31 f;

    public d31(e31 e31Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f = e31Var;
        this.a = z10;
        this.b = runnable;
        this.c = zArr;
        this.d = z11;
        this.e = runnable2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Runnable runnable;
        e31 e31Var = this.f;
        l0 l0Var = e31Var.s;
        boolean z10 = this.a;
        float f7 = z10 ? 1.0f : 0.0f;
        e31Var.I = f7;
        org.telegram.messenger.i0.X1(e31Var.c, e31Var.d, f7, e31Var.e);
        l0Var.invalidate();
        if (!z10) {
            e31Var.w.setAlpha(e31Var.I);
        }
        if (e31Var.I < 0.5f && !z10 && (runnable = this.b) != null) {
            boolean[] zArr = this.c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                e31Var.a.b = false;
                e31Var.P.h0.invalidate();
            }
            org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.k1, 4);
        }
        e31Var.K = null;
        l0Var.invalidate();
        Runnable runnable2 = this.e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
