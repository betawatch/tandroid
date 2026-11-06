package org.telegram.ui.Wallet;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g8 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o8 b;

    public /* synthetic */ g8(o8 o8Var, int i7) {
        this.a = i7;
        this.b = o8Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7 = this.a;
        o8 o8Var = this.b;
        switch (i7) {
            case 0:
                n0.x(o8Var.currentAccount).z(new v1(2, o8Var, (c20) obj), true, false);
                break;
            case 1:
                String str = (String) obj;
                if (str == null) {
                    cc I = hc.a0(o8Var).I(R.raw.contact_check, hd.M0(2131743189, null), hd.M0(2131743187, null));
                    I.j = 5000;
                    I.j();
                    o8Var.a.f3.O(true);
                    break;
                } else {
                    hc.a0(o8Var).e0(str, false);
                    break;
                }
            default:
                o8.f0(o8Var, (Boolean) obj);
                break;
        }
    }
}
