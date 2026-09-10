package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.PipRoundVideoView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class jm implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jm(int i10, Object obj, Object obj2) {
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
                eo eoVar = ((pm) obj).Q;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj2;
                PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
                if (pipRoundVideoView != null) {
                    pipRoundVideoView.e(true);
                }
                t1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageReceiver photoImage = t1Var.getPhotoImage();
                float imageWidth = photoImage.getImageWidth();
                org.telegram.ui.Components.rk0 cameraRect = eoVar.b3.getCameraRect();
                float f7 = imageWidth / cameraRect.c;
                t1Var.getTransitionParams().x0 = true;
                t1Var.setAlpha(0.0f);
                t1Var.setTimeAlpha(0.0f);
                int[] iArr = {(int) ((photoImage.getImageX() - t1Var.getAnimationOffsetX()) + r11), (int) (((photoImage.getImageY() + t1Var.getPaddingTop()) - t1Var.getTranslationY()) + r11)};
                t1Var.getLocationOnScreen(iArr);
                float f10 = iArr[0];
                float f11 = iArr[1];
                org.telegram.ui.Components.z50 cameraContainer = eoVar.b3.getCameraContainer();
                cameraContainer.setPivotX(0.0f);
                cameraContainer.setPivotY(0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                cameraContainer.setImageReceiver(photoImage);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.z50, Float>) View.SCALE_X, f7);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.z50, Float>) View.SCALE_Y, f7);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.z50, Float>) View.TRANSLATION_Y, iArr[1] - cameraRect.b);
                View buttonsLayout = eoVar.b3.getButtonsLayout();
                Property property = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(buttonsLayout, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(eoVar.b3.getPaint(), org.telegram.ui.Components.r6.b, 0), ObjectAnimator.ofFloat(eoVar.b3.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.wr.h);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.z50, Float>) View.TRANSLATION_X, iArr[0] - cameraRect.a);
                ofFloat4.setInterpolator(org.telegram.ui.Components.wr.f);
                animatorSet2.playTogether(ofFloat4, animatorSet);
                animatorSet2.setDuration(300L);
                il ilVar = eoVar.b3;
                if (ilVar != null) {
                    ilVar.setIsMessageTransition(true);
                }
                animatorSet2.addListener(new bi.u3(12, this, cameraContainer));
                animatorSet2.start();
                return true;
            case 1:
                ((cy) obj).b.e0[0].a.getViewTreeObserver().removeOnPreDrawListener(this);
                AndroidUtilities.runOnUIThread((bi.va) obj2, 100L);
                return false;
            default:
                ((ViewTreeObserver) obj2).removeOnPreDrawListener(this);
                th.i iVar = (th.i) obj;
                org.telegram.ui.Components.xb xbVar = iVar.W;
                if (xbVar != null) {
                    int[] iArr2 = th.i.d0;
                    xbVar.getLocationInWindow(iArr2);
                    float f12 = iArr2[0];
                    float translationY = iArr2[1] - iVar.W.getTranslationY();
                    org.telegram.ui.Components.xb xbVar2 = iVar.W;
                    float topOffset = xbVar2.top ? xbVar2.getTopOffset() : -xbVar2.getBottomOffset();
                    iVar.a.getLocationInWindow(iArr2);
                    float f13 = iArr2[0];
                    float f14 = iArr2[1];
                    iVar.X = (iVar.W.a.getMeasuredWidth() / 2.0f) + (f12 - f13) + iVar.W.a.getLeft();
                    iVar.Y = (iVar.W.a.getMeasuredHeight() / 2.0f) + ((translationY + topOffset) - f14) + iVar.W.a.getTop();
                }
                iVar.c();
                return true;
        }
    }
}
