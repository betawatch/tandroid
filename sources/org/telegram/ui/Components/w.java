package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class w extends org.telegram.ui.z61 {
    public final /* synthetic */ org.telegram.ui.q61[] d2;
    public final /* synthetic */ y e2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, Context context, Integer num, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.q61[] q61VarArr) {
        super(null, context, true, num, 15, d6Var);
        this.e2 = yVar;
        this.d2 = q61VarArr;
    }

    @Override // org.telegram.ui.z61
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i10 = ((org.telegram.ui.ActionBar.f3) this.e2).currentAccount;
        return yh.t5.y(i10, false).n(tL_starGiftUnique.id) == null || MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) >= 2;
    }

    @Override // org.telegram.ui.z61
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        y yVar = this.e2;
        yVar.h0 = l4;
        yVar.X();
        yVar.W();
        org.telegram.ui.q61 q61Var = this.d2[0];
        if (q61Var != null) {
            yVar.i0 = null;
            q61Var.dismiss();
        }
    }
}
