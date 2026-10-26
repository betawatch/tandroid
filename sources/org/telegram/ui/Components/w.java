package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class w extends org.telegram.ui.c61 {
    public final /* synthetic */ org.telegram.ui.t51[] e2;
    public final /* synthetic */ y f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, Context context, Integer num, org.telegram.ui.ActionBar.u6 u6Var, org.telegram.ui.t51[] t51VarArr) {
        super(null, context, true, num, 15, u6Var);
        this.f2 = yVar;
        this.e2 = t51VarArr;
    }

    @Override // org.telegram.ui.c61
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i10 = ((org.telegram.ui.ActionBar.k3) this.f2).currentAccount;
        return bi.ca.y(i10, false).n(tL_starGiftUnique.id) == null || MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) >= 2;
    }

    @Override // org.telegram.ui.c61
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        y yVar = this.f2;
        yVar.h0 = l4;
        yVar.X();
        yVar.W();
        org.telegram.ui.t51 t51Var = this.e2[0];
        if (t51Var != null) {
            yVar.i0 = null;
            t51Var.dismiss();
        }
    }
}
