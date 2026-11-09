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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class jl implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Cells.q1 b;
    public final /* synthetic */ ll c;

    public /* synthetic */ jl(ll llVar, org.telegram.ui.Cells.q1 q1Var, int i7) {
        this.a = i7;
        this.c = llVar;
        this.b = q1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i7 = this.a;
        int i10 = 3;
        org.telegram.ui.Cells.q1 q1Var = this.b;
        ll llVar = this.c;
        switch (i7) {
            case 0:
                cn cnVar = llVar.Q;
                PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
                if (pipRoundVideoView != null) {
                    pipRoundVideoView.e(true);
                }
                q1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageReceiver photoImage = q1Var.getPhotoImage();
                float f10 = photoImage.M0;
                RectF cameraRect = cnVar.p3.getCameraRect();
                float width = f10 / cameraRect.width();
                q1Var.getTransitionParams().y0 = true;
                q1Var.setAlpha(0.0f);
                q1Var.setTimeAlpha(0.0f);
                int[] iArr = {(int) ((photoImage.K0 - q1Var.getAnimationOffsetX()) + r12), (int) (((photoImage.L0 + q1Var.getPaddingTop()) - q1Var.getTranslationY()) + r12)};
                q1Var.getLocationOnScreen(iArr);
                float f11 = iArr[0];
                float f12 = iArr[1];
                org.telegram.ui.Components.r40 cameraContainer = cnVar.p3.getCameraContainer();
                cameraContainer.getLocationOnScreen(new int[2]);
                cameraContainer.setPivotX(cameraRect.left - r12[0]);
                cameraContainer.setPivotY(cameraRect.top - r12[1]);
                AnimatorSet animatorSet = new AnimatorSet();
                cameraContainer.setImageReceiver(photoImage);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.r40, Float>) View.SCALE_X, width);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.r40, Float>) View.SCALE_Y, width);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.r40, Float>) View.TRANSLATION_Y, iArr[1] - cameraRect.top);
                View buttonsLayout = cnVar.p3.getButtonsLayout();
                Property property = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(buttonsLayout, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(cnVar.p3.getPaint(), org.telegram.ui.Components.m6.b, 0), ObjectAnimator.ofFloat(cnVar.p3.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.xq.h);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.r40, Float>) View.TRANSLATION_X, iArr[0] - cameraRect.left);
                ofFloat4.setInterpolator(org.telegram.ui.Components.xq.f);
                animatorSet2.playTogether(ofFloat4, animatorSet);
                animatorSet2.setDuration(300L);
                org.telegram.ui.Components.u40 u40Var = cnVar.p3;
                if (u40Var != null) {
                    u40Var.setIsMessageTransition(true);
                }
                animatorSet2.addListener(new ah.l(17, this, cameraContainer));
                animatorSet2.start();
                break;
            default:
                cn cnVar2 = llVar.Q;
                q1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.messenger.ej ejVar = q1Var.getMessageObject().L1;
                if (ejVar != null) {
                    cnVar2.D6.add(q1Var);
                    ImageReceiver photoImage2 = q1Var.getPhotoImage();
                    float f13 = ejVar.h ? 1.0f : ejVar.c / photoImage2.M0;
                    int[] iArr2 = new int[2];
                    q1Var.getTransitionParams().y0 = true;
                    q1Var.getLocationInWindow(iArr2);
                    iArr2[1] = (int) (iArr2[1] - q1Var.getTranslationY());
                    if (cnVar2.Z.z0()) {
                        iArr2[1] = org.telegram.messenger.g0.L(48.0f) + iArr2[1];
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    q0 q0Var = new q0("p1", i10);
                    kl klVar = new kl(this, 0);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(ejVar, q0Var, f13, 1.0f), ObjectAnimator.ofFloat(ejVar, new kl(this, 1), 0.0f, 1.0f));
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(ejVar, klVar, ejVar.a, iArr2[0] + (ejVar.h ? 0.0f : photoImage2.r())), animatorSet4);
                    animatorSet3.setInterpolator(org.telegram.ui.Components.xq.h);
                    animatorSet3.setDuration(460L);
                    animatorSet3.addListener(new va(this, 7));
                    animatorSet3.start();
                    kl klVar2 = new kl(this, 2);
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(ejVar, klVar2, 0.0f, 1.0f));
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
