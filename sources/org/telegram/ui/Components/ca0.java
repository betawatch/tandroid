package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ca0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;

    public /* synthetic */ ca0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z4, int i11) {
        this.a = i11;
        this.d = notificationCenterDelegate;
        this.b = i10;
        this.c = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                AnimatorSet[] animatorSetArr = ((xx0) this.d).F;
                int i10 = this.b;
                AnimatorSet animatorSet = animatorSetArr[i10];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[i10] = null;
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ea0 ea0Var = (ea0) this.d;
                k6[] k6VarArr = ea0Var.x;
                org.telegram.ui.ActionBar.k5[] k5VarArr = ea0Var.w;
                float[] fArr = ea0Var.W;
                boolean z4 = this.c;
                float f10 = z4 ? 1.0f : 0.0f;
                int i10 = this.b;
                fArr[i10] = f10;
                k5VarArr[i10].setScaleX(z4 ? 1.0f : 1.111f);
                k5VarArr[i10].setScaleY(z4 ? 1.0f : 1.111f);
                k5VarArr[i10].setTranslationY(z4 ? 0.0f : AndroidUtilities.dp(8.0f));
                k6VarArr[i10].setAlpha(z4 ? 1.0f : 0.0f);
                if (!z4) {
                    k6VarArr[i10].setVisibility(8);
                    break;
                }
                break;
            default:
                xx0 xx0Var = (xx0) this.d;
                AnimatorSet[] animatorSetArr = xx0Var.F;
                int i11 = this.b;
                AnimatorSet animatorSet = animatorSetArr[i11];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.c) {
                        xx0Var.G[i11].setVisibility(4);
                    }
                    animatorSetArr[i11] = null;
                    break;
                }
                break;
        }
    }
}
