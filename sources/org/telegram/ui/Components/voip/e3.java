package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class e3 extends AnimatorListenerAdapter {
    public final /* synthetic */ f3 a;

    public e3(f3 f3Var) {
        this.a = f3Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z9) {
        f3 f3Var = this.a;
        f3Var.e = f3Var.c;
        f3Var.f = f3Var.d;
        SecureRandom secureRandom = Utilities.b;
        f3Var.c = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
        f3Var.d = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
        ValueAnimator valueAnimator = f3Var.b;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }
}
