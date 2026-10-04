package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class mp0 extends c71 {
    public final /* synthetic */ pp0 d2;
    public final /* synthetic */ t61[] e2;
    public final /* synthetic */ qp0 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mp0(qp0 qp0Var, org.telegram.ui.ActionBar.n2 n2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11, int i12, pp0 pp0Var, t61[] t61VarArr) {
        super(n2Var, context, true, num, i10, true, d6Var, i11, i12);
        this.f2 = qp0Var;
        this.d2 = pp0Var;
        this.e2 = t61VarArr;
    }

    @Override // org.telegram.ui.c71
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.c71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        qp0 qp0Var = this.f2;
        if (tL_starGiftUnique != null) {
            if (qp0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (!(peerColor instanceof TLRPC.TL_peerColorCollectible)) {
                    return;
                }
                qp0Var.s = (TLRPC.TL_peerColorCollectible) peerColor;
                qp0Var.r = null;
            } else {
                qp0Var.s = null;
                qp0Var.r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            qp0Var.I = null;
            qp0Var.h = -1;
        } else {
            qp0Var.n = l4 == null ? 0L : l4.longValue();
            qp0Var.r = null;
            qp0Var.s = null;
            qp0Var.I = null;
        }
        pp0 pp0Var = this.d2;
        if (pp0Var != null) {
            pp0Var.b(true);
        }
        qp0Var.j(true);
        qp0Var.i();
        qp0Var.f(true);
        t61 t61Var = this.e2[0];
        if (t61Var != null) {
            qp0Var.o0 = null;
            t61Var.dismiss();
        }
    }
}
