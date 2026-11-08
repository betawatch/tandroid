package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qa0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ce0 b;

    public /* synthetic */ qa0(ce0 ce0Var, int i7) {
        this.a = i7;
        this.b = ce0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        ce0 ce0Var = this.b;
        switch (i7) {
            case 0:
                ce0Var.c0 = false;
                break;
            case 1:
                ce0Var.w0 = false;
                ce0Var.P1(true, true);
                break;
            default:
                if (ce0Var.getParentActivity() != null && !ce0Var.getParentActivity().isFinishing() && ce0Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ce0Var.getParentActivity());
                    String M0 = org.telegram.messenger.id.M0(2131746074, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.R = M0;
                    u1Var.T = org.telegram.messenger.id.M0(2131745952, null);
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747832, null), new ta0(ce0Var, 1));
                    alertDialog$Builder.p();
                    break;
                }
                break;
        }
    }
}
