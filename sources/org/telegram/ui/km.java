package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class km implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ org.telegram.ui.Cells.s1 a;
    public final /* synthetic */ lm b;

    public km(lm lmVar, org.telegram.ui.Cells.s1 s1Var) {
        this.b = lmVar;
        this.a = s1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        zn znVar = this.b.N;
        org.telegram.ui.Cells.s1 s1Var = this.a;
        s1Var.getViewTreeObserver().removeOnPreDrawListener(this);
        MessageObject.SendAnimationData sendAnimationData = s1Var.getMessageObject().sendAnimationData;
        if (sendAnimationData == null) {
            return true;
        }
        znVar.k6.add(s1Var);
        ImageReceiver photoImage = s1Var.getPhotoImage();
        float imageWidth = sendAnimationData.fromPreview ? 1.0f : sendAnimationData.width / photoImage.getImageWidth();
        int[] iArr = new int[2];
        s1Var.getTransitionParams().x0 = true;
        s1Var.getLocationInWindow(iArr);
        iArr[1] = (int) (iArr[1] - s1Var.getTranslationY());
        if (znVar.V.z0()) {
            iArr[1] = AndroidUtilities.dp(48.0f) + iArr[1];
        }
        AnimatorSet animatorSet = new AnimatorSet();
        gm gmVar = new gm("p1", 0);
        hm hmVar = new hm(this);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(sendAnimationData, gmVar, imageWidth, 1.0f), ObjectAnimator.ofFloat(sendAnimationData, new im(this), 0.0f, 1.0f));
        animatorSet.playTogether(ObjectAnimator.ofFloat(sendAnimationData, hmVar, sendAnimationData.x, iArr[0] + (sendAnimationData.fromPreview ? 0.0f : photoImage.getCenterX())), animatorSet2);
        animatorSet.setInterpolator(org.telegram.ui.Components.mr.h);
        animatorSet.setDuration(460L);
        animatorSet.addListener(new u5(this, 21));
        animatorSet.start();
        jm jmVar = new jm(this);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(ObjectAnimator.ofFloat(sendAnimationData, jmVar, 0.0f, 1.0f));
        animatorSet3.setDuration(100L);
        animatorSet3.setStartDelay(150L);
        animatorSet3.setInterpolator(new DecelerateInterpolator());
        animatorSet3.start();
        return true;
    }
}
