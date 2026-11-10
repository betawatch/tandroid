package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class x extends org.telegram.ui.t11 {
    public final /* synthetic */ org.telegram.ui.k11[] e2;
    public final /* synthetic */ z f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, Context context, Integer num, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.k11[] k11VarArr) {
        super(null, context, true, num, 15, h6Var);
        this.f2 = zVar;
        this.e2 = k11VarArr;
    }

    @Override // org.telegram.ui.t11
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        return tL_starGiftUnique == null || bi.ea.y(this.f2.a, false).n(tL_starGiftUnique.id) == null || org.telegram.messenger.qp.e1().getInt("statusgiftpage", 0) >= 2;
    }

    @Override // org.telegram.ui.t11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        z zVar = this.f2;
        zVar.c2 = l10;
        zVar.f1();
        zVar.e1();
        org.telegram.ui.k11 k11Var = this.e2[0];
        if (k11Var != null) {
            zVar.d2 = null;
            k11Var.dismiss();
        }
    }
}
