package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class x extends org.telegram.ui.l71 {
    public final /* synthetic */ org.telegram.ui.c71[] d2;
    public final /* synthetic */ z e2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, Context context, Integer num, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.c71[] c71VarArr) {
        super(null, context, true, num, 15, f6Var);
        this.e2 = zVar;
        this.d2 = c71VarArr;
    }

    @Override // org.telegram.ui.l71
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i10 = ((org.telegram.ui.ActionBar.h3) this.e2).currentAccount;
        return xh.v5.y(i10, false).n(tL_starGiftUnique.id) == null || MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) >= 2;
    }

    @Override // org.telegram.ui.l71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        z zVar = this.e2;
        zVar.h0 = l4;
        zVar.X();
        zVar.W();
        org.telegram.ui.c71 c71Var = this.d2[0];
        if (c71Var != null) {
            zVar.i0 = null;
            c71Var.dismiss();
        }
    }
}
