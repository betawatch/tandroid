package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class im implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ org.telegram.ui.Cells.u1 a;
    public final /* synthetic */ jm b;

    public im(jm jmVar, org.telegram.ui.Cells.u1 u1Var) {
        this.b = jmVar;
        this.a = u1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        wn wnVar = this.b.Q;
        org.telegram.ui.Cells.u1 u1Var = this.a;
        u1Var.getViewTreeObserver().removeOnPreDrawListener(this);
        MessageObject.SendAnimationData sendAnimationData = u1Var.getMessageObject().sendAnimationData;
        if (sendAnimationData == null) {
            return true;
        }
        wnVar.n6.add(u1Var);
        ImageReceiver photoImage = u1Var.getPhotoImage();
        float imageWidth = sendAnimationData.fromPreview ? 1.0f : sendAnimationData.width / photoImage.getImageWidth();
        int[] iArr = new int[2];
        u1Var.getTransitionParams().x0 = true;
        u1Var.getLocationInWindow(iArr);
        iArr[1] = (int) (iArr[1] - u1Var.getTranslationY());
        if (wnVar.Y.z0()) {
            iArr[1] = AndroidUtilities.dp(48.0f) + iArr[1];
        }
        AnimatorSet animatorSet = new AnimatorSet();
        em emVar = new em("p1", 0);
        fm fmVar = new fm(this);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(sendAnimationData, emVar, imageWidth, 1.0f), ObjectAnimator.ofFloat(sendAnimationData, new gm(this), 0.0f, 1.0f));
        animatorSet.playTogether(ObjectAnimator.ofFloat(sendAnimationData, fmVar, sendAnimationData.x, iArr[0] + (sendAnimationData.fromPreview ? 0.0f : photoImage.getCenterX())), animatorSet2);
        animatorSet.setInterpolator(org.telegram.ui.Components.rr.h);
        animatorSet.setDuration(460L);
        animatorSet.addListener(new t4(this, 22));
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
