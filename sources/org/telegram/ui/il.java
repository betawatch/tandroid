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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class il implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Cells.r1 b;
    public final /* synthetic */ kl c;

    public /* synthetic */ il(kl klVar, org.telegram.ui.Cells.r1 r1Var, int i7) {
        this.a = i7;
        this.c = klVar;
        this.b = r1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i7 = this.a;
        int i10 = 3;
        org.telegram.ui.Cells.r1 r1Var = this.b;
        kl klVar = this.c;
        switch (i7) {
            case 0:
                bn bnVar = klVar.R;
                PipRoundVideoView pipRoundVideoView = PipRoundVideoView.G;
                if (pipRoundVideoView != null) {
                    pipRoundVideoView.e(true);
                }
                r1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageReceiver photoImage = r1Var.getPhotoImage();
                float f10 = photoImage.N0;
                RectF cameraRect = bnVar.q3.getCameraRect();
                float width = f10 / cameraRect.width();
                r1Var.getTransitionParams().y0 = true;
                r1Var.setAlpha(0.0f);
                r1Var.setTimeAlpha(0.0f);
                int[] iArr = {(int) ((photoImage.L0 - r1Var.getAnimationOffsetX()) + r12), (int) (((photoImage.M0 + r1Var.getPaddingTop()) - r1Var.getTranslationY()) + r12)};
                r1Var.getLocationOnScreen(iArr);
                float f11 = iArr[0];
                float f12 = iArr[1];
                org.telegram.ui.Components.b50 cameraContainer = bnVar.q3.getCameraContainer();
                cameraContainer.getLocationOnScreen(new int[2]);
                cameraContainer.setPivotX(cameraRect.left - r12[0]);
                cameraContainer.setPivotY(cameraRect.top - r12[1]);
                AnimatorSet animatorSet = new AnimatorSet();
                cameraContainer.setImageReceiver(photoImage);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.b50, Float>) View.SCALE_X, width);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.b50, Float>) View.SCALE_Y, width);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.b50, Float>) View.TRANSLATION_Y, iArr[1] - cameraRect.top);
                View buttonsLayout = bnVar.q3.getButtonsLayout();
                Property property = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(buttonsLayout, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(bnVar.q3.getPaint(), org.telegram.ui.Components.q6.b, 0), ObjectAnimator.ofFloat(bnVar.q3.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.lr.h);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.b50, Float>) View.TRANSLATION_X, iArr[0] - cameraRect.left);
                ofFloat4.setInterpolator(org.telegram.ui.Components.lr.f);
                animatorSet2.playTogether(ofFloat4, animatorSet);
                animatorSet2.setDuration(300L);
                org.telegram.ui.Components.e50 e50Var = bnVar.q3;
                if (e50Var != null) {
                    e50Var.setIsMessageTransition(true);
                }
                animatorSet2.addListener(new ah.l(17, this, cameraContainer));
                animatorSet2.start();
                break;
            default:
                bn bnVar2 = klVar.R;
                r1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.messenger.bj bjVar = r1Var.getMessageObject().N1;
                if (bjVar != null) {
                    bnVar2.F6.add(r1Var);
                    ImageReceiver photoImage2 = r1Var.getPhotoImage();
                    float f13 = bjVar.h ? 1.0f : bjVar.c / photoImage2.N0;
                    int[] iArr2 = new int[2];
                    r1Var.getTransitionParams().y0 = true;
                    r1Var.getLocationInWindow(iArr2);
                    iArr2[1] = (int) (iArr2[1] - r1Var.getTranslationY());
                    if (bnVar2.a0.V0()) {
                        iArr2[1] = org.telegram.messenger.g0.L(48.0f) + iArr2[1];
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    q0 q0Var = new q0("p1", i10);
                    jl jlVar = new jl(this, 0);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(bjVar, q0Var, f13, 1.0f), ObjectAnimator.ofFloat(bjVar, new jl(this, 1), 0.0f, 1.0f));
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(bjVar, jlVar, bjVar.a, iArr2[0] + (bjVar.h ? 0.0f : photoImage2.r())), animatorSet4);
                    animatorSet3.setInterpolator(org.telegram.ui.Components.lr.h);
                    animatorSet3.setDuration(460L);
                    animatorSet3.addListener(new org.telegram.ui.Cells.y9(this, 8));
                    animatorSet3.start();
                    jl jlVar2 = new jl(this, 2);
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(bjVar, jlVar2, 0.0f, 1.0f));
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
