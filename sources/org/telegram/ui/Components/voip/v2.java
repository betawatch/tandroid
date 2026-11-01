package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class v2 extends AnimatorListenerAdapter {
    public final /* synthetic */ w2 a;

    public v2(w2 w2Var) {
        this.a = w2Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z10) {
        w2 w2Var = this.a;
        w2Var.e = w2Var.c;
        w2Var.f = w2Var.d;
        SecureRandom secureRandom = Utilities.b;
        w2Var.c = org.telegram.messenger.i0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.i0.L(16.0f));
        w2Var.d = org.telegram.messenger.i0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.i0.L(16.0f));
        ValueAnimator valueAnimator = w2Var.b;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }
}
