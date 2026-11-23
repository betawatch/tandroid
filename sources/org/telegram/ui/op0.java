package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class op0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ PhotoViewer c;

    public /* synthetic */ op0(PhotoViewer photoViewer, boolean z10, int i7) {
        this.a = i7;
        this.c = photoViewer;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                PhotoViewer photoViewer = this.c;
                if (animator.equals(photoViewer.x)) {
                    photoViewer.x = null;
                    break;
                }
                break;
            case 2:
                PhotoViewer photoViewer2 = this.c;
                if (animator.equals(photoViewer2.M)) {
                    photoViewer2.M = null;
                    break;
                }
                break;
            case 3:
                this.c.U7 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.a;
        boolean z10 = this.b;
        PhotoViewer photoViewer = this.c;
        switch (i7) {
            case 0:
                if (!z10) {
                    photoViewer.i3.setVisibility(8);
                    break;
                }
                break;
            case 1:
                if (animator.equals(photoViewer.x)) {
                    if (!z10) {
                        photoViewer.Y0.setVisibility(4);
                    }
                    photoViewer.x = null;
                    break;
                }
                break;
            case 2:
                if (animator.equals(photoViewer.M)) {
                    if (!z10) {
                        photoViewer.G.setVisibility(4);
                        if (photoViewer.j0.getTag() != null) {
                            photoViewer.j0.setVisibility(4);
                        }
                        if (photoViewer.R1.getTag() != null) {
                            photoViewer.R1.setVisibility(4);
                        }
                    }
                    photoViewer.M = null;
                    break;
                }
                break;
            default:
                if (animator.equals(photoViewer.U7)) {
                    photoViewer.U7 = new AnimatorSet();
                    if (z10) {
                        photoViewer.O7.setVisibility(0);
                        photoViewer.P7.setVisibility(0);
                        AnimatorSet animatorSet = photoViewer.U7;
                        xq0 xq0Var = photoViewer.O7;
                        Property property = View.TRANSLATION_Y;
                        animatorSet.playTogether(ObjectAnimator.ofFloat(xq0Var, (Property<xq0, Float>) property, 0.0f), ObjectAnimator.ofFloat(photoViewer.P7, (Property<org.telegram.ui.Cells.x0, Float>) property, 0.0f));
                    } else {
                        if (photoViewer.S4) {
                            photoViewer.k0.setVisibility(8);
                            photoViewer.k0.setAlpha(0.0f);
                            photoViewer.k0.setBackgroundColor(photoViewer.d2 == 11 ? -16777216 : 2130706432);
                        }
                        photoViewer.O7.setVisibility(4);
                        photoViewer.P7.setVisibility(4);
                        AnimatorSet animatorSet2 = photoViewer.U7;
                        di.n4 n4Var = photoViewer.Q0;
                        Property property2 = View.TRANSLATION_Y;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(n4Var, (Property<di.n4, Float>) property2, 0.0f), ObjectAnimator.ofFloat(photoViewer.Q0, (Property<di.n4, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(photoViewer.T0, (Property<oi.w1, Float>) property2, 0.0f));
                    }
                    photoViewer.U7.addListener(new ay(this, 18));
                    photoViewer.U7.setDuration(200L);
                    photoViewer.U7.setInterpolator(org.telegram.messenger.g0.F);
                    photoViewer.U7.start();
                    break;
                }
                break;
        }
    }
}
