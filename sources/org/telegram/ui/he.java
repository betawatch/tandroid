package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class he implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ wm b;
    public final /* synthetic */ org.telegram.messenger.hp c;
    public final /* synthetic */ CharSequence d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ he(wm wmVar, CharSequence charSequence, org.telegram.messenger.hp hpVar, boolean z10) {
        this.b = wmVar;
        this.d = charSequence;
        this.c = hpVar;
        this.e = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wm.N0(this.b, this.d, this.c, this.e);
                break;
            default:
                wm wmVar = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wmVar.getParentActivity(), wmVar.ya);
                String M0 = org.telegram.messenger.bd.M0(R.string.AppName, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                s1Var.S = M0;
                String M02 = org.telegram.messenger.bd.M0(2131747839, null);
                org.telegram.messenger.hp hpVar = this.c;
                alertDialog$Builder.k(M02, new ga.b(wmVar, hpVar, this.d, this.e, 3));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                s1Var.U = org.telegram.messenger.bd.M0(2131745695, null);
                wmVar.showDialog(s1Var);
                hpVar.H2 = 0;
                org.telegram.messenger.hp.e1().edit().putInt("secretWebpage2", hpVar.H2).commit();
                break;
        }
    }

    public /* synthetic */ he(wm wmVar, org.telegram.messenger.hp hpVar, CharSequence charSequence, boolean z10) {
        this.b = wmVar;
        this.c = hpVar;
        this.d = charSequence;
        this.e = z10;
    }
}
