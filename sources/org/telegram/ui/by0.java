package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class by0 extends s11 {
    public final /* synthetic */ dy0 f2;
    public final /* synthetic */ j11[] g2;
    public final /* synthetic */ ey0 h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public by0(ey0 ey0Var, ey0 ey0Var2, Activity activity, Integer num, dy0 dy0Var, j11[] j11VarArr) {
        super(ey0Var2, activity, false, num, 2, null);
        this.h2 = ey0Var;
        this.f2 = dy0Var;
        this.g2 = j11VarArr;
    }

    @Override // org.telegram.ui.s11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i7;
        if (l10 == null) {
            return;
        }
        ey0 ey0Var = this.h2;
        i7 = ((org.telegram.ui.ActionBar.g2) ey0Var).currentAccount;
        org.telegram.messenger.ri.d0(i7).f2("animated_" + l10);
        dy0 dy0Var = this.f2;
        if (dy0Var != null) {
            dy0Var.a(true);
        }
        j11 j11Var = this.g2[0];
        if (j11Var != null) {
            ey0Var.n = null;
            j11Var.dismiss();
        }
    }

    @Override // org.telegram.ui.s11
    public final void r(c11 c11Var, ch.p0 p0Var) {
        int i7;
        ey0 ey0Var = this.h2;
        i7 = ((org.telegram.ui.ActionBar.g2) ey0Var).currentAccount;
        org.telegram.messenger.ri.d0(i7).f2(p0Var.f);
        dy0 dy0Var = this.f2;
        if (dy0Var != null) {
            dy0Var.a(true);
        }
        j11 j11Var = this.g2[0];
        if (j11Var != null) {
            ey0Var.n = null;
            j11Var.dismiss();
        }
    }
}
