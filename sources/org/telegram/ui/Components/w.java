package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class w extends org.telegram.ui.h71 {
    public final /* synthetic */ org.telegram.ui.y61[] d2;
    public final /* synthetic */ y e2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, Context context, Integer num, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.y61[] y61VarArr) {
        super(null, context, true, num, 15, e6Var);
        this.e2 = yVar;
        this.d2 = y61VarArr;
    }

    @Override // org.telegram.ui.h71
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i10 = ((org.telegram.ui.ActionBar.f3) this.e2).currentAccount;
        return yh.u5.y(i10, false).n(tL_starGiftUnique.id) == null || MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) >= 2;
    }

    @Override // org.telegram.ui.h71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        y yVar = this.e2;
        yVar.h0 = l4;
        yVar.X();
        yVar.W();
        org.telegram.ui.y61 y61Var = this.d2[0];
        if (y61Var != null) {
            yVar.i0 = null;
            y61Var.dismiss();
        }
    }
}
