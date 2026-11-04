package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x extends org.telegram.ui.g11 {
    public final /* synthetic */ org.telegram.ui.x01[] f2;
    public final /* synthetic */ z g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, Context context, Integer num, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.x01[] x01VarArr) {
        super(null, context, true, num, 15, e6Var);
        this.g2 = zVar;
        this.f2 = x01VarArr;
    }

    @Override // org.telegram.ui.g11
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        return tL_starGiftUnique == null || ci.e9.y(this.g2.a, false).n(tL_starGiftUnique.id) == null || org.telegram.messenger.hp.e1().getInt("statusgiftpage", 0) >= 2;
    }

    @Override // org.telegram.ui.g11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        z zVar = this.g2;
        zVar.a2 = l10;
        zVar.f1();
        zVar.e1();
        org.telegram.ui.x01 x01Var = this.f2[0];
        if (x01Var != null) {
            zVar.b2 = null;
            x01Var.dismiss();
        }
    }
}
