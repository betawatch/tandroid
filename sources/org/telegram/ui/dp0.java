package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class dp0 extends x61 {
    public final /* synthetic */ gp0 a2;
    public final /* synthetic */ n61[] b2;
    public final /* synthetic */ hp0 c2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dp0(hp0 hp0Var, org.telegram.ui.ActionBar.p2 p2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11, int i12, gp0 gp0Var, n61[] n61VarArr) {
        super(p2Var, context, true, num, i10, true, f6Var, i11, i12);
        this.c2 = hp0Var;
        this.a2 = gp0Var;
        this.b2 = n61VarArr;
    }

    @Override // org.telegram.ui.x61
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.x61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        hp0 hp0Var = this.c2;
        if (tL_starGiftUnique != null) {
            if (hp0Var.j0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (!(peerColor instanceof TLRPC.TL_peerColorCollectible)) {
                    return;
                }
                hp0Var.s = (TLRPC.TL_peerColorCollectible) peerColor;
                hp0Var.r = null;
            } else {
                hp0Var.s = null;
                hp0Var.r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            hp0Var.F = null;
            hp0Var.h = -1;
        } else {
            hp0Var.n = l10 == null ? 0L : l10.longValue();
            hp0Var.r = null;
            hp0Var.s = null;
            hp0Var.F = null;
        }
        gp0 gp0Var = this.a2;
        if (gp0Var != null) {
            gp0Var.b(true);
        }
        hp0Var.j(true);
        hp0Var.i();
        hp0Var.f(true);
        n61 n61Var = this.b2[0];
        if (n61Var != null) {
            hp0Var.l0 = null;
            n61Var.dismiss();
        }
    }
}
