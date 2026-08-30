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
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.qb;
import org.telegram.ui.Components.r50;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.dl;
import org.telegram.ui.jm;
import org.telegram.ui.tx;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                xn xnVar = ((jm) obj2).N;
                t1 t1Var = (t1) obj;
                PipRoundVideoView pipRoundVideoView = PipRoundVideoView.C;
                if (pipRoundVideoView != null) {
                    pipRoundVideoView.e(true);
                }
                t1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageReceiver photoImage = t1Var.getPhotoImage();
                float imageWidth = photoImage.getImageWidth();
                sk0 cameraRect = xnVar.Y2.getCameraRect();
                float f13 = imageWidth / cameraRect.c;
                t1Var.getTransitionParams().x0 = true;
                t1Var.setAlpha(0.0f);
                t1Var.setTimeAlpha(0.0f);
                int[] iArr2 = {(int) ((photoImage.getImageX() - t1Var.getAnimationOffsetX()) + r11), (int) (((photoImage.getImageY() + t1Var.getPaddingTop()) - t1Var.getTranslationY()) + r11)};
                t1Var.getLocationOnScreen(iArr2);
                float f14 = iArr2[0];
                float f15 = iArr2[1];
                r50 cameraContainer = xnVar.Y2.getCameraContainer();
                cameraContainer.setPivotX(0.0f);
                cameraContainer.setPivotY(0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                cameraContainer.setImageReceiver(photoImage);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<r50, Float>) View.SCALE_X, f13);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<r50, Float>) View.SCALE_Y, f13);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cameraContainer, (Property<r50, Float>) View.TRANSLATION_Y, iArr2[1] - cameraRect.b);
                View buttonsLayout = xnVar.Y2.getButtonsLayout();
                Property property = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(buttonsLayout, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(xnVar.Y2.getPaint(), n6.b, 0), ObjectAnimator.ofFloat(xnVar.Y2.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                animatorSet.setInterpolator(nr.h);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cameraContainer, (Property<r50, Float>) View.TRANSLATION_X, iArr2[0] - cameraRect.a);
                ofFloat4.setInterpolator(nr.f);
                animatorSet2.playTogether(ofFloat4, animatorSet);
                animatorSet2.setDuration(300L);
                dl dlVar = xnVar.Y2;
                if (dlVar != null) {
                    dlVar.setIsMessageTransition(true);
                }
                animatorSet2.addListener(new y2(11, this, cameraContainer));
                animatorSet2.start();
                return true;
            default:
                ((tx) obj2).b.b0[0].a.getViewTreeObserver().removeOnPreDrawListener(this);
                AndroidUtilities.runOnUIThread((y1) obj, 100L);
                return false;
        }
    }
}
