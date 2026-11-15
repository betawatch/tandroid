package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class i11 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Runnable e;
    public final /* synthetic */ j11 f;

    public i11(j11 j11Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f = j11Var;
        this.a = z10;
        this.b = runnable;
        this.c = zArr;
        this.d = z11;
        this.e = runnable2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Runnable runnable;
        j11 j11Var = this.f;
        k0 k0Var = j11Var.s;
        boolean z10 = this.a;
        float f10 = z10 ? 1.0f : 0.0f;
        j11Var.J = f10;
        org.telegram.messenger.g0.X1(j11Var.c, j11Var.d, f10, j11Var.e);
        k0Var.invalidate();
        if (!z10) {
            j11Var.w.setAlpha(j11Var.J);
        }
        if (j11Var.J < 0.5f && !z10 && (runnable = this.b) != null) {
            boolean[] zArr = this.c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                j11Var.a.b = false;
                j11Var.Q.i0.invalidate();
            }
            org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.k1, 4);
        }
        j11Var.L = null;
        k0Var.invalidate();
        Runnable runnable2 = this.e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
