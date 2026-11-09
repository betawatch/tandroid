package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class je implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ cn b;
    public final /* synthetic */ org.telegram.messenger.qp c;
    public final /* synthetic */ CharSequence d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ je(cn cnVar, CharSequence charSequence, org.telegram.messenger.qp qpVar, boolean z9) {
        this.b = cnVar;
        this.d = charSequence;
        this.c = qpVar;
        this.e = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cn.P0(this.b, this.d, this.c, this.e);
                break;
            default:
                cn cnVar = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, cnVar.getParentActivity(), cnVar.za);
                String M0 = org.telegram.messenger.id.M0(R.string.AppName, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                String M02 = org.telegram.messenger.id.M0(2131747831, null);
                org.telegram.messenger.qp qpVar = this.c;
                alertDialog$Builder.k(M02, new a3.g(cnVar, qpVar, this.d, this.e, 4));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                u1Var.T = org.telegram.messenger.id.M0(2131745685, null);
                cnVar.showDialog(u1Var);
                qpVar.G2 = 0;
                org.telegram.messenger.qp.e1().edit().putInt("secretWebpage2", qpVar.G2).commit();
                break;
        }
    }

    public /* synthetic */ je(cn cnVar, org.telegram.messenger.qp qpVar, CharSequence charSequence, boolean z9) {
        this.b = cnVar;
        this.c = qpVar;
        this.d = charSequence;
        this.e = z9;
    }
}
