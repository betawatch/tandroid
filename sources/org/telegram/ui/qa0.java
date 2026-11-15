package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                ce0Var.d0 = false;
                break;
            case 1:
                ce0Var.y0 = false;
                ce0Var.P1(true, true);
                break;
            default:
                if (ce0Var.getParentActivity() != null && !ce0Var.getParentActivity().isFinishing() && ce0Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ce0Var.getParentActivity());
                    String M0 = org.telegram.messenger.hd.M0(2131746071, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                    t1Var.S = M0;
                    t1Var.U = org.telegram.messenger.hd.M0(2131745949, null);
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), new ta0(ce0Var, 1));
                    alertDialog$Builder.p();
                    break;
                }
                break;
        }
    }
}
