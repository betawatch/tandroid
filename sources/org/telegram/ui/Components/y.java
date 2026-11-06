package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class y extends org.telegram.ui.q11 {
    public final /* synthetic */ org.telegram.ui.h11[] e2;
    public final /* synthetic */ a0 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(a0 a0Var, Context context, Integer num, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.h11[] h11VarArr) {
        super(null, context, true, num, 15, f6Var);
        this.f2 = a0Var;
        this.e2 = h11VarArr;
    }

    @Override // org.telegram.ui.q11
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        return tL_starGiftUnique == null || bi.ea.y(this.f2.a, false).n(tL_starGiftUnique.id) == null || org.telegram.messenger.qp.e1().getInt("statusgiftpage", 0) >= 2;
    }

    @Override // org.telegram.ui.q11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        a0 a0Var = this.f2;
        a0Var.Z1 = l10;
        a0Var.f1();
        a0Var.e1();
        org.telegram.ui.h11 h11Var = this.e2[0];
        if (h11Var != null) {
            a0Var.a2 = null;
            h11Var.dismiss();
        }
    }
}
