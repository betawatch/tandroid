package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ab0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;

    public /* synthetic */ ab0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z10, int i11) {
        this.a = i11;
        this.d = notificationCenterDelegate;
        this.b = i10;
        this.c = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                AnimatorSet[] animatorSetArr = ((uy0) this.d).I;
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
                cb0 cb0Var = (cb0) this.d;
                s6[] s6VarArr = cb0Var.x;
                org.telegram.ui.ActionBar.h5[] h5VarArr = cb0Var.w;
                float[] fArr = cb0Var.Z;
                boolean z10 = this.c;
                float f7 = z10 ? 1.0f : 0.0f;
                int i10 = this.b;
                fArr[i10] = f7;
                h5VarArr[i10].setScaleX(z10 ? 1.0f : 1.111f);
                h5VarArr[i10].setScaleY(z10 ? 1.0f : 1.111f);
                h5VarArr[i10].setTranslationY(z10 ? 0.0f : AndroidUtilities.dp(8.0f));
                s6VarArr[i10].setAlpha(z10 ? 1.0f : 0.0f);
                if (!z10) {
                    s6VarArr[i10].setVisibility(8);
                    break;
                }
                break;
            default:
                uy0 uy0Var = (uy0) this.d;
                AnimatorSet[] animatorSetArr = uy0Var.I;
                int i11 = this.b;
                AnimatorSet animatorSet = animatorSetArr[i11];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.c) {
                        uy0Var.J[i11].setVisibility(4);
                    }
                    animatorSetArr[i11] = null;
                    break;
                }
                break;
        }
    }
}
