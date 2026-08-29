package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class y extends org.telegram.ui.d61 {
    public final /* synthetic */ org.telegram.ui.u51[] Z1;
    public final /* synthetic */ a0 a2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(a0 a0Var, Context context, Integer num, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.u51[] u51VarArr) {
        super(null, context, true, num, 15, c6Var);
        this.a2 = a0Var;
        this.Z1 = u51VarArr;
    }

    @Override // org.telegram.ui.d61
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i10 = ((org.telegram.ui.ActionBar.f3) this.a2).currentAccount;
        return jh.s7.y(i10, false).n(tL_starGiftUnique.id) == null || MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) >= 2;
    }

    @Override // org.telegram.ui.d61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        a0 a0Var = this.a2;
        a0Var.d0 = l10;
        a0Var.X();
        a0Var.W();
        org.telegram.ui.u51 u51Var = this.Z1[0];
        if (u51Var != null) {
            a0Var.e0 = null;
            u51Var.dismiss();
        }
    }
}
