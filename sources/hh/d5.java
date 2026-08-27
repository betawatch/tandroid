package hh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d5 extends AnimatorListenerAdapter {
    public final /* synthetic */ e5 a;

    public d5(e5 e5Var) {
        this.a = e5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        e5 e5Var = this.a;
        f2.r rVar = e5Var.e0;
        e5Var.o0 = e5Var.n0;
        e5Var.d(e5Var.Q);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = e5Var.e;
        int i10 = 2 - e5Var.n0;
        stargiftattributemodelArr[i10] = (TL_stars.starGiftAttributeModel) e5Var.S.f;
        oa.Z0(e5Var.d[i10].getImageReceiver(), stargiftattributemodelArr[2 - e5Var.n0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) e5Var.T.f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.k5 m10 = org.telegram.ui.Components.k5.m(UserConfig.selectedAccount, 7, stargiftattributepattern.document);
            m10.m = true;
            m10.v();
        }
        AndroidUtilities.cancelRunOnUIThread(rVar);
        AndroidUtilities.runOnUIThread(rVar, 2500L);
    }
}
