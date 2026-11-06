package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class d7 extends AnimatorListenerAdapter {
    public final /* synthetic */ e7 a;

    public d7(e7 e7Var) {
        this.a = e7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        e7 e7Var = this.a;
        a3.f fVar = e7Var.l0;
        e7Var.v0 = e7Var.u0;
        e7Var.d(e7Var.a0);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = e7Var.e;
        int i7 = 2 - e7Var.u0;
        stargiftattributemodelArr[i7] = (TL_stars.starGiftAttributeModel) e7Var.c0.f;
        dd.c1(e7Var.d[i7].getImageReceiver(), stargiftattributemodelArr[2 - e7Var.u0].document, qs.q2);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) e7Var.d0.f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.i5 l10 = org.telegram.ui.Components.i5.l(p10.s0, 7, stargiftattributepattern.document);
            l10.m = true;
            l10.u();
        }
        org.telegram.messenger.g0.r(fVar);
        org.telegram.messenger.g0.i3(fVar, 2500L);
    }
}
