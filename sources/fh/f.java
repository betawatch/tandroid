package fh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import bg.c3;
import eg.z1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.m50;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.ub;
import org.telegram.ui.em;
import org.telegram.ui.kx;
import org.telegram.ui.tn;
import org.telegram.ui.xk;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class f implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i10 = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                ((ViewTreeObserver) obj).removeOnPreDrawListener(this);
                j jVar = (j) obj2;
                ub ubVar = jVar.S;
                if (ubVar != null) {
                    int[] iArr = j.Z;
                    ubVar.getLocationInWindow(iArr);
                    float f9 = iArr[0];
                    float translationY = iArr[1] - jVar.S.getTranslationY();
                    ub ubVar2 = jVar.S;
                    float topOffset = translationY + (ubVar2.top ? ubVar2.getTopOffset() : -ubVar2.getBottomOffset());
                    jVar.a.getLocationInWindow(iArr);
                    float f10 = iArr[0];
                    float f11 = iArr[1];
                    jVar.T = (jVar.S.a.getMeasuredWidth() / 2.0f) + (f9 - f10) + jVar.S.a.getLeft();
                    jVar.U = (jVar.S.a.getMeasuredHeight() / 2.0f) + (topOffset - f11) + jVar.S.a.getTop();
                }
                jVar.c();
                return true;
            case 1:
                tn tnVar = ((em) obj2).M;
                s1 s1Var = (s1) obj;
                PipRoundVideoView pipRoundVideoView = PipRoundVideoView.B;
                if (pipRoundVideoView != null) {
                    pipRoundVideoView.e(true);
                }
                s1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageReceiver photoImage = s1Var.getPhotoImage();
                float imageWidth = photoImage.getImageWidth();
                hk0 cameraRect = tnVar.X2.getCameraRect();
                float f12 = imageWidth / cameraRect.c;
                s1Var.getTransitionParams().x0 = true;
                s1Var.setAlpha(0.0f);
                s1Var.setTimeAlpha(0.0f);
                int[] iArr2 = {(int) ((photoImage.getImageX() - s1Var.getAnimationOffsetX()) + r11), (int) (((photoImage.getImageY() + s1Var.getPaddingTop()) - s1Var.getTranslationY()) + r11)};
                s1Var.getLocationOnScreen(iArr2);
                float f13 = iArr2[0];
                float f14 = iArr2[1];
                m50 cameraContainer = tnVar.X2.getCameraContainer();
                cameraContainer.setPivotX(0.0f);
                cameraContainer.setPivotY(0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                cameraContainer.setImageReceiver(photoImage);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<m50, Float>) View.SCALE_X, f12);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<m50, Float>) View.SCALE_Y, f12);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cameraContainer, (Property<m50, Float>) View.TRANSLATION_Y, iArr2[1] - cameraRect.b);
                View buttonsLayout = tnVar.X2.getButtonsLayout();
                Property property = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(buttonsLayout, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(tnVar.X2.getPaint(), r6.b, 0), ObjectAnimator.ofFloat(tnVar.X2.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                animatorSet.setInterpolator(jr.h);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cameraContainer, (Property<m50, Float>) View.TRANSLATION_X, iArr2[0] - cameraRect.a);
                ofFloat4.setInterpolator(jr.f);
                animatorSet2.playTogether(ofFloat4, animatorSet);
                animatorSet2.setDuration(300L);
                xk xkVar = tnVar.X2;
                if (xkVar != null) {
                    xkVar.setIsMessageTransition(true);
                }
                animatorSet2.addListener(new c3(15, this, cameraContainer));
                animatorSet2.start();
                return true;
            default:
                ((kx) obj2).b.a0[0].a.getViewTreeObserver().removeOnPreDrawListener(this);
                AndroidUtilities.runOnUIThread((z1) obj, 100L);
                return false;
        }
    }
}
