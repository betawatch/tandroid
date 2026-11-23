package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class f0 extends org.telegram.ui.q11 {
    public final /* synthetic */ org.telegram.ui.h11[] f2;
    public final /* synthetic */ h0 g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(h0 h0Var, Context context, Integer num, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.h11[] h11VarArr) {
        super(null, context, true, num, 15, i6Var);
        this.g2 = h0Var;
        this.f2 = h11VarArr;
    }

    @Override // org.telegram.ui.q11
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        return tL_starGiftUnique == null || di.y8.y(this.g2.a, false).n(tL_starGiftUnique.id) == null || org.telegram.messenger.mp.g1().getInt("statusgiftpage", 0) >= 2;
    }

    @Override // org.telegram.ui.q11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        h0 h0Var = this.g2;
        h0Var.d2 = l10;
        h0Var.g1();
        h0Var.f1();
        org.telegram.ui.h11 h11Var = this.f2[0];
        if (h11Var != null) {
            h0Var.e2 = null;
            h11Var.dismiss();
        }
    }
}
