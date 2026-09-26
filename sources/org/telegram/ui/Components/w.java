package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class w extends org.telegram.ui.a71 {
    public final /* synthetic */ org.telegram.ui.r61[] d2;
    public final /* synthetic */ y e2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, Context context, Integer num, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.r61[] r61VarArr) {
        super(null, context, true, num, 15, d6Var);
        this.e2 = yVar;
        this.d2 = r61VarArr;
    }

    @Override // org.telegram.ui.a71
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i10 = ((org.telegram.ui.ActionBar.e3) this.e2).currentAccount;
        return yh.s5.y(i10, false).n(tL_starGiftUnique.id) == null || MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) >= 2;
    }

    @Override // org.telegram.ui.a71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        y yVar = this.e2;
        yVar.h0 = l4;
        yVar.X();
        yVar.W();
        org.telegram.ui.r61 r61Var = this.d2[0];
        if (r61Var != null) {
            yVar.i0 = null;
            r61Var.dismiss();
        }
    }
}
