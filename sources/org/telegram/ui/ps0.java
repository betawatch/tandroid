package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ps0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ PhotoViewer c;

    public /* synthetic */ ps0(PhotoViewer photoViewer, boolean z10, int i10) {
        this.a = i10;
        this.c = photoViewer;
        this.b = z10;
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
                if (animator.equals(photoViewer2.H)) {
                    photoViewer2.H = null;
                    break;
                }
                break;
            case 3:
                this.c.P7 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        boolean z10 = this.b;
        PhotoViewer photoViewer = this.c;
        switch (i10) {
            case 0:
                if (!z10) {
                    photoViewer.e3.setVisibility(8);
                    break;
                }
                break;
            case 1:
                if (animator.equals(photoViewer.w)) {
                    if (!z10) {
                        photoViewer.T0.setVisibility(4);
                    }
                    photoViewer.w = null;
                    break;
                }
                break;
            case 2:
                if (animator.equals(photoViewer.H)) {
                    if (!z10) {
                        photoViewer.B.setVisibility(4);
                        if (photoViewer.e0.getTag() != null) {
                            photoViewer.e0.setVisibility(4);
                        }
                        if (photoViewer.M1.getTag() != null) {
                            photoViewer.M1.setVisibility(4);
                        }
                    }
                    photoViewer.H = null;
                    break;
                }
                break;
            default:
                if (animator.equals(photoViewer.P7)) {
                    photoViewer.P7 = new AnimatorSet();
                    if (z10) {
                        photoViewer.J7.setVisibility(0);
                        photoViewer.K7.setVisibility(0);
                        AnimatorSet animatorSet = photoViewer.P7;
                        bu0 bu0Var = photoViewer.J7;
                        Property property = View.TRANSLATION_Y;
                        animatorSet.playTogether(ObjectAnimator.ofFloat(bu0Var, (Property<bu0, Float>) property, 0.0f), ObjectAnimator.ofFloat(photoViewer.K7, (Property<org.telegram.ui.Components.of0, Float>) property, 0.0f));
                    } else {
                        if (photoViewer.O4) {
                            photoViewer.f0.setVisibility(8);
                            photoViewer.f0.setAlpha(0.0f);
                            photoViewer.f0.setBackgroundColor(photoViewer.Y1 == 11 ? -16777216 : 2130706432);
                        }
                        photoViewer.J7.setVisibility(4);
                        photoViewer.K7.setVisibility(4);
                        AnimatorSet animatorSet2 = photoViewer.P7;
                        bg.u1 u1Var = photoViewer.L0;
                        Property property2 = View.TRANSLATION_Y;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(u1Var, (Property<bg.u1, Float>) property2, 0.0f), ObjectAnimator.ofFloat(photoViewer.L0, (Property<bg.u1, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(photoViewer.O0, (Property<org.telegram.ui.Components.hp0, Float>) property2, 0.0f));
                    }
                    photoViewer.P7.addListener(new e50(this, 16));
                    photoViewer.P7.setDuration(200L);
                    photoViewer.P7.setInterpolator(AndroidUtilities.decelerateInterpolator);
                    photoViewer.P7.start();
                    break;
                }
                break;
        }
    }
}
