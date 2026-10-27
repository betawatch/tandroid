package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.wc;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 b;

    public /* synthetic */ t2(int i10, org.telegram.ui.ActionBar.r2 r2Var) {
        this.a = i10;
        this.b = r2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.r2 r2Var = this.b;
                m5.E0(r2Var.getContext(), r2Var.getResourceProvider());
                break;
            case 1:
                this.b.presentFragment(new m5());
                break;
            default:
                org.telegram.ui.ActionBar.r2 r2Var2 = this.b;
                if (wc.a(r2Var2)) {
                    wc.b0(r2Var2).M(LocaleController.getString(R.string.WalletCreated), LocaleController.getString(R.string.WalletCreatedInfo), R.raw.contact_check).j();
                    break;
                }
                break;
        }
    }
}
