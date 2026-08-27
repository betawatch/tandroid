package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class w extends org.telegram.ui.a61 {
    public final /* synthetic */ org.telegram.ui.r51[] Z1;
    public final /* synthetic */ y a2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, Context context, Integer num, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.r51[] r51VarArr) {
        super(null, context, true, num, 15, c6Var);
        this.a2 = yVar;
        this.Z1 = r51VarArr;
    }

    @Override // org.telegram.ui.a61
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i10 = ((org.telegram.ui.ActionBar.e3) this.a2).currentAccount;
        return hh.u7.y(i10, false).n(tL_starGiftUnique.id) == null || MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) >= 2;
    }

    @Override // org.telegram.ui.a61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        y yVar = this.a2;
        yVar.d0 = l10;
        yVar.X();
        yVar.W();
        org.telegram.ui.r51 r51Var = this.Z1[0];
        if (r51Var != null) {
            yVar.e0 = null;
            r51Var.dismiss();
        }
    }
}
