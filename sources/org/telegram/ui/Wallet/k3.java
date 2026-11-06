package org.telegram.ui.Wallet;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.hc;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 b;

    public /* synthetic */ k3(int i7, org.telegram.ui.ActionBar.f2 f2Var) {
        this.a = i7;
        this.b = f2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.ui.ActionBar.f2 f2Var = this.b;
        switch (i7) {
            case 0:
                y5.I0(f2Var.getContext(), f2Var.getResourceProvider());
                break;
            case 1:
                f2Var.presentFragment(new y5());
                break;
            default:
                if (hc.a(f2Var)) {
                    hc.a0(f2Var).I(R.raw.contact_check, hd.M0(2131743151, null), hd.M0(2131743150, null)).j();
                    break;
                }
                break;
        }
    }
}
