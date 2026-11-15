package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class w extends org.telegram.ui.n11 {
    public final /* synthetic */ org.telegram.ui.e11[] f2;
    public final /* synthetic */ y g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, Context context, Integer num, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.e11[] e11VarArr) {
        super(null, context, true, num, 15, e6Var);
        this.g2 = yVar;
        this.f2 = e11VarArr;
    }

    @Override // org.telegram.ui.n11
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        return tL_starGiftUnique == null || di.u8.y(this.g2.a, false).n(tL_starGiftUnique.id) == null || org.telegram.messenger.np.e1().getInt("statusgiftpage", 0) >= 2;
    }

    @Override // org.telegram.ui.n11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        y yVar = this.g2;
        yVar.d2 = l10;
        yVar.f1();
        yVar.e1();
        org.telegram.ui.e11 e11Var = this.f2[0];
        if (e11Var != null) {
            yVar.e2 = null;
            e11Var.dismiss();
        }
    }
}
