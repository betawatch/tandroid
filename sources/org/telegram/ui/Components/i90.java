package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i90 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;

    public /* synthetic */ i90(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i9, boolean z10, int i10) {
        this.a = i10;
        this.d = notificationCenterDelegate;
        this.b = i9;
        this.c = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                AnimatorSet[] animatorSetArr = ((cx0) this.d).E;
                int i9 = this.b;
                AnimatorSet animatorSet = animatorSetArr[i9];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[i9] = null;
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
                k90 k90Var = (k90) this.d;
                j6[] j6VarArr = k90Var.x;
                org.telegram.ui.ActionBar.h5[] h5VarArr = k90Var.w;
                float[] fArr = k90Var.V;
                boolean z10 = this.c;
                float f10 = z10 ? 1.0f : 0.0f;
                int i9 = this.b;
                fArr[i9] = f10;
                h5VarArr[i9].setScaleX(z10 ? 1.0f : 1.111f);
                h5VarArr[i9].setScaleY(z10 ? 1.0f : 1.111f);
                h5VarArr[i9].setTranslationY(z10 ? 0.0f : AndroidUtilities.dp(8.0f));
                j6VarArr[i9].setAlpha(z10 ? 1.0f : 0.0f);
                if (!z10) {
                    j6VarArr[i9].setVisibility(8);
                    break;
                }
                break;
            default:
                cx0 cx0Var = (cx0) this.d;
                AnimatorSet[] animatorSetArr = cx0Var.E;
                int i10 = this.b;
                AnimatorSet animatorSet = animatorSetArr[i10];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.c) {
                        cx0Var.F[i10].setVisibility(4);
                    }
                    animatorSetArr[i10] = null;
                    break;
                }
                break;
        }
    }
}
