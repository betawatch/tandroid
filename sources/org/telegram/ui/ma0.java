package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ma0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xd0 b;

    public /* synthetic */ ma0(xd0 xd0Var, int i3) {
        this.a = i3;
        this.b = xd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        xd0 xd0Var = this.b;
        switch (i3) {
            case 0:
                xd0Var.d0 = false;
                break;
            case 1:
                xd0Var.x0 = false;
                xd0Var.G1(true, true);
                break;
            default:
                if (xd0Var.getParentActivity() != null && !xd0Var.getParentActivity().isFinishing() && xd0Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xd0Var.getParentActivity());
                    String M0 = org.telegram.messenger.bd.M0(2131746081, null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                    s1Var.S = M0;
                    s1Var.U = org.telegram.messenger.bd.M0(2131745959, null);
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), new pa0(xd0Var, 1));
                    alertDialog$Builder.p();
                    break;
                }
                break;
        }
    }
}
