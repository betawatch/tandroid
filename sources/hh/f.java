package hh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import dg.y2;
import gg.y1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.qb;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.s50;
import org.telegram.ui.fl;
import org.telegram.ui.lm;
import org.telegram.ui.vx;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                qb qbVar = jVar.T;
                if (qbVar != null) {
                    int[] iArr = j.a0;
                    qbVar.getLocationInWindow(iArr);
                    float f10 = iArr[0];
                    float translationY = iArr[1] - jVar.T.getTranslationY();
                    qb qbVar2 = jVar.T;
                    float topOffset = translationY + (qbVar2.top ? qbVar2.getTopOffset() : -qbVar2.getBottomOffset());
                    jVar.a.getLocationInWindow(iArr);
                    float f11 = iArr[0];
                    float f12 = iArr[1];
                    jVar.U = (jVar.T.a.getMeasuredWidth() / 2.0f) + (f10 - f11) + jVar.T.a.getLeft();
                    jVar.V = (jVar.T.a.getMeasuredHeight() / 2.0f) + (topOffset - f12) + jVar.T.a.getTop();
                }
                jVar.c();
                return true;
            case 1:
                zn znVar = ((lm) obj2).N;
                s1 s1Var = (s1) obj;
                PipRoundVideoView pipRoundVideoView = PipRoundVideoView.C;
                if (pipRoundVideoView != null) {
                    pipRoundVideoView.e(true);
                }
                s1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageReceiver photoImage = s1Var.getPhotoImage();
                float imageWidth = photoImage.getImageWidth();
                rk0 cameraRect = znVar.Y2.getCameraRect();
                float f13 = imageWidth / cameraRect.c;
                s1Var.getTransitionParams().x0 = true;
                s1Var.setAlpha(0.0f);
                s1Var.setTimeAlpha(0.0f);
                int[] iArr2 = {(int) ((photoImage.getImageX() - s1Var.getAnimationOffsetX()) + r11), (int) (((photoImage.getImageY() + s1Var.getPaddingTop()) - s1Var.getTranslationY()) + r11)};
                s1Var.getLocationOnScreen(iArr2);
                float f14 = iArr2[0];
                float f15 = iArr2[1];
                s50 cameraContainer = znVar.Y2.getCameraContainer();
                cameraContainer.setPivotX(0.0f);
                cameraContainer.setPivotY(0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                cameraContainer.setImageReceiver(photoImage);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<s50, Float>) View.SCALE_X, f13);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<s50, Float>) View.SCALE_Y, f13);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cameraContainer, (Property<s50, Float>) View.TRANSLATION_Y, iArr2[1] - cameraRect.b);
                View buttonsLayout = znVar.Y2.getButtonsLayout();
                Property property = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(buttonsLayout, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(znVar.Y2.getPaint(), n6.b, 0), ObjectAnimator.ofFloat(znVar.Y2.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                animatorSet.setInterpolator(mr.h);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cameraContainer, (Property<s50, Float>) View.TRANSLATION_X, iArr2[0] - cameraRect.a);
                ofFloat4.setInterpolator(mr.f);
                animatorSet2.playTogether(ofFloat4, animatorSet);
                animatorSet2.setDuration(300L);
                fl flVar = znVar.Y2;
                if (flVar != null) {
                    flVar.setIsMessageTransition(true);
                }
                animatorSet2.addListener(new y2(11, this, cameraContainer));
                animatorSet2.start();
                return true;
            default:
                ((vx) obj2).b.b0[0].a.getViewTreeObserver().removeOnPreDrawListener(this);
                AndroidUtilities.runOnUIThread((y1) obj, 100L);
                return false;
        }
    }
}
