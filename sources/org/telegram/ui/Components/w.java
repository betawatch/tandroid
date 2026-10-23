package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class w extends org.telegram.ui.b61 {
    public final /* synthetic */ org.telegram.ui.s51[] e2;
    public final /* synthetic */ y f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, Context context, Integer num, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.s51[] s51VarArr) {
        super(null, context, true, num, 15, g6Var);
        this.f2 = yVar;
        this.e2 = s51VarArr;
    }

    @Override // org.telegram.ui.b61
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i10 = ((org.telegram.ui.ActionBar.h3) this.f2).currentAccount;
        return ai.ha.y(i10, false).n(tL_starGiftUnique.id) == null || MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) >= 2;
    }

    @Override // org.telegram.ui.b61
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        y yVar = this.f2;
        yVar.h0 = l4;
        yVar.X();
        yVar.W();
        org.telegram.ui.s51 s51Var = this.e2[0];
        if (s51Var != null) {
            yVar.i0 = null;
            s51Var.dismiss();
        }
    }
}
