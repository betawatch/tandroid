package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.fc;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class i4 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gi.d b;
    public final /* synthetic */ org.telegram.ui.ActionBar.t2 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 d;

    public /* synthetic */ i4(gi.d dVar, org.telegram.ui.ActionBar.t2 t2Var, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        this.a = i3;
        this.b = dVar;
        this.c = t2Var;
        this.d = e6Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        String str = (String) obj;
        switch (this.a) {
            case 0:
                this.b.setLoading(false);
                boolean isEmpty = TextUtils.isEmpty(str);
                org.telegram.ui.ActionBar.t2 t2Var = this.c;
                if (!isEmpty) {
                    new fc(t2Var.F, this.d).e0(str, false);
                    break;
                } else {
                    t2Var.dismiss();
                    break;
                }
            default:
                this.b.setLoading(false);
                org.telegram.ui.ActionBar.t2 t2Var2 = this.c;
                if (str == null) {
                    t2Var2.dismiss();
                    break;
                } else {
                    new fc(t2Var2.F, this.d).e0(str, false);
                    break;
                }
        }
    }
}
