package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class g0 extends org.telegram.ui.s11 {
    public final /* synthetic */ org.telegram.ui.j11[] f2;
    public final /* synthetic */ i0 g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(i0 i0Var, Context context, Integer num, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.j11[] j11VarArr) {
        super(null, context, true, num, 15, h6Var);
        this.g2 = i0Var;
        this.f2 = j11VarArr;
    }

    @Override // org.telegram.ui.s11
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        return tL_starGiftUnique == null || di.y8.y(this.g2.a, false).n(tL_starGiftUnique.id) == null || org.telegram.messenger.np.g1().getInt("statusgiftpage", 0) >= 2;
    }

    @Override // org.telegram.ui.s11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        i0 i0Var = this.g2;
        i0Var.d2 = l10;
        i0Var.g1();
        i0Var.f1();
        org.telegram.ui.j11 j11Var = this.f2[0];
        if (j11Var != null) {
            i0Var.e2 = null;
            j11Var.dismiss();
        }
    }
}
