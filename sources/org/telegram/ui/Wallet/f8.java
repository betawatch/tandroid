package org.telegram.ui.Wallet;

import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.fc;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class f8 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n8 b;

    public /* synthetic */ f8(n8 n8Var, int i3) {
        this.a = i3;
        this.b = n8Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        int i3 = this.a;
        n8 n8Var = this.b;
        switch (i3) {
            case 0:
                k0.x(n8Var.currentAccount).z(new s1(3, n8Var, (u10) obj), true, false);
                break;
            case 1:
                String str = (String) obj;
                if (str == null) {
                    ac I = fc.a0(n8Var).I(R.raw.contact_check, bd.M0(2131743198, null), bd.M0(2131743196, null));
                    I.j = 5000;
                    I.j();
                    n8Var.a.g3.O(true);
                    break;
                } else {
                    fc.a0(n8Var).e0(str, false);
                    break;
                }
            default:
                n8.f0(n8Var, (Boolean) obj);
                break;
        }
    }
}
