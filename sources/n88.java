// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class n88 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ PhotoViewer c;

    public /* synthetic */ n88(PhotoViewer photoViewer, boolean z, byte b) {
        this.a = b;
        this.c = photoViewer;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        PhotoViewer photoViewer = this.c;
        switch (b) {
            case 1:
                if (animator.equals(photoViewer.x)) {
                    photoViewer.x = null;
                    break;
                }
                break;
            case 2:
                if (animator.equals(photoViewer.M)) {
                    photoViewer.M = null;
                    break;
                }
                break;
            case 3:
                photoViewer.a8 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        boolean z = this.b;
        PhotoViewer photoViewer = this.c;
        switch (b) {
            case 0:
                if (!z) {
                    photoViewer.i3.setVisibility(8);
                    break;
                }
                break;
            case 1:
                if (animator.equals(photoViewer.x)) {
                    if (!z) {
                        photoViewer.Y0.setVisibility(4);
                    }
                    photoViewer.x = null;
                    break;
                }
                break;
            case 2:
                if (animator.equals(photoViewer.M)) {
                    if (!z) {
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
                if (animator.equals(photoViewer.a8)) {
                    photoViewer.a8 = new AnimatorSet();
                    if (z) {
                        photoViewer.U7.setVisibility(0);
                        photoViewer.V7.setVisibility(0);
                        AnimatorSet animatorSet = photoViewer.a8;
                        q98 q98Var = photoViewer.U7;
                        Property property = View.TRANSLATION_Y;
                        animatorSet.playTogether(ObjectAnimator.ofFloat(q98Var, (Property<q98, Float>) property, 0.0f), ObjectAnimator.ofFloat(photoViewer.V7, (Property<z92, Float>) property, 0.0f));
                    } else {
                        if (photoViewer.S4) {
                            photoViewer.k0.setVisibility(8);
                            photoViewer.k0.setAlpha(0.0f);
                            photoViewer.k0.setBackgroundColor(photoViewer.d2 == 11 ? -16777216 : 2130706432);
                        }
                        photoViewer.U7.setVisibility(4);
                        photoViewer.V7.setVisibility(4);
                        AnimatorSet animatorSet2 = photoViewer.a8;
                        jo0 jo0Var = photoViewer.Q0;
                        Property property2 = View.TRANSLATION_Y;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(jo0Var, (Property<jo0, Float>) property2, 0.0f), ObjectAnimator.ofFloat(photoViewer.Q0, (Property<jo0, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(photoViewer.T0, (Property<jh3, Float>) property2, 0.0f));
                    }
                    photoViewer.a8.addListener(new l48(this, (byte) 11));
                    photoViewer.a8.setDuration(200L);
                    photoViewer.a8.setInterpolator(gl.F);
                    photoViewer.a8.start();
                    break;
                }
                break;
        }
    }
}
