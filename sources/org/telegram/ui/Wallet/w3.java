package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.t51;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class w3 extends f91 {
    public final /* synthetic */ a5 a;

    public w3(a5 a5Var) {
        this.a = a5Var;
    }

    @Override // org.telegram.ui.Components.f91
    public final void b(View view, int i10, int i11) {
        k71 k71Var = (k71) view;
        boolean canScrollVertically = k71Var.canScrollVertically(-1);
        k71Var.W2.N(false);
        k71Var.a0();
        if (canScrollVertically) {
            return;
        }
        k71Var.V2.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.f91
    public final View d(int i10) {
        a5 a5Var = this.a;
        k71[] k71VarArr = a5Var.p0;
        k71 k71Var = k71VarArr[i10];
        if (k71Var != null) {
            return k71Var;
        }
        v3 v3Var = new v3(a5Var, new org.telegram.ui.Components.o(this, i10, 2), new i3(a5Var), new i3(a5Var));
        v3Var.setFocusableInTouchMode(false);
        v3Var.setClipChildren(false);
        v3Var.setClipToPadding(false);
        v3Var.p1();
        v3Var.W2.r = false;
        v3Var.j(new t51(this, i10));
        k71VarArr[i10] = v3Var;
        return v3Var;
    }

    @Override // org.telegram.ui.Components.f91
    public final int e() {
        return this.a.g0 ? 2 : 1;
    }

    @Override // org.telegram.ui.Components.f91
    public final CharSequence g(int i10) {
        return LocaleController.getString(i10 == 0 ? R.string.WalletTransactions : R.string.WalletCollectibles);
    }

    @Override // org.telegram.ui.Components.f91
    public final int h(int i10) {
        return i10;
    }
}
