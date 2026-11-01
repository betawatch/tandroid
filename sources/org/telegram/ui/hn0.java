package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class hn0 extends g31 {
    public final /* synthetic */ kn0 e2;
    public final /* synthetic */ x21[] f2;
    public final /* synthetic */ ln0 g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn0(ln0 ln0Var, org.telegram.ui.ActionBar.k2 k2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.p6 p6Var, int i11, int i12, kn0 kn0Var, x21[] x21VarArr) {
        super(k2Var, context, true, num, i10, true, p6Var, i11, i12);
        this.g2 = ln0Var;
        this.e2 = kn0Var;
        this.f2 = x21VarArr;
    }

    @Override // org.telegram.ui.g31
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.g31
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        ln0 ln0Var = this.g2;
        if (tL_starGiftUnique != null) {
            if (ln0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (!(peerColor instanceof TLRPC.TL_peerColorCollectible)) {
                    return;
                }
                ln0Var.s = (TLRPC.TL_peerColorCollectible) peerColor;
                ln0Var.r = null;
            } else {
                ln0Var.s = null;
                ln0Var.r = org.telegram.messenger.wp.q0(tL_starGiftUnique);
            }
            ln0Var.I = null;
            ln0Var.h = -1;
        } else {
            ln0Var.n = l4 == null ? 0L : l4.longValue();
            ln0Var.r = null;
            ln0Var.s = null;
            ln0Var.I = null;
        }
        kn0 kn0Var = this.e2;
        if (kn0Var != null) {
            kn0Var.b(true);
        }
        ln0Var.j(true);
        ln0Var.i();
        ln0Var.f(true);
        x21 x21Var = this.f2[0];
        if (x21Var != null) {
            ln0Var.o0 = null;
            x21Var.dismiss();
        }
    }
}
