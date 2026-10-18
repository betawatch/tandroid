package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class d7 extends AnimatorListenerAdapter {
    public final /* synthetic */ e7 a;

    public d7(e7 e7Var) {
        this.a = e7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        e7 e7Var = this.a;
        a3.d dVar = e7Var.j0;
        e7Var.t0 = e7Var.s0;
        e7Var.d(e7Var.V);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = e7Var.e;
        int i10 = 2 - e7Var.s0;
        stargiftattributemodelArr[i10] = (TL_stars.starGiftAttributeModel) e7Var.a0.f;
        md.a1(e7Var.d[i10].getImageReceiver(), stargiftattributemodelArr[2 - e7Var.s0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) e7Var.b0.f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.r5 m10 = org.telegram.ui.Components.r5.m(UserConfig.selectedAccount, 7, stargiftattributepattern.document);
            m10.m = true;
            m10.v();
        }
        AndroidUtilities.cancelRunOnUIThread(dVar);
        AndroidUtilities.runOnUIThread(dVar, 2500L);
    }
}
