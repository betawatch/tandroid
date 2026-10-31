package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class jn0 extends i31 {
    public final /* synthetic */ mn0 e2;
    public final /* synthetic */ z21[] f2;
    public final /* synthetic */ nn0 g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn0(nn0 nn0Var, org.telegram.ui.ActionBar.k2 k2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.p6 p6Var, int i11, int i12, mn0 mn0Var, z21[] z21VarArr) {
        super(k2Var, context, true, num, i10, true, p6Var, i11, i12);
        this.g2 = nn0Var;
        this.e2 = mn0Var;
        this.f2 = z21VarArr;
    }

    @Override // org.telegram.ui.i31
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.i31
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        nn0 nn0Var = this.g2;
        if (tL_starGiftUnique != null) {
            if (nn0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (!(peerColor instanceof TLRPC.TL_peerColorCollectible)) {
                    return;
                }
                nn0Var.s = (TLRPC.TL_peerColorCollectible) peerColor;
                nn0Var.r = null;
            } else {
                nn0Var.s = null;
                nn0Var.r = org.telegram.messenger.vp.q0(tL_starGiftUnique);
            }
            nn0Var.I = null;
            nn0Var.h = -1;
        } else {
            nn0Var.n = l4 == null ? 0L : l4.longValue();
            nn0Var.r = null;
            nn0Var.s = null;
            nn0Var.I = null;
        }
        mn0 mn0Var = this.e2;
        if (mn0Var != null) {
            mn0Var.b(true);
        }
        nn0Var.j(true);
        nn0Var.i();
        nn0Var.f(true);
        z21 z21Var = this.f2[0];
        if (z21Var != null) {
            nn0Var.o0 = null;
            z21Var.dismiss();
        }
    }
}
