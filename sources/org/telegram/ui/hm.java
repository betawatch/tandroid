package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.PipRoundVideoView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class hm implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hm(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i10 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                bo boVar = ((nm) obj).Q;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj2;
                PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
                if (pipRoundVideoView != null) {
                    pipRoundVideoView.e(true);
                }
                t1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageReceiver photoImage = t1Var.getPhotoImage();
                float imageWidth = photoImage.getImageWidth();
                org.telegram.ui.Components.hk0 cameraRect = boVar.b3.getCameraRect();
                float f7 = imageWidth / cameraRect.c;
                t1Var.getTransitionParams().x0 = true;
                t1Var.setAlpha(0.0f);
                t1Var.setTimeAlpha(0.0f);
                int[] iArr = {(int) ((photoImage.getImageX() - t1Var.getAnimationOffsetX()) + r11), (int) (((photoImage.getImageY() + t1Var.getPaddingTop()) - t1Var.getTranslationY()) + r11)};
                t1Var.getLocationOnScreen(iArr);
                float f10 = iArr[0];
                float f11 = iArr[1];
                org.telegram.ui.Components.p50 cameraContainer = boVar.b3.getCameraContainer();
                cameraContainer.setPivotX(0.0f);
                cameraContainer.setPivotY(0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                cameraContainer.setImageReceiver(photoImage);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.p50, Float>) View.SCALE_X, f7);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.p50, Float>) View.SCALE_Y, f7);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.p50, Float>) View.TRANSLATION_Y, iArr[1] - cameraRect.b);
                View buttonsLayout = boVar.b3.getButtonsLayout();
                Property property = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(buttonsLayout, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(boVar.b3.getPaint(), org.telegram.ui.Components.q6.b, 0), ObjectAnimator.ofFloat(boVar.b3.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.qr.h);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.p50, Float>) View.TRANSLATION_X, iArr[0] - cameraRect.a);
                ofFloat4.setInterpolator(org.telegram.ui.Components.qr.f);
                animatorSet2.playTogether(ofFloat4, animatorSet);
                animatorSet2.setDuration(300L);
                gl glVar = boVar.b3;
                if (glVar != null) {
                    glVar.setIsMessageTransition(true);
                }
                animatorSet2.addListener(new ai.z(14, this, cameraContainer));
                animatorSet2.start();
                return true;
            case 1:
                ((zx) obj).b.e0[0].a.getViewTreeObserver().removeOnPreDrawListener(this);
                AndroidUtilities.runOnUIThread((ai.j) obj2, 100L);
                return false;
            default:
                ((ViewTreeObserver) obj2).removeOnPreDrawListener(this);
                uh.h hVar = (uh.h) obj;
                org.telegram.ui.Components.wb wbVar = hVar.W;
                if (wbVar != null) {
                    int[] iArr2 = uh.h.d0;
                    wbVar.getLocationInWindow(iArr2);
                    float f12 = iArr2[0];
                    float translationY = iArr2[1] - hVar.W.getTranslationY();
                    org.telegram.ui.Components.wb wbVar2 = hVar.W;
                    float topOffset = wbVar2.top ? wbVar2.getTopOffset() : -wbVar2.getBottomOffset();
                    hVar.a.getLocationInWindow(iArr2);
                    float f13 = iArr2[0];
                    float f14 = iArr2[1];
                    hVar.X = (hVar.W.a.getMeasuredWidth() / 2.0f) + (f12 - f13) + hVar.W.a.getLeft();
                    hVar.Y = (hVar.W.a.getMeasuredHeight() / 2.0f) + ((translationY + topOffset) - f14) + hVar.W.a.getTop();
                }
                hVar.c();
                return true;
        }
    }
}
