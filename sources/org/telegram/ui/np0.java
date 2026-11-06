package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class np0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ PhotoViewer c;

    public /* synthetic */ np0(PhotoViewer photoViewer, boolean z9, int i7) {
        this.a = i7;
        this.c = photoViewer;
        this.b = z9;
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
                if (animator.equals(photoViewer2.L)) {
                    photoViewer2.L = null;
                    break;
                }
                break;
            case 3:
                this.c.T7 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.a;
        boolean z9 = this.b;
        PhotoViewer photoViewer = this.c;
        switch (i7) {
            case 0:
                if (!z9) {
                    photoViewer.h3.setVisibility(8);
                    break;
                }
                break;
            case 1:
                if (animator.equals(photoViewer.x)) {
                    if (!z9) {
                        photoViewer.X0.setVisibility(4);
                    }
                    photoViewer.x = null;
                    break;
                }
                break;
            case 2:
                if (animator.equals(photoViewer.L)) {
                    if (!z9) {
                        photoViewer.F.setVisibility(4);
                        if (photoViewer.i0.getTag() != null) {
                            photoViewer.i0.setVisibility(4);
                        }
                        if (photoViewer.Q1.getTag() != null) {
                            photoViewer.Q1.setVisibility(4);
                        }
                    }
                    photoViewer.L = null;
                    break;
                }
                break;
            default:
                if (animator.equals(photoViewer.T7)) {
                    photoViewer.T7 = new AnimatorSet();
                    if (z9) {
                        photoViewer.N7.setVisibility(0);
                        photoViewer.O7.setVisibility(0);
                        AnimatorSet animatorSet = photoViewer.T7;
                        xq0 xq0Var = photoViewer.N7;
                        Property property = View.TRANSLATION_Y;
                        animatorSet.playTogether(ObjectAnimator.ofFloat(xq0Var, (Property<xq0, Float>) property, 0.0f), ObjectAnimator.ofFloat(photoViewer.O7, (Property<org.telegram.ui.Cells.v0, Float>) property, 0.0f));
                    } else {
                        if (photoViewer.R4) {
                            photoViewer.j0.setVisibility(8);
                            photoViewer.j0.setAlpha(0.0f);
                            photoViewer.j0.setBackgroundColor(photoViewer.c2 == 11 ? -16777216 : 2130706432);
                        }
                        photoViewer.N7.setVisibility(4);
                        photoViewer.O7.setVisibility(4);
                        AnimatorSet animatorSet2 = photoViewer.T7;
                        bi.m5 m5Var = photoViewer.P0;
                        Property property2 = View.TRANSLATION_Y;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(m5Var, (Property<bi.m5, Float>) property2, 0.0f), ObjectAnimator.ofFloat(photoViewer.P0, (Property<bi.m5, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(photoViewer.S0, (Property<li.w1, Float>) property2, 0.0f));
                    }
                    photoViewer.T7.addListener(new d30(this, 17));
                    photoViewer.T7.setDuration(200L);
                    photoViewer.T7.setInterpolator(org.telegram.messenger.g0.F);
                    photoViewer.T7.start();
                    break;
                }
                break;
        }
    }
}
