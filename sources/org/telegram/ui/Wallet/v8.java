package org.telegram.ui.Wallet;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v8 implements y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d9 b;

    public /* synthetic */ v8(d9 d9Var, int i7) {
        this.a = i7;
        this.b = d9Var;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        int i7 = this.a;
        d9 d9Var = this.b;
        switch (i7) {
            case 0:
                d9.h0(d9Var, (y10) obj);
                break;
            case 1:
                String str = (String) obj;
                if (str == null) {
                    gc I = lc.b0(d9Var).I(R.raw.contact_check, hd.N0(2131742942, null), hd.N0(2131742940, null));
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
