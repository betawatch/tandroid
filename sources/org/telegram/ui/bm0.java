package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class bm0 extends s11 {
    public final /* synthetic */ em0 f2;
    public final /* synthetic */ j11[] g2;
    public final /* synthetic */ fm0 h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm0(fm0 fm0Var, org.telegram.ui.ActionBar.g2 g2Var, Context context, Integer num, int i7, org.telegram.ui.ActionBar.h6 h6Var, int i10, int i11, em0 em0Var, j11[] j11VarArr) {
        super(g2Var, context, true, num, i7, true, h6Var, i10, i11);
        this.h2 = fm0Var;
        this.f2 = em0Var;
        this.g2 = j11VarArr;
    }

    @Override // org.telegram.ui.s11
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.s11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        fm0 fm0Var = this.h2;
        if (tL_starGiftUnique != null) {
            if (fm0Var.n0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (!(peerColor instanceof TLRPC.TL_peerColorCollectible)) {
                    return;
                }
                fm0Var.s = (TLRPC.TL_peerColorCollectible) peerColor;
                fm0Var.r = null;
            } else {
                fm0Var.s = null;
                fm0Var.r = org.telegram.messenger.np.r0(tL_starGiftUnique);
            }
            fm0Var.J = null;
            fm0Var.h = -1;
        } else {
            fm0Var.n = l10 == null ? 0L : l10.longValue();
            fm0Var.r = null;
            fm0Var.s = null;
            fm0Var.J = null;
        }
        em0 em0Var = this.f2;
        if (em0Var != null) {
            em0Var.b(true);
        }
        fm0Var.j(true);
        fm0Var.i();
        fm0Var.f(true);
        j11 j11Var = this.g2[0];
        if (j11Var != null) {
            fm0Var.p0 = null;
            j11Var.dismiss();
        }
    }
}
