package ch;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import bg.i2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.ob;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.y40;
import org.telegram.ui.bm;
import org.telegram.ui.ix;
import org.telegram.ui.qn;
import org.telegram.ui.uk;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class f implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i9 = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i9) {
            case 0:
                ((ViewTreeObserver) obj).removeOnPreDrawListener(this);
                j jVar = (j) obj2;
                ob obVar = jVar.S;
                if (obVar != null) {
                    int[] iArr = j.Z;
                    obVar.getLocationInWindow(iArr);
                    float f10 = iArr[0];
                    float translationY = iArr[1] - jVar.S.getTranslationY();
                    ob obVar2 = jVar.S;
                    float topOffset = translationY + (obVar2.top ? obVar2.getTopOffset() : -obVar2.getBottomOffset());
                    jVar.a.getLocationInWindow(iArr);
                    float f11 = iArr[0];
                    float f12 = iArr[1];
                    jVar.T = (jVar.S.a.getMeasuredWidth() / 2.0f) + (f10 - f11) + jVar.S.a.getLeft();
                    jVar.U = (jVar.S.a.getMeasuredHeight() / 2.0f) + (topOffset - f12) + jVar.S.a.getTop();
                }
                jVar.c();
                return true;
            case 1:
                qn qnVar = ((bm) obj2).M;
                t1 t1Var = (t1) obj;
                PipRoundVideoView pipRoundVideoView = PipRoundVideoView.B;
                if (pipRoundVideoView != null) {
                    pipRoundVideoView.e(true);
                }
                t1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageReceiver photoImage = t1Var.getPhotoImage();
                float imageWidth = photoImage.getImageWidth();
                wj0 cameraRect = qnVar.X2.getCameraRect();
                float f13 = imageWidth / cameraRect.c;
                t1Var.getTransitionParams().x0 = true;
                t1Var.setAlpha(0.0f);
                t1Var.setTimeAlpha(0.0f);
                int[] iArr2 = {(int) ((photoImage.getImageX() - t1Var.getAnimationOffsetX()) + r11), (int) (((photoImage.getImageY() + t1Var.getPaddingTop()) - t1Var.getTranslationY()) + r11)};
                t1Var.getLocationOnScreen(iArr2);
                float f14 = iArr2[0];
                float f15 = iArr2[1];
                y40 cameraContainer = qnVar.X2.getCameraContainer();
                cameraContainer.setPivotX(0.0f);
                cameraContainer.setPivotY(0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                cameraContainer.setImageReceiver(photoImage);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<y40, Float>) View.SCALE_X, f13);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<y40, Float>) View.SCALE_Y, f13);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cameraContainer, (Property<y40, Float>) View.TRANSLATION_Y, iArr2[1] - cameraRect.b);
                View buttonsLayout = qnVar.X2.getButtonsLayout();
                Property property = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(buttonsLayout, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(qnVar.X2.getPaint(), m6.b, 0), ObjectAnimator.ofFloat(qnVar.X2.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                animatorSet.setInterpolator(gr.h);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cameraContainer, (Property<y40, Float>) View.TRANSLATION_X, iArr2[0] - cameraRect.a);
                ofFloat4.setInterpolator(gr.f);
                animatorSet2.playTogether(ofFloat4, animatorSet);
                animatorSet2.setDuration(300L);
                uk ukVar = qnVar.X2;
                if (ukVar != null) {
                    ukVar.setIsMessageTransition(true);
                }
                animatorSet2.addListener(new fg.j(12, this, cameraContainer));
                animatorSet2.start();
                return true;
            default:
                ((ix) obj2).b.a0[0].a.getViewTreeObserver().removeOnPreDrawListener(this);
                AndroidUtilities.runOnUIThread((i2) obj, 100L);
                return false;
        }
    }
}
