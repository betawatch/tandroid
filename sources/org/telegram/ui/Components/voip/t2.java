package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t2 extends AnimatorListenerAdapter {
    public final /* synthetic */ u2 a;

    public t2(u2 u2Var) {
        this.a = u2Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z10) {
        u2 u2Var = this.a;
        u2Var.e = u2Var.c;
        u2Var.f = u2Var.d;
        SecureRandom secureRandom = Utilities.b;
        u2Var.c = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
        u2Var.d = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
        ValueAnimator valueAnimator = u2Var.b;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }
}
