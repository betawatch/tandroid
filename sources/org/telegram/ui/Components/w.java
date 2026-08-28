package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class w extends org.telegram.ui.b61 {
    public final /* synthetic */ org.telegram.ui.s51[] Z1;
    public final /* synthetic */ y a2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, Context context, Integer num, org.telegram.ui.ActionBar.b6 b6Var, org.telegram.ui.s51[] s51VarArr) {
        super(null, context, true, num, 15, b6Var);
        this.a2 = yVar;
        this.Z1 = s51VarArr;
    }

    @Override // org.telegram.ui.b61
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i9;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i9 = ((org.telegram.ui.ActionBar.f3) this.a2).currentAccount;
        return gh.v7.y(i9, false).n(tL_starGiftUnique.id) == null || MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) >= 2;
    }

    @Override // org.telegram.ui.b61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        y yVar = this.a2;
        yVar.d0 = l10;
        yVar.W();
        yVar.V();
        org.telegram.ui.s51 s51Var = this.Z1[0];
        if (s51Var != null) {
            yVar.e0 = null;
            s51Var.dismiss();
        }
    }
}
