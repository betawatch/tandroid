package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class hp0 extends c61 {
    public final /* synthetic */ kp0 e2;
    public final /* synthetic */ t51[] f2;
    public final /* synthetic */ lp0 g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp0(lp0 lp0Var, org.telegram.ui.ActionBar.r2 r2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.u6 u6Var, int i11, int i12, kp0 kp0Var, t51[] t51VarArr) {
        super(r2Var, context, true, num, i10, true, u6Var, i11, i12);
        this.g2 = lp0Var;
        this.e2 = kp0Var;
        this.f2 = t51VarArr;
    }

    @Override // org.telegram.ui.c61
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.c61
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        lp0 lp0Var = this.g2;
        if (tL_starGiftUnique != null) {
            if (lp0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (!(peerColor instanceof TLRPC.TL_peerColorCollectible)) {
                    return;
                }
                lp0Var.s = (TLRPC.TL_peerColorCollectible) peerColor;
                lp0Var.r = null;
            } else {
                lp0Var.s = null;
                lp0Var.r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            lp0Var.I = null;
            lp0Var.h = -1;
        } else {
            lp0Var.n = l4 == null ? 0L : l4.longValue();
            lp0Var.r = null;
            lp0Var.s = null;
            lp0Var.I = null;
        }
        kp0 kp0Var = this.e2;
        if (kp0Var != null) {
            kp0Var.b(true);
        }
        lp0Var.j(true);
        lp0Var.i();
        lp0Var.f(true);
        t51 t51Var = this.f2[0];
        if (t51Var != null) {
            lp0Var.o0 = null;
            t51Var.dismiss();
        }
    }
}
