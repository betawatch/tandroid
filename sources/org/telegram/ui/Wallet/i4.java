package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.u81;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class i4 extends u81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ m5 b;

    public i4(m5 m5Var, Context context) {
        this.b = m5Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.u81
    public final void b(View view, int i10, int i11) {
        m5.R0((a71) view, false);
    }

    @Override // org.telegram.ui.Components.u81
    public final View d(int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.d6 d6Var;
        m5 m5Var = this.b;
        a71[] a71VarArr = m5Var.s0;
        a71 a71Var = a71VarArr[i10];
        if (a71Var != null) {
            return a71Var;
        }
        i11 = ((org.telegram.ui.ActionBar.n2) m5Var).currentAccount;
        i12 = ((org.telegram.ui.ActionBar.n2) m5Var).classGuid;
        org.telegram.ui.Components.o oVar = new org.telegram.ui.Components.o(this, i10, 2);
        q3 q3Var = new q3(m5Var);
        q3 q3Var2 = new q3(m5Var);
        d6Var = ((org.telegram.ui.ActionBar.n2) m5Var).resourceProvider;
        h4 h4Var = new h4(this.a, i11, i12, false, oVar, q3Var, q3Var2, d6Var, i10 == 1 ? 3 : -1, 1);
        if (i10 == 1) {
            h4Var.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(12.0f));
        }
        h4Var.setFocusableInTouchMode(false);
        h4Var.setClipChildren(false);
        h4Var.setClipToPadding(false);
        if (i10 == 0) {
            h4Var.p1();
        } else {
            h4Var.setSelectorType(9);
            h4Var.setSelectorDrawableColor(0);
        }
        h4Var.W2.r = false;
        h4Var.j(new j51(this, i10));
        a71VarArr[i10] = h4Var;
        return h4Var;
    }

    @Override // org.telegram.ui.Components.u81
    public final int e() {
        return this.b.g0 ? 2 : 1;
    }

    @Override // org.telegram.ui.Components.u81
    public final CharSequence g(int i10) {
        return LocaleController.getString(i10 == 0 ? R.string.WalletTransactions : R.string.WalletCollectibles);
    }

    @Override // org.telegram.ui.Components.u81
    public final int h(int i10) {
        return i10;
    }
}
