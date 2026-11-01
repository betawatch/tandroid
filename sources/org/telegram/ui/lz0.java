package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class lz0 extends g31 {
    public final /* synthetic */ nz0 e2;
    public final /* synthetic */ x21[] f2;
    public final /* synthetic */ oz0 g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz0(oz0 oz0Var, oz0 oz0Var2, Activity activity, Integer num, nz0 nz0Var, x21[] x21VarArr) {
        super(oz0Var2, activity, false, num, 2, null);
        this.g2 = oz0Var;
        this.e2 = nz0Var;
        this.f2 = x21VarArr;
    }

    @Override // org.telegram.ui.g31
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l4 == null) {
            return;
        }
        oz0 oz0Var = this.g2;
        i10 = ((org.telegram.ui.ActionBar.k2) oz0Var).currentAccount;
        org.telegram.messenger.vi.b0(i10).a2("animated_" + l4);
        nz0 nz0Var = this.e2;
        if (nz0Var != null) {
            nz0Var.a(true);
        }
        x21 x21Var = this.f2[0];
        if (x21Var != null) {
            oz0Var.n = null;
            x21Var.dismiss();
        }
    }

    @Override // org.telegram.ui.g31
    public final void r(q21 q21Var, sg.o0 o0Var) {
        int i10;
        oz0 oz0Var = this.g2;
        i10 = ((org.telegram.ui.ActionBar.k2) oz0Var).currentAccount;
        org.telegram.messenger.vi.b0(i10).a2(o0Var.f);
        nz0 nz0Var = this.e2;
        if (nz0Var != null) {
            nz0Var.a(true);
        }
        x21 x21Var = this.f2[0];
        if (x21Var != null) {
            oz0Var.n = null;
            x21Var.dismiss();
        }
    }
}
