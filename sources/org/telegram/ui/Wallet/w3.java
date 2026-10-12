package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.c91;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.p51;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class w3 extends c91 {
    public final /* synthetic */ z4 a;

    public w3(z4 z4Var) {
        this.a = z4Var;
    }

    @Override // org.telegram.ui.Components.c91
    public final void b(View view, int i10, int i11) {
        h71 h71Var = (h71) view;
        boolean canScrollVertically = h71Var.canScrollVertically(-1);
        h71Var.W2.N(false);
        h71Var.a0();
        if (canScrollVertically) {
            return;
        }
        h71Var.V2.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.c91
    public final View d(int i10) {
        z4 z4Var = this.a;
        h71[] h71VarArr = z4Var.p0;
        h71 h71Var = h71VarArr[i10];
        if (h71Var != null) {
            return h71Var;
        }
        v3 v3Var = new v3(z4Var, new org.telegram.ui.Components.o(this, i10, 2), new i3(z4Var), new i3(z4Var));
        v3Var.setFocusableInTouchMode(false);
        v3Var.setClipChildren(false);
        v3Var.setClipToPadding(false);
        v3Var.p1();
        v3Var.W2.r = false;
        v3Var.j(new p51(this, i10));
        h71VarArr[i10] = v3Var;
        return v3Var;
    }

    @Override // org.telegram.ui.Components.c91
    public final int e() {
        return this.a.g0 ? 2 : 1;
    }

    @Override // org.telegram.ui.Components.c91
    public final CharSequence g(int i10) {
        return LocaleController.getString(i10 == 0 ? R.string.WalletTransactions : R.string.WalletCollectibles);
    }

    @Override // org.telegram.ui.Components.c91
    public final int h(int i10) {
        return i10;
    }
}
