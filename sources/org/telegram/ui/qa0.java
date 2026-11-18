package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class qa0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ de0 b;

    public /* synthetic */ qa0(de0 de0Var, int i7) {
        this.a = i7;
        this.b = de0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        de0 de0Var = this.b;
        switch (i7) {
            case 0:
                de0Var.d0 = false;
                break;
            case 1:
                de0Var.y0 = false;
                de0Var.P1(true, true);
                break;
            default:
                if (de0Var.getParentActivity() != null && !de0Var.getParentActivity().isFinishing() && de0Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(de0Var.getParentActivity());
                    String M0 = org.telegram.messenger.gd.M0(2131745876, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.S = M0;
                    u1Var.U = org.telegram.messenger.gd.M0(2131745754, null);
                    alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, null), new ta0(de0Var, 1));
                    alertDialog$Builder.p();
                    break;
                }
                break;
        }
    }
}
