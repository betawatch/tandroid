package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class c71 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Runnable e;
    public final /* synthetic */ d71 f;

    public c71(d71 d71Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f = d71Var;
        this.a = z10;
        this.b = runnable;
        this.c = zArr;
        this.d = z11;
        this.e = runnable2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Runnable runnable;
        d71 d71Var = this.f;
        j0 j0Var = d71Var.s;
        boolean z10 = this.a;
        float f7 = z10 ? 1.0f : 0.0f;
        d71Var.I = f7;
        AndroidUtilities.lerp(d71Var.c, d71Var.d, f7, d71Var.e);
        j0Var.invalidate();
        if (!z10) {
            d71Var.v.setAlpha(d71Var.I);
        }
        if (d71Var.I < 0.5f && !z10 && (runnable = this.b) != null) {
            boolean[] zArr = this.c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                d71Var.a.b = false;
                d71Var.P.h0.invalidate();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        }
        d71Var.K = null;
        j0Var.invalidate();
        Runnable runnable2 = this.e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
