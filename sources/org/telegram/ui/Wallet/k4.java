package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.l51;
import org.telegram.ui.Components.w81;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class k4 extends w81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ o5 b;

    public k4(o5 o5Var, Context context) {
        this.b = o5Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.w81
    public final void b(View view, int i10, int i11) {
        o5.S0((c71) view, false);
    }

    @Override // org.telegram.ui.Components.w81
    public final View d(int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.d6 d6Var;
        o5 o5Var = this.b;
        c71[] c71VarArr = o5Var.q0;
        c71 c71Var = c71VarArr[i10];
        if (c71Var != null) {
            return c71Var;
        }
        i11 = ((org.telegram.ui.ActionBar.n2) o5Var).currentAccount;
        i12 = ((org.telegram.ui.ActionBar.n2) o5Var).classGuid;
        org.telegram.ui.Components.o oVar = new org.telegram.ui.Components.o(this, i10, 2);
        s3 s3Var = new s3(o5Var);
        s3 s3Var2 = new s3(o5Var);
        d6Var = ((org.telegram.ui.ActionBar.n2) o5Var).resourceProvider;
        j4 j4Var = new j4(this.a, i11, i12, false, oVar, s3Var, s3Var2, d6Var, i10 == 1 ? 3 : -1, 1);
        if (i10 == 1) {
            j4Var.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(12.0f));
        }
        j4Var.setFocusableInTouchMode(false);
        j4Var.setClipChildren(false);
        j4Var.setClipToPadding(false);
        if (i10 == 0) {
            j4Var.p1();
        } else {
            j4Var.setSelectorType(9);
            j4Var.setSelectorDrawableColor(0);
        }
        j4Var.W2.r = false;
        j4Var.j(new l51(this, i10));
        c71VarArr[i10] = j4Var;
        return j4Var;
    }

    @Override // org.telegram.ui.Components.w81
    public final int e() {
        return this.b.e0 ? 2 : 1;
    }

    @Override // org.telegram.ui.Components.w81
    public final CharSequence g(int i10) {
        return LocaleController.getString(i10 == 0 ? R.string.WalletTransactions : R.string.WalletCollectibles);
    }

    @Override // org.telegram.ui.Components.w81
    public final int h(int i10) {
        return i10;
    }
}
