package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class w90 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;

    public /* synthetic */ w90(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z10, int i11) {
        this.a = i11;
        this.d = notificationCenterDelegate;
        this.b = i10;
        this.c = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                AnimatorSet[] animatorSetArr = ((nx0) this.d).E;
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
                y90 y90Var = (y90) this.d;
                o6[] o6VarArr = y90Var.x;
                org.telegram.ui.ActionBar.h5[] h5VarArr = y90Var.w;
                float[] fArr = y90Var.V;
                boolean z10 = this.c;
                float f9 = z10 ? 1.0f : 0.0f;
                int i10 = this.b;
                fArr[i10] = f9;
                h5VarArr[i10].setScaleX(z10 ? 1.0f : 1.111f);
                h5VarArr[i10].setScaleY(z10 ? 1.0f : 1.111f);
                h5VarArr[i10].setTranslationY(z10 ? 0.0f : AndroidUtilities.dp(8.0f));
                o6VarArr[i10].setAlpha(z10 ? 1.0f : 0.0f);
                if (!z10) {
                    o6VarArr[i10].setVisibility(8);
                    break;
                }
                break;
            default:
                nx0 nx0Var = (nx0) this.d;
                AnimatorSet[] animatorSetArr = nx0Var.E;
                int i11 = this.b;
                AnimatorSet animatorSet = animatorSetArr[i11];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.c) {
                        nx0Var.F[i11].setVisibility(4);
                    }
                    animatorSetArr[i11] = null;
                    break;
                }
                break;
        }
    }
}
