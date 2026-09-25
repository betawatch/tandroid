package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class o3 extends AnimatorListenerAdapter {
    public final /* synthetic */ p3 a;

    public o3(p3 p3Var) {
        this.a = p3Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z10) {
        p3 p3Var = this.a;
        p3Var.e = p3Var.c;
        p3Var.f = p3Var.d;
        p3Var.c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
        p3Var.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
        ValueAnimator valueAnimator = p3Var.b;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }
}
