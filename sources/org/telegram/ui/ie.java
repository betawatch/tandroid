package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ie implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ bn b;
    public final /* synthetic */ org.telegram.messenger.mp c;
    public final /* synthetic */ CharSequence d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ ie(bn bnVar, CharSequence charSequence, org.telegram.messenger.mp mpVar, boolean z10) {
        this.b = bnVar;
        this.d = charSequence;
        this.c = mpVar;
        this.e = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bn.P0(this.b, this.d, this.c, this.e);
                break;
            default:
                bn bnVar = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bnVar.getParentActivity(), bnVar.Ba);
                String M0 = org.telegram.messenger.gd.M0(R.string.AppName, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.S = M0;
                String M02 = org.telegram.messenger.gd.M0(2131747638, null);
                org.telegram.messenger.mp mpVar = this.c;
                alertDialog$Builder.k(M02, new a3.g(bnVar, mpVar, this.d, this.e, 5));
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                u1Var.U = org.telegram.messenger.gd.M0(2131745490, null);
                bnVar.showDialog(u1Var);
                mpVar.J2 = 0;
                org.telegram.messenger.mp.g1().edit().putInt("secretWebpage2", mpVar.J2).commit();
                break;
        }
    }

    public /* synthetic */ ie(bn bnVar, org.telegram.messenger.mp mpVar, CharSequence charSequence, boolean z10) {
        this.b = bnVar;
        this.c = mpVar;
        this.d = charSequence;
        this.e = z10;
    }
}
