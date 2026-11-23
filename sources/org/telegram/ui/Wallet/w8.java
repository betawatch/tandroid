package org.telegram.ui.Wallet;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.w10;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.kc;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class w8 implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e9 b;

    public /* synthetic */ w8(e9 e9Var, int i7) {
        this.a = i7;
        this.b = e9Var;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        int i7 = this.a;
        e9 e9Var = this.b;
        switch (i7) {
            case 0:
                e9.h0(e9Var, (w10) obj);
                break;
            case 1:
                String str = (String) obj;
                if (str == null) {
                    fc I = kc.b0(e9Var).I(R.raw.contact_check, gd.N0(2131742937, null), gd.N0(2131742935, null));
                    I.j = 5000;
                    I.j();
                    e9Var.a.g3.O(true);
                    break;
                } else {
                    kc.b0(e9Var).f0(str, false);
                    break;
                }
            default:
                e9.d0(e9Var, (Boolean) obj);
                break;
        }
    }
}
