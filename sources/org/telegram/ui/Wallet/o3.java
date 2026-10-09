package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ad;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ci.d b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f3 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 d;

    public /* synthetic */ o3(ci.d dVar, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        this.a = i10;
        this.b = dVar;
        this.c = f3Var;
        this.d = e6Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        String str = (String) obj;
        switch (this.a) {
            case 0:
                this.b.setLoading(false);
                boolean isEmpty = TextUtils.isEmpty(str);
                org.telegram.ui.ActionBar.f3 f3Var = this.c;
                if (!isEmpty) {
                    new ad(f3Var.topBulletinContainer, this.d).e0(str, false);
                    break;
                } else {
                    f3Var.dismiss();
                    break;
                }
            case 1:
                this.b.setLoading(false);
                org.telegram.ui.ActionBar.f3 f3Var2 = this.c;
                if (str == null) {
                    f3Var2.dismiss();
                    break;
                } else {
                    new ad(f3Var2.topBulletinContainer, this.d).e0(str, false);
                    break;
                }
            default:
                org.telegram.ui.ActionBar.f3 f3Var3 = this.c;
                if (str == null) {
                    this.b.setLoading(false);
                    f3Var3.dismiss();
                    break;
                } else {
                    new ad(f3Var3.topBulletinContainer, this.d).e0(str, false);
                    break;
                }
        }
    }

    public /* synthetic */ o3(org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.e6 e6Var, ci.d dVar) {
        this.a = 2;
        this.c = f3Var;
        this.d = e6Var;
        this.b = dVar;
    }
}
