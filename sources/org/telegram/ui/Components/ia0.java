package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class ia0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;

    public /* synthetic */ ia0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, boolean z10, int i11) {
        this.a = i11;
        this.d = notificationCenterDelegate;
        this.b = i10;
        this.c = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                AnimatorSet[] animatorSetArr = ((hy0) this.d).I;
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
                ka0 ka0Var = (ka0) this.d;
                p6[] p6VarArr = ka0Var.x;
                org.telegram.ui.ActionBar.j5[] j5VarArr = ka0Var.w;
                float[] fArr = ka0Var.Z;
                boolean z10 = this.c;
                float f7 = z10 ? 1.0f : 0.0f;
                int i10 = this.b;
                fArr[i10] = f7;
                j5VarArr[i10].setScaleX(z10 ? 1.0f : 1.111f);
                j5VarArr[i10].setScaleY(z10 ? 1.0f : 1.111f);
                j5VarArr[i10].setTranslationY(z10 ? 0.0f : AndroidUtilities.dp(8.0f));
                p6VarArr[i10].setAlpha(z10 ? 1.0f : 0.0f);
                if (!z10) {
                    p6VarArr[i10].setVisibility(8);
                    break;
                }
                break;
            default:
                hy0 hy0Var = (hy0) this.d;
                AnimatorSet[] animatorSetArr = hy0Var.I;
                int i11 = this.b;
                AnimatorSet animatorSet = animatorSetArr[i11];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.c) {
                        hy0Var.J[i11].setVisibility(4);
                    }
                    animatorSetArr[i11] = null;
                    break;
                }
                break;
        }
    }
}
