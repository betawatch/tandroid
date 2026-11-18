package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class h3 extends AnimatorListenerAdapter {
    public final /* synthetic */ i3 a;

    public h3(i3 i3Var) {
        this.a = i3Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z10) {
        i3 i3Var = this.a;
        i3Var.e = i3Var.c;
        i3Var.f = i3Var.d;
        SecureRandom secureRandom = Utilities.b;
        i3Var.c = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
        i3Var.d = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
        ValueAnimator valueAnimator = i3Var.b;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }
}
