package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class po0 extends d61 {
    public final /* synthetic */ so0 Z1;
    public final /* synthetic */ u51[] a2;
    public final /* synthetic */ to0 b2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po0(to0 to0Var, org.telegram.ui.ActionBar.o2 o2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11, int i12, so0 so0Var, u51[] u51VarArr) {
        super(o2Var, context, true, num, i10, true, c6Var, i11, i12);
        this.b2 = to0Var;
        this.Z1 = so0Var;
        this.a2 = u51VarArr;
    }

    @Override // org.telegram.ui.d61
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.d61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        to0 to0Var = this.b2;
        if (tL_starGiftUnique != null) {
            if (to0Var.c0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (!(peerColor instanceof TLRPC.TL_peerColorCollectible)) {
                    return;
                }
                to0Var.v = (TLRPC.TL_peerColorCollectible) peerColor;
                to0Var.s = null;
            } else {
                to0Var.v = null;
                to0Var.s = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            to0Var.y = null;
            to0Var.n = -1;
        } else {
            to0Var.r = l10 == null ? 0L : l10.longValue();
            to0Var.s = null;
            to0Var.v = null;
            to0Var.y = null;
        }
        so0 so0Var = this.Z1;
        if (so0Var != null) {
            so0Var.b(true);
        }
        to0Var.i(true);
        to0Var.h();
        to0Var.f();
        u51 u51Var = this.a2[0];
        if (u51Var != null) {
            to0Var.e0 = null;
            u51Var.dismiss();
        }
    }
}
