package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class f0 extends org.telegram.ui.r11 {
    public final /* synthetic */ org.telegram.ui.i11[] f2;
    public final /* synthetic */ h0 g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(h0 h0Var, Context context, Integer num, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.i11[] i11VarArr) {
        super(null, context, true, num, 15, i6Var);
        this.g2 = h0Var;
        this.f2 = i11VarArr;
    }

    @Override // org.telegram.ui.r11
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        return tL_starGiftUnique == null || di.x8.y(this.g2.a, false).n(tL_starGiftUnique.id) == null || org.telegram.messenger.mp.g1().getInt("statusgiftpage", 0) >= 2;
    }

    @Override // org.telegram.ui.r11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        h0 h0Var = this.g2;
        h0Var.d2 = l10;
        h0Var.g1();
        h0Var.f1();
        org.telegram.ui.i11 i11Var = this.f2[0];
        if (i11Var != null) {
            h0Var.e2 = null;
            i11Var.dismiss();
        }
    }
}
