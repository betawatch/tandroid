package org.telegram.ui.Wallet;

import org.telegram.messenger.cd;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class j8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8 b;

    public /* synthetic */ j8(k8 k8Var, int i10) {
        this.a = i10;
        this.b = k8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        k8 k8Var = this.b;
        switch (i10) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, k8Var.getParentActivity(), k8Var.getResourceProvider());
                alertDialog$Builder.a.T = cd.L0(2131743150, null);
                i0.a.w(null, 2131747847, alertDialog$Builder, null);
                break;
            default:
                k8Var.c0();
                break;
        }
    }
}
