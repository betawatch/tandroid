package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
                    String M0 = org.telegram.messenger.hd.M0(2131746072, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.R = M0;
                    u1Var.T = org.telegram.messenger.hd.M0(2131745950, null);
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), new ta0(ce0Var, 1));
                    alertDialog$Builder.p();
                    break;
                }
                break;
        }
    }
}
