package org.telegram.ui.Wallet;

import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f8 b;

    public /* synthetic */ e8(f8 f8Var, int i7) {
        this.a = i7;
        this.b = f8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        f8 f8Var = this.b;
        switch (i7) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f8Var.getParentActivity(), f8Var.getResourceProvider());
                alertDialog$Builder.a.T = hd.M0(2131743125, null);
                jg.g.C(null, 2131747830, alertDialog$Builder, null);
                break;
            default:
                f8Var.d0();
                break;
        }
    }
}
