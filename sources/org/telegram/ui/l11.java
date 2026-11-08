package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class l11 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Runnable e;
    public final /* synthetic */ m11 f;

    public l11(m11 m11Var, boolean z9, Runnable runnable, boolean[] zArr, boolean z10, Runnable runnable2) {
        this.f = m11Var;
        this.a = z9;
        this.b = runnable;
        this.c = zArr;
        this.d = z10;
        this.e = runnable2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Runnable runnable;
        m11 m11Var = this.f;
        k0 k0Var = m11Var.s;
        boolean z9 = this.a;
        float f10 = z9 ? 1.0f : 0.0f;
        m11Var.I = f10;
        org.telegram.messenger.g0.X1(m11Var.c, m11Var.d, f10, m11Var.e);
        k0Var.invalidate();
        if (!z9) {
            m11Var.w.setAlpha(m11Var.I);
        }
        if (m11Var.I < 0.5f && !z9 && (runnable = this.b) != null) {
            boolean[] zArr = this.c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z9) {
            if (this.d) {
                m11Var.a.b = false;
                m11Var.P.h0.invalidate();
            }
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.k1, 4);
        }
        m11Var.K = null;
        k0Var.invalidate();
        Runnable runnable2 = this.e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
