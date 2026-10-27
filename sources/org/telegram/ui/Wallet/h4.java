package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.n91;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.z51;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class h4 extends n91 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ m5 b;

    public h4(m5 m5Var, Context context) {
        this.b = m5Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.n91
    public final void b(View view, int i10, int i11) {
        m5.U0((s71) view, false);
    }

    @Override // org.telegram.ui.Components.n91
    public final View d(int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.u6 u6Var;
        m5 m5Var = this.b;
        s71[] s71VarArr = m5Var.r0;
        s71 s71Var = s71VarArr[i10];
        if (s71Var != null) {
            return s71Var;
        }
        i11 = ((org.telegram.ui.ActionBar.r2) m5Var).currentAccount;
        i12 = ((org.telegram.ui.ActionBar.r2) m5Var).classGuid;
        org.telegram.ui.Components.o oVar = new org.telegram.ui.Components.o(this, i10, 2);
        r3 r3Var = new r3(m5Var);
        r3 r3Var2 = new r3(m5Var);
        u6Var = ((org.telegram.ui.ActionBar.r2) m5Var).resourceProvider;
        g4 g4Var = new g4(this.a, i11, i12, false, oVar, r3Var, r3Var2, u6Var, i10 == 1 ? 3 : -1, 1);
        if (i10 == 1) {
            g4Var.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(12.0f));
        }
        g4Var.setFocusableInTouchMode(false);
        g4Var.setClipChildren(false);
        g4Var.setClipToPadding(false);
        if (i10 == 0) {
            g4Var.u1();
        } else {
            g4Var.setSelectorType(9);
            g4Var.setSelectorDrawableColor(0);
        }
        g4Var.g3.r = false;
        g4Var.j(new z51(this, i10));
        s71VarArr[i10] = g4Var;
        return g4Var;
    }

    @Override // org.telegram.ui.Components.n91
    public final int e() {
        return this.b.f0 ? 2 : 1;
    }

    @Override // org.telegram.ui.Components.n91
    public final CharSequence g(int i10) {
        return LocaleController.getString(i10 == 0 ? R.string.WalletTransactions : R.string.WalletCollectibles);
    }

    @Override // org.telegram.ui.Components.n91
    public final int h(int i10) {
        return i10;
    }
}
