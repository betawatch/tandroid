package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.c20;
import org.telegram.ui.Components.hc;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j4 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fi.d b;
    public final /* synthetic */ org.telegram.ui.ActionBar.v2 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 d;

    public /* synthetic */ j4(fi.d dVar, org.telegram.ui.ActionBar.v2 v2Var, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        this.a = i7;
        this.b = dVar;
        this.c = v2Var;
        this.d = f6Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        String str = (String) obj;
        switch (this.a) {
            case 0:
                this.b.setLoading(false);
                boolean isEmpty = TextUtils.isEmpty(str);
                org.telegram.ui.ActionBar.v2 v2Var = this.c;
                if (!isEmpty) {
                    new hc(v2Var.E, this.d).e0(str, false);
                    break;
                } else {
                    v2Var.dismiss();
                    break;
                }
            default:
                this.b.setLoading(false);
                org.telegram.ui.ActionBar.v2 v2Var2 = this.c;
                if (str == null) {
                    v2Var2.dismiss();
                    break;
                } else {
                    new hc(v2Var2.E, this.d).e0(str, false);
                    break;
                }
        }
    }
}
