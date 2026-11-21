package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class n11 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Runnable e;
    public final /* synthetic */ o11 f;

    public n11(o11 o11Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f = o11Var;
        this.a = z10;
        this.b = runnable;
        this.c = zArr;
        this.d = z11;
        this.e = runnable2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Runnable runnable;
        o11 o11Var = this.f;
        k0 k0Var = o11Var.s;
        boolean z10 = this.a;
        float f10 = z10 ? 1.0f : 0.0f;
        o11Var.J = f10;
        org.telegram.messenger.g0.X1(o11Var.c, o11Var.d, f10, o11Var.e);
        k0Var.invalidate();
        if (!z10) {
            o11Var.w.setAlpha(o11Var.J);
        }
        if (o11Var.J < 0.5f && !z10 && (runnable = this.b) != null) {
            boolean[] zArr = this.c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                o11Var.a.b = false;
                o11Var.Q.i0.invalidate();
            }
            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.k1, 4);
        }
        o11Var.L = null;
        k0Var.invalidate();
        Runnable runnable2 = this.e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
