package org.telegram.ui.Wallet;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class v8 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d9 b;

    public /* synthetic */ v8(d9 d9Var, int i7) {
        this.a = i7;
        this.b = d9Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        int i7 = this.a;
        d9 d9Var = this.b;
        switch (i7) {
            case 0:
                d9.h0(d9Var, (x10) obj);
                break;
            case 1:
                String str = (String) obj;
                if (str == null) {
                    gc I = lc.b0(d9Var).I(R.raw.contact_check, gd.M0(2131742950, null), gd.M0(2131742948, null));
                    I.j = 5000;
                    I.j();
                    d9Var.a.g3.O(true);
                    break;
                } else {
                    lc.b0(d9Var).f0(str, false);
                    break;
                }
            default:
                d9.d0(d9Var, (Boolean) obj);
                break;
        }
    }
}
