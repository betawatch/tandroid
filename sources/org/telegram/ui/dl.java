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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class dl implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Cells.q1 b;
    public final /* synthetic */ fl c;

    public /* synthetic */ dl(fl flVar, org.telegram.ui.Cells.q1 q1Var, int i3) {
        this.a = i3;
        this.c = flVar;
        this.b = q1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i3 = this.a;
        int i10 = 3;
        org.telegram.ui.Cells.q1 q1Var = this.b;
        fl flVar = this.c;
        switch (i3) {
            case 0:
                wm wmVar = flVar.R;
                PipRoundVideoView pipRoundVideoView = PipRoundVideoView.G;
                if (pipRoundVideoView != null) {
                    pipRoundVideoView.e(true);
                }
                q1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageReceiver photoImage = q1Var.getPhotoImage();
                float f10 = photoImage.N0;
                RectF cameraRect = wmVar.q3.getCameraRect();
                float width = f10 / cameraRect.width();
                q1Var.getTransitionParams().y0 = true;
                q1Var.setAlpha(0.0f);
                q1Var.setTimeAlpha(0.0f);
                int[] iArr = {(int) ((photoImage.L0 - q1Var.getAnimationOffsetX()) + r12), (int) (((photoImage.M0 + q1Var.getPaddingTop()) - q1Var.getTranslationY()) + r12)};
                q1Var.getLocationOnScreen(iArr);
                float f11 = iArr[0];
                float f12 = iArr[1];
                org.telegram.ui.Components.m40 cameraContainer = wmVar.q3.getCameraContainer();
                cameraContainer.getLocationOnScreen(new int[2]);
                cameraContainer.setPivotX(cameraRect.left - r12[0]);
                cameraContainer.setPivotY(cameraRect.top - r12[1]);
                AnimatorSet animatorSet = new AnimatorSet();
                cameraContainer.setImageReceiver(photoImage);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.m40, Float>) View.SCALE_X, width);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.m40, Float>) View.SCALE_Y, width);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.m40, Float>) View.TRANSLATION_Y, iArr[1] - cameraRect.top);
                View buttonsLayout = wmVar.q3.getButtonsLayout();
                Property property = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(buttonsLayout, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(wmVar.q3.getPaint(), org.telegram.ui.Components.k6.b, 0), ObjectAnimator.ofFloat(wmVar.q3.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.xq.h);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.m40, Float>) View.TRANSLATION_X, iArr[0] - cameraRect.left);
                ofFloat4.setInterpolator(org.telegram.ui.Components.xq.f);
                animatorSet2.playTogether(ofFloat4, animatorSet);
                animatorSet2.setDuration(300L);
                org.telegram.ui.Components.p40 p40Var = wmVar.q3;
                if (p40Var != null) {
                    p40Var.setIsMessageTransition(true);
                }
                animatorSet2.addListener(new bh.j(16, this, cameraContainer));
                animatorSet2.start();
                break;
            default:
                wm wmVar2 = flVar.R;
                q1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.messenger.vi viVar = q1Var.getMessageObject().L1;
                if (viVar != null) {
                    wmVar2.E6.add(q1Var);
                    ImageReceiver photoImage2 = q1Var.getPhotoImage();
                    float f13 = viVar.h ? 1.0f : viVar.c / photoImage2.N0;
                    int[] iArr2 = new int[2];
                    q1Var.getTransitionParams().y0 = true;
                    q1Var.getLocationInWindow(iArr2);
                    iArr2[1] = (int) (iArr2[1] - q1Var.getTranslationY());
                    if (wmVar2.a0.y0()) {
                        iArr2[1] = org.telegram.messenger.g0.L(48.0f) + iArr2[1];
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    r0 r0Var = new r0("p1", i10);
                    el elVar = new el(this, 0);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(viVar, r0Var, f13, 1.0f), ObjectAnimator.ofFloat(viVar, new el(this, 1), 0.0f, 1.0f));
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(viVar, elVar, viVar.a, iArr2[0] + (viVar.h ? 0.0f : photoImage2.r())), animatorSet4);
                    animatorSet3.setInterpolator(org.telegram.ui.Components.xq.h);
                    animatorSet3.setDuration(460L);
                    animatorSet3.addListener(new org.telegram.ui.Cells.w9(this, 8));
                    animatorSet3.start();
                    el elVar2 = new el(this, 2);
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(viVar, elVar2, 0.0f, 1.0f));
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
