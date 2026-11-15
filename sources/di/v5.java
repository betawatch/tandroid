package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class v5 extends AnimatorListenerAdapter {
    public final /* synthetic */ w5 a;

    public v5(w5 w5Var) {
        this.a = w5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        w5 w5Var = this.a;
        ch.w wVar = w5Var.m0;
        w5Var.w0 = w5Var.v0;
        w5Var.d(w5Var.b0);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = w5Var.e;
        int i7 = 2 - w5Var.v0;
        stargiftattributemodelArr[i7] = (TL_stars.starGiftAttributeModel) w5Var.d0.f;
        mb.c1(w5Var.d[i7].getImageReceiver(), stargiftattributemodelArr[2 - w5Var.v0].document, ns.q2);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) w5Var.e0.f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.g5 l10 = org.telegram.ui.Components.g5.l(m10.t0, 7, stargiftattributepattern.document);
            l10.m = true;
            l10.u();
        }
        org.telegram.messenger.g0.r(wVar);
        org.telegram.messenger.g0.i3(wVar, 2500L);
    }
}
