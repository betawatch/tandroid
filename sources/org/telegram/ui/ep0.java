package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ep0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ PhotoViewer c;

    public /* synthetic */ ep0(PhotoViewer photoViewer, boolean z10, int i3) {
        this.a = i3;
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
                this.c.V7 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i3 = this.a;
        boolean z10 = this.b;
        PhotoViewer photoViewer = this.c;
        switch (i3) {
            case 0:
                if (!z10) {
                    photoViewer.j3.setVisibility(8);
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
                if (animator.equals(photoViewer.V7)) {
                    photoViewer.V7 = new AnimatorSet();
                    if (z10) {
                        photoViewer.P7.setVisibility(0);
                        photoViewer.Q7.setVisibility(0);
                        AnimatorSet animatorSet = photoViewer.V7;
                        nq0 nq0Var = photoViewer.P7;
                        Property property = View.TRANSLATION_Y;
                        animatorSet.playTogether(ObjectAnimator.ofFloat(nq0Var, (Property<nq0, Float>) property, 0.0f), ObjectAnimator.ofFloat(photoViewer.Q7, (Property<org.telegram.ui.Cells.v0, Float>) property, 0.0f));
                    } else {
                        if (photoViewer.T4) {
                            photoViewer.k0.setVisibility(8);
                            photoViewer.k0.setAlpha(0.0f);
                            photoViewer.k0.setBackgroundColor(photoViewer.d2 == 11 ? -16777216 : 2130706432);
                        }
                        photoViewer.P7.setVisibility(4);
                        photoViewer.Q7.setVisibility(4);
                        AnimatorSet animatorSet2 = photoViewer.V7;
                        ci.t4 t4Var = photoViewer.Q0;
                        Property property2 = View.TRANSLATION_Y;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(t4Var, (Property<ci.t4, Float>) property2, 0.0f), ObjectAnimator.ofFloat(photoViewer.Q0, (Property<ci.t4, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(photoViewer.T0, (Property<mi.x1, Float>) property2, 0.0f));
                    }
                    photoViewer.V7.addListener(new y20(this, 17));
                    photoViewer.V7.setDuration(200L);
                    photoViewer.V7.setInterpolator(org.telegram.messenger.g0.F);
                    photoViewer.V7.start();
                    break;
                }
                break;
        }
    }
}
