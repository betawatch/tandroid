package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class x extends org.telegram.ui.w61 {
    public final /* synthetic */ org.telegram.ui.n61[] a2;
    public final /* synthetic */ z b2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, Context context, Integer num, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.n61[] n61VarArr) {
        super(null, context, true, num, 15, g6Var);
        this.b2 = zVar;
        this.a2 = n61VarArr;
    }

    @Override // org.telegram.ui.w61
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i10 = ((org.telegram.ui.ActionBar.h3) this.b2).currentAccount;
        return mh.t7.y(i10, false).n(tL_starGiftUnique.id) == null || MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) >= 2;
    }

    @Override // org.telegram.ui.w61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        z zVar = this.b2;
        zVar.e0 = l10;
        zVar.X();
        zVar.W();
        org.telegram.ui.n61 n61Var = this.a2[0];
        if (n61Var != null) {
            zVar.f0 = null;
            n61Var.dismiss();
        }
    }
}
