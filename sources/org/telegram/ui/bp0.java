package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class bp0 extends b61 {
    public final /* synthetic */ ep0 e2;
    public final /* synthetic */ s51[] f2;
    public final /* synthetic */ fp0 g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp0(fp0 fp0Var, org.telegram.ui.ActionBar.o2 o2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11, int i12, ep0 ep0Var, s51[] s51VarArr) {
        super(o2Var, context, true, num, i10, true, g6Var, i11, i12);
        this.g2 = fp0Var;
        this.e2 = ep0Var;
        this.f2 = s51VarArr;
    }

    @Override // org.telegram.ui.b61
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.b61
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        fp0 fp0Var = this.g2;
        if (tL_starGiftUnique != null) {
            if (fp0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (!(peerColor instanceof TLRPC.TL_peerColorCollectible)) {
                    return;
                }
                fp0Var.s = (TLRPC.TL_peerColorCollectible) peerColor;
                fp0Var.r = null;
            } else {
                fp0Var.s = null;
                fp0Var.r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            fp0Var.I = null;
            fp0Var.h = -1;
        } else {
            fp0Var.n = l4 == null ? 0L : l4.longValue();
            fp0Var.r = null;
            fp0Var.s = null;
            fp0Var.I = null;
        }
        ep0 ep0Var = this.e2;
        if (ep0Var != null) {
            ep0Var.b(true);
        }
        fp0Var.j(true);
        fp0Var.i();
        fp0Var.f(true);
        s51 s51Var = this.f2[0];
        if (s51Var != null) {
            fp0Var.o0 = null;
            s51Var.dismiss();
        }
    }
}
