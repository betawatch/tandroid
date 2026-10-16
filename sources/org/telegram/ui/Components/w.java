package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class w extends org.telegram.ui.r71 {
    public final /* synthetic */ org.telegram.ui.i71[] d2;
    public final /* synthetic */ y e2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, Context context, Integer num, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.i71[] i71VarArr) {
        super(null, context, true, num, 15, c6Var);
        this.e2 = yVar;
        this.d2 = i71VarArr;
    }

    @Override // org.telegram.ui.r71
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i10 = ((org.telegram.ui.ActionBar.e3) this.e2).currentAccount;
        return zh.n5.y(i10, false).n(tL_starGiftUnique.id) == null || MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) >= 2;
    }

    @Override // org.telegram.ui.r71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        y yVar = this.e2;
        yVar.h0 = l4;
        yVar.Y();
        yVar.X();
        org.telegram.ui.i71 i71Var = this.d2[0];
        if (i71Var != null) {
            yVar.i0 = null;
            i71Var.dismiss();
        }
    }
}
