package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.z10;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class o4 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hi.d b;
    public final /* synthetic */ org.telegram.ui.ActionBar.u2 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 d;

    public /* synthetic */ o4(hi.d dVar, org.telegram.ui.ActionBar.u2 u2Var, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        this.a = i7;
        this.b = dVar;
        this.c = u2Var;
        this.d = e6Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        String str = (String) obj;
        switch (this.a) {
            case 0:
                this.b.setLoading(false);
                boolean isEmpty = TextUtils.isEmpty(str);
                org.telegram.ui.ActionBar.u2 u2Var = this.c;
                if (!isEmpty) {
                    new cc(u2Var.F, this.d).e0(str, false);
                    break;
                } else {
                    u2Var.dismiss();
                    break;
                }
            default:
                this.b.setLoading(false);
                org.telegram.ui.ActionBar.u2 u2Var2 = this.c;
                if (str == null) {
                    u2Var2.dismiss();
                    break;
                } else {
                    new cc(u2Var2.F, this.d).e0(str, false);
                    break;
                }
        }
    }
}
