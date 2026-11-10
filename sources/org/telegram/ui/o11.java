package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class o11 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Runnable e;
    public final /* synthetic */ p11 f;

    public o11(p11 p11Var, boolean z9, Runnable runnable, boolean[] zArr, boolean z10, Runnable runnable2) {
        this.f = p11Var;
        this.a = z9;
        this.b = runnable;
        this.c = zArr;
        this.d = z10;
        this.e = runnable2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Runnable runnable;
        p11 p11Var = this.f;
        k0 k0Var = p11Var.s;
        boolean z9 = this.a;
        float f10 = z9 ? 1.0f : 0.0f;
        p11Var.I = f10;
        org.telegram.messenger.g0.X1(p11Var.c, p11Var.d, f10, p11Var.e);
        k0Var.invalidate();
        if (!z9) {
            p11Var.w.setAlpha(p11Var.I);
        }
        if (p11Var.I < 0.5f && !z9 && (runnable = this.b) != null) {
            boolean[] zArr = this.c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z9) {
            if (this.d) {
                p11Var.a.b = false;
                p11Var.P.h0.invalidate();
            }
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.k1, 4);
        }
        p11Var.K = null;
        k0Var.invalidate();
        Runnable runnable2 = this.e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
