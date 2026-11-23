package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class y5 extends AnimatorListenerAdapter {
    public final /* synthetic */ z5 a;

    public y5(z5 z5Var) {
        this.a = z5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        z5 z5Var = this.a;
        ca.r rVar = z5Var.p0;
        z5Var.z0 = z5Var.y0;
        z5Var.d(z5Var.b0);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = z5Var.e;
        int i7 = 2 - z5Var.y0;
        stargiftattributemodelArr[i7] = (TL_stars.starGiftAttributeModel) z5Var.d0.f;
        pb.d1(z5Var.d[i7].getImageReceiver(), stargiftattributemodelArr[2 - z5Var.y0].document, ls.q2);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) z5Var.e0.f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.p5 l10 = org.telegram.ui.Components.p5.l(k10.t0, 7, stargiftattributepattern.document);
            l10.m = true;
            l10.u();
        }
        org.telegram.messenger.g0.r(rVar);
        org.telegram.messenger.g0.h3(rVar, 2500L);
    }
}
