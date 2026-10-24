package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.q51;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class i4 extends d91 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ o5 b;

    public i4(o5 o5Var, Context context) {
        this.b = o5Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.d91
    public final void b(View view, int i10, int i11) {
        o5.T0((j71) view, false);
    }

    @Override // org.telegram.ui.Components.d91
    public final View d(int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.g6 g6Var;
        o5 o5Var = this.b;
        j71[] j71VarArr = o5Var.q0;
        j71 j71Var = j71VarArr[i10];
        if (j71Var != null) {
            return j71Var;
        }
        i11 = ((org.telegram.ui.ActionBar.o2) o5Var).currentAccount;
        i12 = ((org.telegram.ui.ActionBar.o2) o5Var).classGuid;
        org.telegram.ui.Components.o oVar = new org.telegram.ui.Components.o(this, i10, 2);
        r3 r3Var = new r3(o5Var);
        r3 r3Var2 = new r3(o5Var);
        g6Var = ((org.telegram.ui.ActionBar.o2) o5Var).resourceProvider;
        h4 h4Var = new h4(this.a, i11, i12, false, oVar, r3Var, r3Var2, g6Var, i10 == 1 ? 3 : -1, 1);
        if (i10 == 1) {
            h4Var.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(12.0f));
        }
        h4Var.setFocusableInTouchMode(false);
        h4Var.setClipChildren(false);
        h4Var.setClipToPadding(false);
        if (i10 == 0) {
            h4Var.t1();
        } else {
            h4Var.setSelectorType(9);
            h4Var.setSelectorDrawableColor(0);
        }
        h4Var.Z2.r = false;
        h4Var.j(new q51(this, i10));
        j71VarArr[i10] = h4Var;
        return h4Var;
    }

    @Override // org.telegram.ui.Components.d91
    public final int e() {
        return this.b.e0 ? 2 : 1;
    }

    @Override // org.telegram.ui.Components.d91
    public final CharSequence g(int i10) {
        return LocaleController.getString(i10 == 0 ? R.string.WalletTransactions : R.string.WalletCollectibles);
    }

    @Override // org.telegram.ui.Components.d91
    public final int h(int i10) {
        return i10;
    }
}
