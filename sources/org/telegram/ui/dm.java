package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class dm implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ org.telegram.ui.Cells.s1 a;
    public final /* synthetic */ em b;

    public dm(em emVar, org.telegram.ui.Cells.s1 s1Var) {
        this.b = emVar;
        this.a = s1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        tn tnVar = this.b.M;
        org.telegram.ui.Cells.s1 s1Var = this.a;
        s1Var.getViewTreeObserver().removeOnPreDrawListener(this);
        MessageObject.SendAnimationData sendAnimationData = s1Var.getMessageObject().sendAnimationData;
        if (sendAnimationData == null) {
            return true;
        }
        tnVar.j6.add(s1Var);
        ImageReceiver photoImage = s1Var.getPhotoImage();
        float imageWidth = sendAnimationData.fromPreview ? 1.0f : sendAnimationData.width / photoImage.getImageWidth();
        int[] iArr = new int[2];
        s1Var.getTransitionParams().x0 = true;
        s1Var.getLocationInWindow(iArr);
        iArr[1] = (int) (iArr[1] - s1Var.getTranslationY());
        if (tnVar.U.z0()) {
            iArr[1] = AndroidUtilities.dp(48.0f) + iArr[1];
        }
        AnimatorSet animatorSet = new AnimatorSet();
        int i10 = 0;
        yl ylVar = new yl("p1", 0);
        zl zlVar = new zl(this);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(sendAnimationData, ylVar, imageWidth, 1.0f), ObjectAnimator.ofFloat(sendAnimationData, new am(this), 0.0f, 1.0f));
        animatorSet.playTogether(ObjectAnimator.ofFloat(sendAnimationData, zlVar, sendAnimationData.x, iArr[0] + (sendAnimationData.fromPreview ? 0.0f : photoImage.getCenterX())), animatorSet2);
        animatorSet.setInterpolator(org.telegram.ui.Components.jr.h);
        animatorSet.setDuration(460L);
        animatorSet.addListener(new bm(this, i10));
        animatorSet.start();
        cm cmVar = new cm(this);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(ObjectAnimator.ofFloat(sendAnimationData, cmVar, 0.0f, 1.0f));
        animatorSet3.setDuration(100L);
        animatorSet3.setStartDelay(150L);
        animatorSet3.setInterpolator(new DecelerateInterpolator());
        animatorSet3.start();
        return true;
    }
}
