package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class je implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ an b;
    public final /* synthetic */ org.telegram.messenger.qp c;
    public final /* synthetic */ CharSequence d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ je(an anVar, CharSequence charSequence, org.telegram.messenger.qp qpVar, boolean z9) {
        this.b = anVar;
        this.d = charSequence;
        this.c = qpVar;
        this.e = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                an.N0(this.b, this.d, this.c, this.e);
                break;
            default:
                an anVar = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar.getParentActivity(), anVar.xa);
                String M0 = org.telegram.messenger.id.M0(R.string.AppName, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                String M02 = org.telegram.messenger.id.M0(2131747832, null);
                org.telegram.messenger.qp qpVar = this.c;
                alertDialog$Builder.k(M02, new a3.g(anVar, qpVar, this.d, this.e, 4));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                u1Var.T = org.telegram.messenger.id.M0(2131745688, null);
                anVar.showDialog(u1Var);
                qpVar.G2 = 0;
                org.telegram.messenger.qp.e1().edit().putInt("secretWebpage2", qpVar.G2).commit();
                break;
        }
    }

    public /* synthetic */ je(an anVar, org.telegram.messenger.qp qpVar, CharSequence charSequence, boolean z9) {
        this.b = anVar;
        this.c = qpVar;
        this.d = charSequence;
        this.e = z9;
    }
}
