package org.telegram.ui.Wallet;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class j3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 b;

    public /* synthetic */ j3(int i10, org.telegram.ui.ActionBar.k2 k2Var) {
        this.a = i10;
        this.b = k2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        org.telegram.ui.ActionBar.k2 k2Var = this.b;
        switch (i10) {
            case 0:
                b6.H0(k2Var.getContext(), k2Var.getResourceProvider());
                break;
            case 1:
                k2Var.presentFragment(new b6());
                break;
            default:
                if (cc.a(k2Var)) {
                    cc.a0(k2Var).I(R.raw.contact_check, cd.L0(2131743176, null), cd.L0(2131743175, null)).j();
                    break;
                }
                break;
        }
    }
}
