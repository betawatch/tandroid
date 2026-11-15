package org.telegram.ui.Wallet;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class l3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 b;

    public /* synthetic */ l3(int i7, org.telegram.ui.ActionBar.e2 e2Var) {
        this.a = i7;
        this.b = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.ui.ActionBar.e2 e2Var = this.b;
        switch (i7) {
            case 0:
                e2Var.presentFragment(new y5());
                break;
            case 1:
                y5.I0(e2Var.getContext(), e2Var.getResourceProvider());
                break;
            default:
                if (cc.a(e2Var)) {
                    cc.a0(e2Var).I(R.raw.contact_check, hd.M0(2131743150, null), hd.M0(2131743149, null)).j();
                    break;
                }
                break;
        }
    }
}
