package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class x extends org.telegram.ui.r61 {
    public final /* synthetic */ org.telegram.ui.i61[] a2;
    public final /* synthetic */ z b2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, Context context, Integer num, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.i61[] i61VarArr) {
        super(null, context, true, num, 15, g6Var);
        this.b2 = zVar;
        this.a2 = i61VarArr;
    }

    @Override // org.telegram.ui.r61
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i10 = ((org.telegram.ui.ActionBar.h3) this.b2).currentAccount;
        return mh.t7.y(i10, false).n(tL_starGiftUnique.id) == null || MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) >= 2;
    }

    @Override // org.telegram.ui.r61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        z zVar = this.b2;
        zVar.e0 = l10;
        zVar.X();
        zVar.W();
        org.telegram.ui.i61 i61Var = this.a2[0];
        if (i61Var != null) {
            zVar.f0 = null;
            i61Var.dismiss();
        }
    }
}
