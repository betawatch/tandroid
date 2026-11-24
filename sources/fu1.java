// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.RectF;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.q;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fu1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rc2 b;
    public final /* synthetic */ hu1 c;

    public /* synthetic */ fu1(hu1 hu1Var, rc2 rc2Var, byte b) {
        this.a = b;
        this.c = hu1Var;
        this.b = rc2Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        byte b = this.a;
        rc2 rc2Var = this.b;
        hu1 hu1Var = this.c;
        switch (b) {
            case 0:
                yv1 yv1Var = hu1Var.R;
                PipRoundVideoView pipRoundVideoView = PipRoundVideoView.G;
                if (pipRoundVideoView != null) {
                    pipRoundVideoView.e(true);
                }
                rc2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageReceiver photoImage = rc2Var.getPhotoImage();
                float f = photoImage.N0;
                RectF cameraRect = yv1Var.q3.getCameraRect();
                float width = f / cameraRect.width();
                rc2Var.getTransitionParams().y0 = true;
                rc2Var.setAlpha(0.0f);
                rc2Var.setTimeAlpha(0.0f);
                int[] iArr = {(int) ((photoImage.L0 - rc2Var.getAnimationOffsetX()) + r12), (int) (((photoImage.M0 + rc2Var.getPaddingTop()) - rc2Var.getTranslationY()) + r12)};
                rc2Var.getLocationOnScreen(iArr);
                float f2 = iArr[0];
                float f3 = iArr[1];
                wq5 cameraContainer = yv1Var.q3.getCameraContainer();
                cameraContainer.getLocationOnScreen(new int[2]);
                cameraContainer.setPivotX(cameraRect.left - r12[0]);
                cameraContainer.setPivotY(cameraRect.top - r12[1]);
                AnimatorSet animatorSet = new AnimatorSet();
                cameraContainer.setImageReceiver(photoImage);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<wq5, Float>) View.SCALE_X, width);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<wq5, Float>) View.SCALE_Y, width);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cameraContainer, (Property<wq5, Float>) View.TRANSLATION_Y, iArr[1] - cameraRect.top);
                View buttonsLayout = yv1Var.q3.getButtonsLayout();
                Property property = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(buttonsLayout, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(yv1Var.q3.getPaint(), so.b, 0), ObjectAnimator.ofFloat(yv1Var.q3.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                animatorSet.setInterpolator(d53.h);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cameraContainer, (Property<wq5, Float>) View.TRANSLATION_X, iArr[0] - cameraRect.left);
                ofFloat4.setInterpolator(d53.f);
                animatorSet2.playTogether(ofFloat4, animatorSet);
                animatorSet2.setDuration(300L);
                q qVar = yv1Var.q3;
                if (qVar != null) {
                    qVar.setIsMessageTransition(true);
                }
                animatorSet2.addListener(new u5(this, cameraContainer, (byte) 8));
                animatorSet2.start();
                break;
            default:
                yv1 yv1Var2 = hu1Var.R;
                rc2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                g47 g47Var = rc2Var.getMessageObject().N1;
                if (g47Var != null) {
                    yv1Var2.F6.add(rc2Var);
                    ImageReceiver photoImage2 = rc2Var.getPhotoImage();
                    float f4 = g47Var.h ? 1.0f : g47Var.c / photoImage2.N0;
                    int[] iArr2 = new int[2];
                    rc2Var.getTransitionParams().y0 = true;
                    rc2Var.getLocationInWindow(iArr2);
                    iArr2[1] = (int) (iArr2[1] - rc2Var.getTranslationY());
                    if (yv1Var2.a0.Y0()) {
                        iArr2[1] = gm.L(48.0f) + iArr2[1];
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    pn pnVar = new pn("p1", (byte) 8);
                    gu1 gu1Var = new gu1(this, (byte) 0);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(g47Var, pnVar, f4, 1.0f), ObjectAnimator.ofFloat(g47Var, new gu1(this, (byte) 1), 0.0f, 1.0f));
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(g47Var, gu1Var, g47Var.a, iArr2[0] + (g47Var.h ? 0.0f : photoImage2.r())), animatorSet4);
                    animatorSet3.setInterpolator(d53.h);
                    animatorSet3.setDuration(460L);
                    animatorSet3.addListener(new b91((Object) this, (byte) 10));
                    animatorSet3.start();
                    gu1 gu1Var2 = new gu1(this, (byte) 2);
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(g47Var, gu1Var2, 0.0f, 1.0f));
                    animatorSet5.setDuration(100L);
                    animatorSet5.setStartDelay(150L);
                    animatorSet5.setInterpolator(new DecelerateInterpolator());
                    animatorSet5.start();
                    break;
                }
                break;
        }
        return true;
    }
}
