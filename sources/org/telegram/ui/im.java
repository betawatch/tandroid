package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class im implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ org.telegram.ui.Cells.t1 a;
    public final /* synthetic */ jm b;

    public im(jm jmVar, org.telegram.ui.Cells.t1 t1Var) {
        this.b = jmVar;
        this.a = t1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        xn xnVar = this.b.N;
        org.telegram.ui.Cells.t1 t1Var = this.a;
        t1Var.getViewTreeObserver().removeOnPreDrawListener(this);
        MessageObject.SendAnimationData sendAnimationData = t1Var.getMessageObject().sendAnimationData;
        if (sendAnimationData == null) {
            return true;
        }
        xnVar.k6.add(t1Var);
        ImageReceiver photoImage = t1Var.getPhotoImage();
        float imageWidth = sendAnimationData.fromPreview ? 1.0f : sendAnimationData.width / photoImage.getImageWidth();
        int[] iArr = new int[2];
        t1Var.getTransitionParams().x0 = true;
        t1Var.getLocationInWindow(iArr);
        iArr[1] = (int) (iArr[1] - t1Var.getTranslationY());
        if (xnVar.V.z0()) {
            iArr[1] = AndroidUtilities.dp(48.0f) + iArr[1];
        }
        AnimatorSet animatorSet = new AnimatorSet();
        em emVar = new em("p1", 0);
        fm fmVar = new fm(this);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(sendAnimationData, emVar, imageWidth, 1.0f), ObjectAnimator.ofFloat(sendAnimationData, new gm(this), 0.0f, 1.0f));
        animatorSet.playTogether(ObjectAnimator.ofFloat(sendAnimationData, fmVar, sendAnimationData.x, iArr[0] + (sendAnimationData.fromPreview ? 0.0f : photoImage.getCenterX())), animatorSet2);
        animatorSet.setInterpolator(org.telegram.ui.Components.nr.h);
        animatorSet.setDuration(460L);
        animatorSet.addListener(new s5(this, 21));
        animatorSet.start();
        hm hmVar = new hm(this);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(ObjectAnimator.ofFloat(sendAnimationData, hmVar, 0.0f, 1.0f));
        animatorSet3.setDuration(100L);
        animatorSet3.setStartDelay(150L);
        animatorSet3.setInterpolator(new DecelerateInterpolator());
        animatorSet3.start();
        return true;
    }
}
