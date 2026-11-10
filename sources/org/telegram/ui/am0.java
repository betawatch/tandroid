package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class am0 extends t11 {
    public final /* synthetic */ dm0 e2;
    public final /* synthetic */ k11[] f2;
    public final /* synthetic */ em0 g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am0(em0 em0Var, org.telegram.ui.ActionBar.f2 f2Var, Context context, Integer num, int i7, org.telegram.ui.ActionBar.h6 h6Var, int i10, int i11, dm0 dm0Var, k11[] k11VarArr) {
        super(f2Var, context, true, num, i7, true, h6Var, i10, i11);
        this.g2 = em0Var;
        this.e2 = dm0Var;
        this.f2 = k11VarArr;
    }

    @Override // org.telegram.ui.t11
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.t11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        em0 em0Var = this.g2;
        if (tL_starGiftUnique != null) {
            if (em0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (!(peerColor instanceof TLRPC.TL_peerColorCollectible)) {
                    return;
                }
                em0Var.s = (TLRPC.TL_peerColorCollectible) peerColor;
                em0Var.r = null;
            } else {
                em0Var.s = null;
                em0Var.r = org.telegram.messenger.qp.q0(tL_starGiftUnique);
            }
            em0Var.I = null;
            em0Var.h = -1;
        } else {
            em0Var.n = l10 == null ? 0L : l10.longValue();
            em0Var.r = null;
            em0Var.s = null;
            em0Var.I = null;
        }
        dm0 dm0Var = this.e2;
        if (dm0Var != null) {
            dm0Var.b(true);
        }
        em0Var.j(true);
        em0Var.i();
        em0Var.f(true);
        k11 k11Var = this.f2[0];
        if (k11Var != null) {
            em0Var.o0 = null;
            k11Var.dismiss();
        }
    }
}
