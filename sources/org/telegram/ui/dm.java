package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.RectF;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.PipRoundVideoView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class dm implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Cells.q1 b;
    public final /* synthetic */ fm c;

    public /* synthetic */ dm(fm fmVar, org.telegram.ui.Cells.q1 q1Var, int i10) {
        this.a = i10;
        this.c = fmVar;
        this.b = q1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i10 = this.a;
        int i11 = 3;
        org.telegram.ui.Cells.q1 q1Var = this.b;
        fm fmVar = this.c;
        switch (i10) {
            case 0:
                un unVar = fmVar.Q;
                PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
                if (pipRoundVideoView != null) {
                    pipRoundVideoView.e(true);
                }
                q1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageReceiver photoImage = q1Var.getPhotoImage();
                float f7 = photoImage.M0;
                RectF cameraRect = unVar.p3.getCameraRect();
                float width = f7 / cameraRect.width();
                q1Var.getTransitionParams().y0 = true;
                q1Var.setAlpha(0.0f);
                q1Var.setTimeAlpha(0.0f);
                int[] iArr = {(int) ((photoImage.K0 - q1Var.getAnimationOffsetX()) + r12), (int) (((photoImage.L0 + q1Var.getPaddingTop()) - q1Var.getTranslationY()) + r12)};
                q1Var.getLocationOnScreen(iArr);
                float f10 = iArr[0];
                float f11 = iArr[1];
                org.telegram.ui.Components.g50 cameraContainer = unVar.p3.getCameraContainer();
                cameraContainer.getLocationOnScreen(new int[2]);
                cameraContainer.setPivotX(cameraRect.left - r12[0]);
                cameraContainer.setPivotY(cameraRect.top - r12[1]);
                AnimatorSet animatorSet = new AnimatorSet();
                cameraContainer.setImageReceiver(photoImage);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.g50, Float>) View.SCALE_X, width);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.g50, Float>) View.SCALE_Y, width);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.g50, Float>) View.TRANSLATION_Y, iArr[1] - cameraRect.top);
                View buttonsLayout = unVar.p3.getButtonsLayout();
                Property property = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(buttonsLayout, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(unVar.p3.getPaint(), org.telegram.ui.Components.i6.b, 0), ObjectAnimator.ofFloat(unVar.p3.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.gr.h);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.g50, Float>) View.TRANSLATION_X, iArr[0] - cameraRect.left);
                ofFloat4.setInterpolator(org.telegram.ui.Components.gr.f);
                animatorSet2.playTogether(ofFloat4, animatorSet);
                animatorSet2.setDuration(300L);
                org.telegram.ui.Components.j50 j50Var = unVar.p3;
                if (j50Var != null) {
                    j50Var.setIsMessageTransition(true);
                }
                animatorSet2.addListener(new bg.f(12, this, cameraContainer));
                animatorSet2.start();
                break;
            default:
                un unVar2 = fmVar.Q;
                q1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.messenger.fj fjVar = q1Var.getMessageObject().L1;
                if (fjVar != null) {
                    unVar2.D6.add(q1Var);
                    ImageReceiver photoImage2 = q1Var.getPhotoImage();
                    float f12 = fjVar.h ? 1.0f : fjVar.c / photoImage2.M0;
                    int[] iArr2 = new int[2];
                    q1Var.getTransitionParams().y0 = true;
                    q1Var.getLocationInWindow(iArr2);
                    iArr2[1] = (int) (iArr2[1] - q1Var.getTranslationY());
                    if (unVar2.Z.x0()) {
                        iArr2[1] = org.telegram.messenger.i0.L(48.0f) + iArr2[1];
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    s0 s0Var = new s0("p1", i11);
                    em emVar = new em(this, 0);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(fjVar, s0Var, f12, 1.0f), ObjectAnimator.ofFloat(fjVar, new em(this, 1), 0.0f, 1.0f));
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(fjVar, emVar, fjVar.a, iArr2[0] + (fjVar.h ? 0.0f : photoImage2.r())), animatorSet4);
                    animatorSet3.setInterpolator(org.telegram.ui.Components.gr.h);
                    animatorSet3.setDuration(460L);
                    animatorSet3.addListener(new s9(this, 19));
                    animatorSet3.start();
                    em emVar2 = new em(this, 2);
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(fjVar, emVar2, 0.0f, 1.0f));
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
