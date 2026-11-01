package org.telegram.ui.Wallet;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 b;

    public /* synthetic */ k3(int i10, org.telegram.ui.ActionBar.k2 k2Var) {
        this.a = i10;
        this.b = k2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        org.telegram.ui.ActionBar.k2 k2Var = this.b;
        switch (i10) {
            case 0:
                b6.I0(k2Var.getContext(), k2Var.getResourceProvider());
                break;
            case 1:
                k2Var.presentFragment(new b6());
                break;
            default:
                if (cc.a(k2Var)) {
                    cc.a0(k2Var).I(R.raw.contact_check, dd.L0(2131743176, null), dd.L0(2131743175, null)).j();
                    break;
                }
                break;
        }
    }
}
