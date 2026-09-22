package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class mm implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ org.telegram.ui.Cells.t1 a;
    public final /* synthetic */ nm b;

    public mm(nm nmVar, org.telegram.ui.Cells.t1 t1Var) {
        this.b = nmVar;
        this.a = t1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        bo boVar = this.b.Q;
        org.telegram.ui.Cells.t1 t1Var = this.a;
        t1Var.getViewTreeObserver().removeOnPreDrawListener(this);
        MessageObject.SendAnimationData sendAnimationData = t1Var.getMessageObject().sendAnimationData;
        if (sendAnimationData == null) {
            return true;
        }
        boVar.n6.add(t1Var);
        ImageReceiver photoImage = t1Var.getPhotoImage();
        float imageWidth = sendAnimationData.fromPreview ? 1.0f : sendAnimationData.width / photoImage.getImageWidth();
        int[] iArr = new int[2];
        t1Var.getTransitionParams().x0 = true;
        t1Var.getLocationInWindow(iArr);
        iArr[1] = (int) (iArr[1] - t1Var.getTranslationY());
        if (boVar.Y.A0()) {
            iArr[1] = AndroidUtilities.dp(48.0f) + iArr[1];
        }
        AnimatorSet animatorSet = new AnimatorSet();
        im imVar = new im("p1", 0);
        jm jmVar = new jm(this);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(sendAnimationData, imVar, imageWidth, 1.0f), ObjectAnimator.ofFloat(sendAnimationData, new km(this), 0.0f, 1.0f));
        animatorSet.playTogether(ObjectAnimator.ofFloat(sendAnimationData, jmVar, sendAnimationData.x, iArr[0] + (sendAnimationData.fromPreview ? 0.0f : photoImage.getCenterX())), animatorSet2);
        animatorSet.setInterpolator(org.telegram.ui.Components.qr.h);
        animatorSet.setDuration(460L);
        animatorSet.addListener(new t4(this, 22));
        animatorSet.start();
        lm lmVar = new lm(this);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(ObjectAnimator.ofFloat(sendAnimationData, lmVar, 0.0f, 1.0f));
        animatorSet3.setDuration(100L);
        animatorSet3.setStartDelay(150L);
        animatorSet3.setInterpolator(new DecelerateInterpolator());
        animatorSet3.start();
        return true;
    }
}
