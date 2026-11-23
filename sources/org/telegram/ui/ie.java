package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ie implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ bn b;
    public final /* synthetic */ org.telegram.messenger.np c;
    public final /* synthetic */ CharSequence d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ ie(bn bnVar, CharSequence charSequence, org.telegram.messenger.np npVar, boolean z10) {
        this.b = bnVar;
        this.d = charSequence;
        this.c = npVar;
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
                String N0 = org.telegram.messenger.hd.N0(R.string.AppName, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = N0;
                String N02 = org.telegram.messenger.hd.N0(2131747637, null);
                org.telegram.messenger.np npVar = this.c;
                alertDialog$Builder.k(N02, new a3.g(bnVar, npVar, this.d, this.e, 5));
                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                t1Var.U = org.telegram.messenger.hd.N0(2131745489, null);
                bnVar.showDialog(t1Var);
                npVar.J2 = 0;
                org.telegram.messenger.np.g1().edit().putInt("secretWebpage2", npVar.J2).commit();
                break;
        }
    }

    public /* synthetic */ ie(bn bnVar, org.telegram.messenger.np npVar, CharSequence charSequence, boolean z10) {
        this.b = bnVar;
        this.c = npVar;
        this.d = charSequence;
        this.e = z10;
    }
}
