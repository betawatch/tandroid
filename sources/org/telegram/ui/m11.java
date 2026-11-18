package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class m11 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Runnable e;
    public final /* synthetic */ n11 f;

    public m11(n11 n11Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f = n11Var;
        this.a = z10;
        this.b = runnable;
        this.c = zArr;
        this.d = z11;
        this.e = runnable2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Runnable runnable;
        n11 n11Var = this.f;
        k0 k0Var = n11Var.s;
        boolean z10 = this.a;
        float f10 = z10 ? 1.0f : 0.0f;
        n11Var.J = f10;
        org.telegram.messenger.g0.X1(n11Var.c, n11Var.d, f10, n11Var.e);
        k0Var.invalidate();
        if (!z10) {
            n11Var.w.setAlpha(n11Var.J);
        }
        if (n11Var.J < 0.5f && !z10 && (runnable = this.b) != null) {
            boolean[] zArr = this.c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                n11Var.a.b = false;
                n11Var.Q.i0.invalidate();
            }
            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.k1, 4);
        }
        n11Var.L = null;
        k0Var.invalidate();
        Runnable runnable2 = this.e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
