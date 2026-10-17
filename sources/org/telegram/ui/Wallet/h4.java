package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.u81;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class h4 extends u81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ l5 b;

    public h4(l5 l5Var, Context context) {
        this.b = l5Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.u81
    public final void b(View view, int i10, int i11) {
        l5.R0((a71) view, false);
    }

    @Override // org.telegram.ui.Components.u81
    public final View d(int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.d6 d6Var;
        l5 l5Var = this.b;
        a71[] a71VarArr = l5Var.s0;
        a71 a71Var = a71VarArr[i10];
        if (a71Var != null) {
            return a71Var;
        }
        i11 = ((org.telegram.ui.ActionBar.n2) l5Var).currentAccount;
        i12 = ((org.telegram.ui.ActionBar.n2) l5Var).classGuid;
        org.telegram.ui.Components.o oVar = new org.telegram.ui.Components.o(this, i10, 2);
        p3 p3Var = new p3(l5Var);
        p3 p3Var2 = new p3(l5Var);
        d6Var = ((org.telegram.ui.ActionBar.n2) l5Var).resourceProvider;
        g4 g4Var = new g4(this.a, i11, i12, false, oVar, p3Var, p3Var2, d6Var, i10 == 1 ? 3 : -1, 1);
        if (i10 == 1) {
            g4Var.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(12.0f));
        }
        g4Var.setFocusableInTouchMode(false);
        g4Var.setClipChildren(false);
        g4Var.setClipToPadding(false);
        if (i10 == 0) {
            g4Var.p1();
        } else {
            g4Var.setSelectorType(9);
            g4Var.setSelectorDrawableColor(0);
        }
        g4Var.W2.r = false;
        g4Var.j(new j51(this, i10));
        a71VarArr[i10] = g4Var;
        return g4Var;
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
