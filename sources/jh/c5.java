package jh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class c5 extends AnimatorListenerAdapter {
    public final /* synthetic */ d5 a;

    public c5(d5 d5Var) {
        this.a = d5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        d5 d5Var = this.a;
        o oVar = d5Var.e0;
        d5Var.o0 = d5Var.n0;
        d5Var.d(d5Var.Q);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = d5Var.e;
        int i10 = 2 - d5Var.n0;
        stargiftattributemodelArr[i10] = (TL_stars.starGiftAttributeModel) d5Var.S.f;
        ia.Z0(d5Var.d[i10].getImageReceiver(), stargiftattributemodelArr[2 - d5Var.n0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) d5Var.T.f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.p5 m10 = org.telegram.ui.Components.p5.m(UserConfig.selectedAccount, 7, stargiftattributepattern.document);
            m10.m = true;
            m10.v();
        }
        AndroidUtilities.cancelRunOnUIThread(oVar);
        AndroidUtilities.runOnUIThread(oVar, 2500L);
    }
}
