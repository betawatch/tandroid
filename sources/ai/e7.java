package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class e7 extends AnimatorListenerAdapter {
    public final /* synthetic */ f7 a;

    public e7(f7 f7Var) {
        this.a = f7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        f7 f7Var = this.a;
        a3.d dVar = f7Var.l0;
        f7Var.v0 = f7Var.u0;
        f7Var.d(f7Var.a0);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = f7Var.e;
        int i10 = 2 - f7Var.u0;
        stargiftattributemodelArr[i10] = (TL_stars.starGiftAttributeModel) f7Var.c0.f;
        nd.a1(f7Var.d[i10].getImageReceiver(), stargiftattributemodelArr[2 - f7Var.u0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) f7Var.d0.f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.r5 m10 = org.telegram.ui.Components.r5.m(UserConfig.selectedAccount, 7, stargiftattributepattern.document);
            m10.m = true;
            m10.v();
        }
        AndroidUtilities.cancelRunOnUIThread(dVar);
        AndroidUtilities.runOnUIThread(dVar, 2500L);
    }
}
