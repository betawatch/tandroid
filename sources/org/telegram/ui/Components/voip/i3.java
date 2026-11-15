package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class i3 extends AnimatorListenerAdapter {
    public final /* synthetic */ j3 a;

    public i3(j3 j3Var) {
        this.a = j3Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z10) {
        j3 j3Var = this.a;
        j3Var.e = j3Var.c;
        j3Var.f = j3Var.d;
        SecureRandom secureRandom = Utilities.b;
        j3Var.c = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
        j3Var.d = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
        ValueAnimator valueAnimator = j3Var.b;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }
}
