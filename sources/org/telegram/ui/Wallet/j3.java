package org.telegram.ui.Wallet;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.ui.Components.hc;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 b;

    public /* synthetic */ j3(int i7, org.telegram.ui.ActionBar.f2 f2Var) {
        this.a = i7;
        this.b = f2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.ui.ActionBar.f2 f2Var = this.b;
        switch (i7) {
            case 0:
                x5.I0(f2Var.getContext(), f2Var.getResourceProvider());
                break;
            case 1:
                f2Var.presentFragment(new x5());
                break;
            default:
                if (hc.a(f2Var)) {
                    hc.a0(f2Var).I(R.raw.contact_check, id.M0(2131743153, null), id.M0(2131743152, null)).j();
                    break;
                }
                break;
        }
    }
}
