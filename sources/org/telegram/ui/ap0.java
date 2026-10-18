package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class ap0 extends z51 {
    public final /* synthetic */ dp0 d2;
    public final /* synthetic */ q51[] e2;
    public final /* synthetic */ ep0 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap0(ep0 ep0Var, org.telegram.ui.ActionBar.n2 n2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11, int i12, dp0 dp0Var, q51[] q51VarArr) {
        super(n2Var, context, true, num, i10, true, d6Var, i11, i12);
        this.f2 = ep0Var;
        this.d2 = dp0Var;
        this.e2 = q51VarArr;
    }

    @Override // org.telegram.ui.z51
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.z51
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        ep0 ep0Var = this.f2;
        if (tL_starGiftUnique != null) {
            if (ep0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (!(peerColor instanceof TLRPC.TL_peerColorCollectible)) {
                    return;
                }
                ep0Var.s = (TLRPC.TL_peerColorCollectible) peerColor;
                ep0Var.r = null;
            } else {
                ep0Var.s = null;
                ep0Var.r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            ep0Var.I = null;
            ep0Var.h = -1;
        } else {
            ep0Var.n = l4 == null ? 0L : l4.longValue();
            ep0Var.r = null;
            ep0Var.s = null;
            ep0Var.I = null;
        }
        dp0 dp0Var = this.d2;
        if (dp0Var != null) {
            dp0Var.b(true);
        }
        ep0Var.j(true);
        ep0Var.i();
        ep0Var.f(true);
        q51 q51Var = this.e2[0];
        if (q51Var != null) {
            ep0Var.o0 = null;
            q51Var.dismiss();
        }
    }
}
