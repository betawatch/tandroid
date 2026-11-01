package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class b31 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Runnable e;
    public final /* synthetic */ c31 f;

    public b31(c31 c31Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f = c31Var;
        this.a = z10;
        this.b = runnable;
        this.c = zArr;
        this.d = z11;
        this.e = runnable2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Runnable runnable;
        c31 c31Var = this.f;
        l0 l0Var = c31Var.s;
        boolean z10 = this.a;
        float f7 = z10 ? 1.0f : 0.0f;
        c31Var.I = f7;
        org.telegram.messenger.i0.X1(c31Var.c, c31Var.d, f7, c31Var.e);
        l0Var.invalidate();
        if (!z10) {
            c31Var.w.setAlpha(c31Var.I);
        }
        if (c31Var.I < 0.5f && !z10 && (runnable = this.b) != null) {
            boolean[] zArr = this.c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                c31Var.a.b = false;
                c31Var.P.h0.invalidate();
            }
            org.telegram.messenger.at.e().k(org.telegram.messenger.at.k1, 4);
        }
        c31Var.K = null;
        l0Var.invalidate();
        Runnable runnable2 = this.e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
