package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ft0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ PhotoViewer c;

    public /* synthetic */ ft0(PhotoViewer photoViewer, boolean z4, int i10) {
        this.a = i10;
        this.c = photoViewer;
        this.b = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                PhotoViewer photoViewer = this.c;
                if (animator.equals(photoViewer.w)) {
                    photoViewer.w = null;
                    break;
                }
                break;
            case 2:
                PhotoViewer photoViewer2 = this.c;
                if (animator.equals(photoViewer2.I)) {
                    photoViewer2.I = null;
                    break;
                }
                break;
            case 3:
                this.c.Q7 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        boolean z4 = this.b;
        PhotoViewer photoViewer = this.c;
        switch (i10) {
            case 0:
                if (!z4) {
                    photoViewer.f3.setVisibility(8);
                    break;
                }
                break;
            case 1:
                if (animator.equals(photoViewer.w)) {
                    if (!z4) {
                        photoViewer.U0.setVisibility(4);
                    }
                    photoViewer.w = null;
                    break;
                }
                break;
            case 2:
                if (animator.equals(photoViewer.I)) {
                    if (!z4) {
                        photoViewer.C.setVisibility(4);
                        if (photoViewer.f0.getTag() != null) {
                            photoViewer.f0.setVisibility(4);
                        }
                        if (photoViewer.N1.getTag() != null) {
                            photoViewer.N1.setVisibility(4);
                        }
                    }
                    photoViewer.I = null;
                    break;
                }
                break;
            default:
                if (animator.equals(photoViewer.Q7)) {
                    photoViewer.Q7 = new AnimatorSet();
                    if (z4) {
                        photoViewer.K7.setVisibility(0);
                        photoViewer.L7.setVisibility(0);
                        AnimatorSet animatorSet = photoViewer.Q7;
                        su0 su0Var = photoViewer.K7;
                        Property property = View.TRANSLATION_Y;
                        animatorSet.playTogether(ObjectAnimator.ofFloat(su0Var, (Property<su0, Float>) property, 0.0f), ObjectAnimator.ofFloat(photoViewer.L7, (Property<org.telegram.ui.Components.zf0, Float>) property, 0.0f));
                    } else {
                        if (photoViewer.P4) {
                            photoViewer.g0.setVisibility(8);
                            photoViewer.g0.setAlpha(0.0f);
                            photoViewer.g0.setBackgroundColor(photoViewer.Z1 == 11 ? -16777216 : 2130706432);
                        }
                        photoViewer.K7.setVisibility(4);
                        photoViewer.L7.setVisibility(4);
                        AnimatorSet animatorSet2 = photoViewer.Q7;
                        eg.q1 q1Var = photoViewer.M0;
                        Property property2 = View.TRANSLATION_Y;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(q1Var, (Property<eg.q1, Float>) property2, 0.0f), ObjectAnimator.ofFloat(photoViewer.M0, (Property<eg.q1, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(photoViewer.P0, (Property<org.telegram.ui.Components.qp0, Float>) property2, 0.0f));
                    }
                    photoViewer.Q7.addListener(new ss0(this, 7));
                    photoViewer.Q7.setDuration(200L);
                    photoViewer.Q7.setInterpolator(AndroidUtilities.decelerateInterpolator);
                    photoViewer.Q7.start();
                    break;
                }
                break;
        }
    }
}
