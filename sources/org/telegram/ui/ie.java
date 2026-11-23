package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                String N0 = org.telegram.messenger.gd.N0(R.string.AppName, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = N0;
                String N02 = org.telegram.messenger.gd.N0(2131747637, null);
                org.telegram.messenger.mp mpVar = this.c;
                alertDialog$Builder.k(N02, new a3.g(bnVar, mpVar, this.d, this.e, 5));
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                t1Var.U = org.telegram.messenger.gd.N0(2131745489, null);
                bnVar.showDialog(t1Var);
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
