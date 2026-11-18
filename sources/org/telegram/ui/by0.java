package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class by0 extends r11 {
    public final /* synthetic */ dy0 f2;
    public final /* synthetic */ i11[] g2;
    public final /* synthetic */ ey0 h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public by0(ey0 ey0Var, ey0 ey0Var2, Activity activity, Integer num, dy0 dy0Var, i11[] i11VarArr) {
        super(ey0Var2, activity, false, num, 2, null);
        this.h2 = ey0Var;
        this.f2 = dy0Var;
        this.g2 = i11VarArr;
    }

    @Override // org.telegram.ui.r11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i7;
        if (l10 == null) {
            return;
        }
        ey0 ey0Var = this.h2;
        i7 = ((org.telegram.ui.ActionBar.h2) ey0Var).currentAccount;
        org.telegram.messenger.ri.d0(i7).f2("animated_" + l10);
        dy0 dy0Var = this.f2;
        if (dy0Var != null) {
            dy0Var.a(true);
        }
        i11 i11Var = this.g2[0];
        if (i11Var != null) {
            ey0Var.n = null;
            i11Var.dismiss();
        }
    }

    @Override // org.telegram.ui.r11
    public final void r(b11 b11Var, ch.p0 p0Var) {
        int i7;
        ey0 ey0Var = this.h2;
        i7 = ((org.telegram.ui.ActionBar.h2) ey0Var).currentAccount;
        org.telegram.messenger.ri.d0(i7).f2(p0Var.f);
        dy0 dy0Var = this.f2;
        if (dy0Var != null) {
            dy0Var.a(true);
        }
        i11 i11Var = this.g2[0];
        if (i11Var != null) {
            ey0Var.n = null;
            i11Var.dismiss();
        }
    }
}
