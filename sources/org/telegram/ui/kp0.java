package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class kp0 extends z61 {
    public final /* synthetic */ np0 d2;
    public final /* synthetic */ q61[] e2;
    public final /* synthetic */ op0 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp0(op0 op0Var, org.telegram.ui.ActionBar.n2 n2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11, int i12, np0 np0Var, q61[] q61VarArr) {
        super(n2Var, context, true, num, i10, true, d6Var, i11, i12);
        this.f2 = op0Var;
        this.d2 = np0Var;
        this.e2 = q61VarArr;
    }

    @Override // org.telegram.ui.z61
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.z61
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        op0 op0Var = this.f2;
        if (tL_starGiftUnique != null) {
            if (op0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (!(peerColor instanceof TLRPC.TL_peerColorCollectible)) {
                    return;
                }
                op0Var.s = (TLRPC.TL_peerColorCollectible) peerColor;
                op0Var.r = null;
            } else {
                op0Var.s = null;
                op0Var.r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            op0Var.I = null;
            op0Var.h = -1;
        } else {
            op0Var.n = l4 == null ? 0L : l4.longValue();
            op0Var.r = null;
            op0Var.s = null;
            op0Var.I = null;
        }
        np0 np0Var = this.d2;
        if (np0Var != null) {
            np0Var.b(true);
        }
        op0Var.j(true);
        op0Var.i();
        op0Var.f(true);
        q61 q61Var = this.e2[0];
        if (q61Var != null) {
            op0Var.o0 = null;
            q61Var.dismiss();
        }
    }
}
