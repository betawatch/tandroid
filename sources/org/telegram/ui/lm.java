package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class lm implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ org.telegram.ui.Cells.u1 a;
    public final /* synthetic */ mm b;

    public lm(mm mmVar, org.telegram.ui.Cells.u1 u1Var) {
        this.b = mmVar;
        this.a = u1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        zn znVar = this.b.Q;
        org.telegram.ui.Cells.u1 u1Var = this.a;
        u1Var.getViewTreeObserver().removeOnPreDrawListener(this);
        MessageObject.SendAnimationData sendAnimationData = u1Var.getMessageObject().sendAnimationData;
        if (sendAnimationData == null) {
            return true;
        }
        znVar.n6.add(u1Var);
        ImageReceiver photoImage = u1Var.getPhotoImage();
        float imageWidth = sendAnimationData.fromPreview ? 1.0f : sendAnimationData.width / photoImage.getImageWidth();
        int[] iArr = new int[2];
        u1Var.getTransitionParams().x0 = true;
        u1Var.getLocationInWindow(iArr);
        iArr[1] = (int) (iArr[1] - u1Var.getTranslationY());
        if (znVar.Y.x0()) {
            iArr[1] = AndroidUtilities.dp(48.0f) + iArr[1];
        }
        AnimatorSet animatorSet = new AnimatorSet();
        hm hmVar = new hm("p1", 0);
        im imVar = new im(this);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(sendAnimationData, hmVar, imageWidth, 1.0f), ObjectAnimator.ofFloat(sendAnimationData, new jm(this), 0.0f, 1.0f));
        animatorSet.playTogether(ObjectAnimator.ofFloat(sendAnimationData, imVar, sendAnimationData.x, iArr[0] + (sendAnimationData.fromPreview ? 0.0f : photoImage.getCenterX())), animatorSet2);
        animatorSet.setInterpolator(org.telegram.ui.Components.hs.h);
        animatorSet.setDuration(460L);
        animatorSet.addListener(new t4(this, 22));
        animatorSet.start();
        km kmVar = new km(this);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(ObjectAnimator.ofFloat(sendAnimationData, kmVar, 0.0f, 1.0f));
        animatorSet3.setDuration(100L);
        animatorSet3.setStartDelay(150L);
        animatorSet3.setInterpolator(new DecelerateInterpolator());
        animatorSet3.start();
        return true;
    }
}
