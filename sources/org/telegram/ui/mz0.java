package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class mz0 extends i31 {
    public final /* synthetic */ oz0 e2;
    public final /* synthetic */ z21[] f2;
    public final /* synthetic */ pz0 g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mz0(pz0 pz0Var, pz0 pz0Var2, Activity activity, Integer num, oz0 oz0Var, z21[] z21VarArr) {
        super(pz0Var2, activity, false, num, 2, null);
        this.g2 = pz0Var;
        this.e2 = oz0Var;
        this.f2 = z21VarArr;
    }

    @Override // org.telegram.ui.i31
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l4 == null) {
            return;
        }
        pz0 pz0Var = this.g2;
        i10 = ((org.telegram.ui.ActionBar.k2) pz0Var).currentAccount;
        org.telegram.messenger.ui.b0(i10).a2("animated_" + l4);
        oz0 oz0Var = this.e2;
        if (oz0Var != null) {
            oz0Var.a(true);
        }
        z21 z21Var = this.f2[0];
        if (z21Var != null) {
            pz0Var.n = null;
            z21Var.dismiss();
        }
    }

    @Override // org.telegram.ui.i31
    public final void r(s21 s21Var, sg.o0 o0Var) {
        int i10;
        pz0 pz0Var = this.g2;
        i10 = ((org.telegram.ui.ActionBar.k2) pz0Var).currentAccount;
        org.telegram.messenger.ui.b0(i10).a2(o0Var.f);
        oz0 oz0Var = this.e2;
        if (oz0Var != null) {
            oz0Var.a(true);
        }
        z21 z21Var = this.f2[0];
        if (z21Var != null) {
            pz0Var.n = null;
            z21Var.dismiss();
        }
    }
}
