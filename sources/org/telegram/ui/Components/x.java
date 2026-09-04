package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class x extends org.telegram.ui.j71 {
    public final /* synthetic */ org.telegram.ui.a71[] d2;
    public final /* synthetic */ z e2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, Context context, Integer num, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.a71[] a71VarArr) {
        super(null, context, true, num, 15, f6Var);
        this.e2 = zVar;
        this.d2 = a71VarArr;
    }

    @Override // org.telegram.ui.j71
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i10 = ((org.telegram.ui.ActionBar.f3) this.e2).currentAccount;
        return zh.s5.y(i10, false).n(tL_starGiftUnique.id) == null || MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) >= 2;
    }

    @Override // org.telegram.ui.j71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        z zVar = this.e2;
        zVar.h0 = l4;
        zVar.X();
        zVar.W();
        org.telegram.ui.a71 a71Var = this.d2[0];
        if (a71Var != null) {
            zVar.i0 = null;
            a71Var.dismiss();
        }
    }
}
