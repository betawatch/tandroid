package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class jp0 extends f61 {
    public final /* synthetic */ mp0 e2;
    public final /* synthetic */ w51[] f2;
    public final /* synthetic */ np0 g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp0(np0 np0Var, org.telegram.ui.ActionBar.r2 r2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.u6 u6Var, int i11, int i12, mp0 mp0Var, w51[] w51VarArr) {
        super(r2Var, context, true, num, i10, true, u6Var, i11, i12);
        this.g2 = np0Var;
        this.e2 = mp0Var;
        this.f2 = w51VarArr;
    }

    @Override // org.telegram.ui.f61
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.f61
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        np0 np0Var = this.g2;
        if (tL_starGiftUnique != null) {
            if (np0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (!(peerColor instanceof TLRPC.TL_peerColorCollectible)) {
                    return;
                }
                np0Var.s = (TLRPC.TL_peerColorCollectible) peerColor;
                np0Var.r = null;
            } else {
                np0Var.s = null;
                np0Var.r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            np0Var.I = null;
            np0Var.h = -1;
        } else {
            np0Var.n = l4 == null ? 0L : l4.longValue();
            np0Var.r = null;
            np0Var.s = null;
            np0Var.I = null;
        }
        mp0 mp0Var = this.e2;
        if (mp0Var != null) {
            mp0Var.b(true);
        }
        np0Var.j(true);
        np0Var.i();
        np0Var.f(true);
        w51 w51Var = this.f2[0];
        if (w51Var != null) {
            np0Var.o0 = null;
            w51Var.dismiss();
        }
    }
}
