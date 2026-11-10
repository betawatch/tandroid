package org.telegram.ui.Wallet;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.gc;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h8 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p8 b;

    public /* synthetic */ h8(p8 p8Var, int i7) {
        this.a = i7;
        this.b = p8Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7 = this.a;
        p8 p8Var = this.b;
        switch (i7) {
            case 0:
                l0.x(p8Var.currentAccount).z(new t1(2, p8Var, (c20) obj), true, false);
                break;
            case 1:
                String str = (String) obj;
                if (str == null) {
                    bc I = gc.a0(p8Var).I(R.raw.contact_check, id.M0(2131743188, null), id.M0(2131743186, null));
                    I.j = 5000;
                    I.j();
                    p8Var.a.f3.O(true);
                    break;
                } else {
                    gc.a0(p8Var).e0(str, false);
                    break;
                }
            default:
                p8.f0(p8Var, (Boolean) obj);
                break;
        }
    }
}
