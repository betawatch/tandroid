package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e6 extends AnimatorListenerAdapter {
    public final /* synthetic */ f6 a;

    public e6(f6 f6Var) {
        this.a = f6Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        f6 f6Var = this.a;
        d1 d1Var = f6Var.m0;
        f6Var.w0 = f6Var.v0;
        f6Var.d(f6Var.b0);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = f6Var.e;
        int i3 = 2 - f6Var.v0;
        stargiftattributemodelArr[i3] = (TL_stars.starGiftAttributeModel) f6Var.d0.f;
        wb.c1(f6Var.d[i3].getImageReceiver(), stargiftattributemodelArr[2 - f6Var.v0].document, hs.q2);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) f6Var.e0.f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.g5 l10 = org.telegram.ui.Components.g5.l(h10.t0, 7, stargiftattributepattern.document);
            l10.m = true;
            l10.u();
        }
        org.telegram.messenger.g0.r(d1Var);
        org.telegram.messenger.g0.i3(d1Var, 2500L);
    }
}
