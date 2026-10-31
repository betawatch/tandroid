package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u2 extends AnimatorListenerAdapter {
    public final /* synthetic */ v2 a;

    public u2(v2 v2Var) {
        this.a = v2Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z10) {
        v2 v2Var = this.a;
        v2Var.e = v2Var.c;
        v2Var.f = v2Var.d;
        SecureRandom secureRandom = Utilities.b;
        v2Var.c = org.telegram.messenger.i0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.i0.L(16.0f));
        v2Var.d = org.telegram.messenger.i0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.i0.L(16.0f));
        ValueAnimator valueAnimator = v2Var.b;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }
}
