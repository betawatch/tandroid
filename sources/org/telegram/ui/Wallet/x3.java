package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.q51;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class x3 extends d91 {
    public final /* synthetic */ a5 a;

    public x3(a5 a5Var) {
        this.a = a5Var;
    }

    @Override // org.telegram.ui.Components.d91
    public final void b(View view, int i10, int i11) {
        i71 i71Var = (i71) view;
        boolean canScrollVertically = i71Var.canScrollVertically(-1);
        i71Var.W2.N(false);
        i71Var.a0();
        if (canScrollVertically) {
            return;
        }
        i71Var.V2.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.d91
    public final View d(int i10) {
        a5 a5Var = this.a;
        i71[] i71VarArr = a5Var.p0;
        i71 i71Var = i71VarArr[i10];
        if (i71Var != null) {
            return i71Var;
        }
        w3 w3Var = new w3(a5Var, new org.telegram.ui.Components.o(this, i10, 2), new j3(a5Var), new j3(a5Var));
        w3Var.setFocusableInTouchMode(false);
        w3Var.setClipChildren(false);
        w3Var.setClipToPadding(false);
        w3Var.p1();
        w3Var.W2.r = false;
        w3Var.j(new q51(this, i10));
        i71VarArr[i10] = w3Var;
        return w3Var;
    }

    @Override // org.telegram.ui.Components.d91
    public final int e() {
        return this.a.g0 ? 2 : 1;
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
