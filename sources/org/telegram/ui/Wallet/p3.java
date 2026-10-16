package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.zc;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ di.d b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e3 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 d;

    public /* synthetic */ p3(di.d dVar, org.telegram.ui.ActionBar.e3 e3Var, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        this.a = i10;
        this.b = dVar;
        this.c = e3Var;
        this.d = c6Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        String str = (String) obj;
        switch (this.a) {
            case 0:
                this.b.setLoading(false);
                boolean isEmpty = TextUtils.isEmpty(str);
                org.telegram.ui.ActionBar.e3 e3Var = this.c;
                if (!isEmpty) {
                    new zc(e3Var.topBulletinContainer, this.d).e0(str, false);
                    break;
                } else {
                    e3Var.dismiss();
                    break;
                }
            case 1:
                this.b.setLoading(false);
                org.telegram.ui.ActionBar.e3 e3Var2 = this.c;
                if (str == null) {
                    e3Var2.dismiss();
                    break;
                } else {
                    new zc(e3Var2.topBulletinContainer, this.d).e0(str, false);
                    break;
                }
            default:
                org.telegram.ui.ActionBar.e3 e3Var3 = this.c;
                if (str == null) {
                    this.b.setLoading(false);
                    e3Var3.dismiss();
                    break;
                } else {
                    new zc(e3Var3.topBulletinContainer, this.d).e0(str, false);
                    break;
                }
        }
    }

    public /* synthetic */ p3(org.telegram.ui.ActionBar.e3 e3Var, org.telegram.ui.ActionBar.c6 c6Var, di.d dVar) {
        this.a = 2;
        this.c = e3Var;
        this.d = c6Var;
        this.b = dVar;
    }
}
