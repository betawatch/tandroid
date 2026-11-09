package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class n11 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Runnable e;
    public final /* synthetic */ o11 f;

    public n11(o11 o11Var, boolean z9, Runnable runnable, boolean[] zArr, boolean z10, Runnable runnable2) {
        this.f = o11Var;
        this.a = z9;
        this.b = runnable;
        this.c = zArr;
        this.d = z10;
        this.e = runnable2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Runnable runnable;
        o11 o11Var = this.f;
        k0 k0Var = o11Var.s;
        boolean z9 = this.a;
        float f10 = z9 ? 1.0f : 0.0f;
        o11Var.I = f10;
        org.telegram.messenger.g0.X1(o11Var.c, o11Var.d, f10, o11Var.e);
        k0Var.invalidate();
        if (!z9) {
            o11Var.w.setAlpha(o11Var.I);
        }
        if (o11Var.I < 0.5f && !z9 && (runnable = this.b) != null) {
            boolean[] zArr = this.c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z9) {
            if (this.d) {
                o11Var.a.b = false;
                o11Var.P.h0.invalidate();
            }
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.k1, 4);
        }
        o11Var.K = null;
        k0Var.invalidate();
        Runnable runnable2 = this.e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
