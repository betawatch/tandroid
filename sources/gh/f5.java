package gh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f5 extends AnimatorListenerAdapter {
    public final /* synthetic */ g5 a;

    public f5(g5 g5Var) {
        this.a = g5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g5 g5Var = this.a;
        fh.o1 o1Var = g5Var.e0;
        g5Var.o0 = g5Var.n0;
        g5Var.d(g5Var.Q);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = g5Var.e;
        int i9 = 2 - g5Var.n0;
        stargiftattributemodelArr[i9] = (TL_stars.starGiftAttributeModel) g5Var.S.f;
        oa.Z0(g5Var.d[i9].getImageReceiver(), stargiftattributemodelArr[2 - g5Var.n0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) g5Var.T.f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.k5 m10 = org.telegram.ui.Components.k5.m(UserConfig.selectedAccount, 7, stargiftattributepattern.document);
            m10.m = true;
            m10.v();
        }
        AndroidUtilities.cancelRunOnUIThread(o1Var);
        AndroidUtilities.runOnUIThread(o1Var, 2500L);
    }
}
