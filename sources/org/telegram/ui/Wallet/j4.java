package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.u81;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class j4 extends u81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ n5 b;

    public j4(n5 n5Var, Context context) {
        this.b = n5Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.u81
    public final void b(View view, int i10, int i11) {
        n5.R0((a71) view, false);
    }

    @Override // org.telegram.ui.Components.u81
    public final View d(int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.d6 d6Var;
        n5 n5Var = this.b;
        a71[] a71VarArr = n5Var.q0;
        a71 a71Var = a71VarArr[i10];
        if (a71Var != null) {
            return a71Var;
        }
        i11 = ((org.telegram.ui.ActionBar.n2) n5Var).currentAccount;
        i12 = ((org.telegram.ui.ActionBar.n2) n5Var).classGuid;
        org.telegram.ui.Components.o oVar = new org.telegram.ui.Components.o(this, i10, 2);
        r3 r3Var = new r3(n5Var);
        r3 r3Var2 = new r3(n5Var);
        d6Var = ((org.telegram.ui.ActionBar.n2) n5Var).resourceProvider;
        i4 i4Var = new i4(this.a, i11, i12, false, oVar, r3Var, r3Var2, d6Var, i10 == 1 ? 3 : -1, 1);
        if (i10 == 1) {
            i4Var.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(12.0f));
        }
        i4Var.setFocusableInTouchMode(false);
        i4Var.setClipChildren(false);
        i4Var.setClipToPadding(false);
        if (i10 == 0) {
            i4Var.p1();
        } else {
            i4Var.setSelectorType(9);
            i4Var.setSelectorDrawableColor(0);
        }
        i4Var.W2.r = false;
        i4Var.j(new j51(this, i10));
        a71VarArr[i10] = i4Var;
        return i4Var;
    }

    @Override // org.telegram.ui.Components.u81
    public final int e() {
        return this.b.e0 ? 2 : 1;
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
