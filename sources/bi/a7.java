package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class a7 extends AnimatorListenerAdapter {
    public final /* synthetic */ b7 a;

    public a7(b7 b7Var) {
        this.a = b7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        b7 b7Var = this.a;
        u6 u6Var = b7Var.l0;
        b7Var.v0 = b7Var.u0;
        b7Var.d(b7Var.a0);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = b7Var.e;
        int i10 = 2 - b7Var.u0;
        stargiftattributemodelArr[i10] = (TL_stars.starGiftAttributeModel) b7Var.c0.f;
        dd.Y0(b7Var.d[i10].getImageReceiver(), stargiftattributemodelArr[2 - b7Var.u0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) b7Var.d0.f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.t5 m10 = org.telegram.ui.Components.t5.m(UserConfig.selectedAccount, 7, stargiftattributepattern.document);
            m10.m = true;
            m10.v();
        }
        AndroidUtilities.cancelRunOnUIThread(u6Var);
        AndroidUtilities.runOnUIThread(u6Var, 2500L);
    }
}
