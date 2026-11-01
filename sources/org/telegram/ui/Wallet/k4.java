package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.r20;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k4 implements r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vh.d b;
    public final /* synthetic */ org.telegram.ui.ActionBar.z2 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 d;

    public /* synthetic */ k4(vh.d dVar, org.telegram.ui.ActionBar.z2 z2Var, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        this.a = i10;
        this.b = dVar;
        this.c = z2Var;
        this.d = p6Var;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        String str = (String) obj;
        switch (this.a) {
            case 0:
                this.b.setLoading(false);
                boolean isEmpty = TextUtils.isEmpty(str);
                org.telegram.ui.ActionBar.z2 z2Var = this.c;
                if (!isEmpty) {
                    new cc(z2Var.E, this.d).e0(str, false);
                    break;
                } else {
                    z2Var.dismiss();
                    break;
                }
            default:
                this.b.setLoading(false);
                org.telegram.ui.ActionBar.z2 z2Var2 = this.c;
                if (str == null) {
                    z2Var2.dismiss();
                    break;
                } else {
                    new cc(z2Var2.E, this.d).e0(str, false);
                    break;
                }
        }
    }
}
