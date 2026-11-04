package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b11 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Runnable e;
    public final /* synthetic */ c11 f;

    public b11(c11 c11Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f = c11Var;
        this.a = z10;
        this.b = runnable;
        this.c = zArr;
        this.d = z11;
        this.e = runnable2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Runnable runnable;
        c11 c11Var = this.f;
        l0 l0Var = c11Var.s;
        boolean z10 = this.a;
        float f10 = z10 ? 1.0f : 0.0f;
        c11Var.J = f10;
        org.telegram.messenger.g0.X1(c11Var.c, c11Var.d, f10, c11Var.e);
        l0Var.invalidate();
        if (!z10) {
            c11Var.w.setAlpha(c11Var.J);
        }
        if (c11Var.J < 0.5f && !z10 && (runnable = this.b) != null) {
            boolean[] zArr = this.c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                c11Var.a.b = false;
                c11Var.Q.i0.invalidate();
            }
            org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.k1, 4);
        }
        c11Var.L = null;
        l0Var.invalidate();
        Runnable runnable2 = this.e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
