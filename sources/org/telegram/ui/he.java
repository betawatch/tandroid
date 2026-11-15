package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class he implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ an b;
    public final /* synthetic */ org.telegram.messenger.np c;
    public final /* synthetic */ CharSequence d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ he(an anVar, CharSequence charSequence, org.telegram.messenger.np npVar, boolean z10) {
        this.b = anVar;
        this.d = charSequence;
        this.c = npVar;
        this.e = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                an.P0(this.b, this.d, this.c, this.e);
                break;
            default:
                an anVar = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar.getParentActivity(), anVar.Aa);
                String M0 = org.telegram.messenger.hd.M0(R.string.AppName, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = M0;
                String M02 = org.telegram.messenger.hd.M0(2131747831, null);
                org.telegram.messenger.np npVar = this.c;
                alertDialog$Builder.k(M02, new a3.g(anVar, npVar, this.d, this.e, 4));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                t1Var.U = org.telegram.messenger.hd.M0(2131745685, null);
                anVar.showDialog(t1Var);
                npVar.H2 = 0;
                org.telegram.messenger.np.e1().edit().putInt("secretWebpage2", npVar.H2).commit();
                break;
        }
    }

    public /* synthetic */ he(an anVar, org.telegram.messenger.np npVar, CharSequence charSequence, boolean z10) {
        this.b = anVar;
        this.c = npVar;
        this.d = charSequence;
        this.e = z10;
    }
}
