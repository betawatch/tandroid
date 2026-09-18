package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class w extends org.telegram.ui.i71 {
    public final /* synthetic */ org.telegram.ui.z61[] d2;
    public final /* synthetic */ y e2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, Context context, Integer num, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.z61[] z61VarArr) {
        super(null, context, true, num, 15, f6Var);
        this.e2 = yVar;
        this.d2 = z61VarArr;
    }

    @Override // org.telegram.ui.i71
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i10 = ((org.telegram.ui.ActionBar.g3) this.e2).currentAccount;
        return yh.v5.y(i10, false).n(tL_starGiftUnique.id) == null || MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) >= 2;
    }

    @Override // org.telegram.ui.i71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        y yVar = this.e2;
        yVar.h0 = l4;
        yVar.X();
        yVar.W();
        org.telegram.ui.z61 z61Var = this.d2[0];
        if (z61Var != null) {
            yVar.i0 = null;
            z61Var.dismiss();
        }
    }
}
