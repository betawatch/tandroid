package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x extends org.telegram.ui.i31 {
    public final /* synthetic */ org.telegram.ui.z21[] e2;
    public final /* synthetic */ z f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, Context context, Integer num, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.ui.z21[] z21VarArr) {
        super(null, context, true, num, 15, p6Var);
        this.f2 = zVar;
        this.e2 = z21VarArr;
    }

    @Override // org.telegram.ui.i31
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        return tL_starGiftUnique == null || rh.e6.y(this.f2.a, false).n(tL_starGiftUnique.id) == null || org.telegram.messenger.vp.d1().getInt("statusgiftpage", 0) >= 2;
    }

    @Override // org.telegram.ui.i31
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        z zVar = this.f2;
        zVar.Z1 = l4;
        zVar.f1();
        zVar.e1();
        org.telegram.ui.z21 z21Var = this.e2[0];
        if (z21Var != null) {
            zVar.a2 = null;
            z21Var.dismiss();
        }
    }
}
