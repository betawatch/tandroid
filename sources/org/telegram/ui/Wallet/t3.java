package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.wc;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ fi.d b;
    public final /* synthetic */ org.telegram.ui.ActionBar.k3 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 d;

    public /* synthetic */ t3(fi.d dVar, org.telegram.ui.ActionBar.k3 k3Var, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        this.a = i10;
        this.b = dVar;
        this.c = k3Var;
        this.d = u6Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        String str = (String) obj;
        switch (this.a) {
            case 0:
                this.b.setLoading(false);
                boolean isEmpty = TextUtils.isEmpty(str);
                org.telegram.ui.ActionBar.k3 k3Var = this.c;
                if (!isEmpty) {
                    new wc(k3Var.topBulletinContainer, this.d).f0(str, false);
                    break;
                } else {
                    k3Var.dismiss();
                    break;
                }
            case 1:
                this.b.setLoading(false);
                org.telegram.ui.ActionBar.k3 k3Var2 = this.c;
                if (str == null) {
                    k3Var2.dismiss();
                    break;
                } else {
                    new wc(k3Var2.topBulletinContainer, this.d).f0(str, false);
                    break;
                }
            default:
                org.telegram.ui.ActionBar.k3 k3Var3 = this.c;
                if (str == null) {
                    this.b.setLoading(false);
                    k3Var3.dismiss();
                    break;
                } else {
                    new wc(k3Var3.topBulletinContainer, this.d).f0(str, false);
                    break;
                }
        }
    }

    public /* synthetic */ t3(org.telegram.ui.ActionBar.k3 k3Var, org.telegram.ui.ActionBar.u6 u6Var, fi.d dVar) {
        this.a = 2;
        this.c = k3Var;
        this.d = u6Var;
        this.b = dVar;
    }
}
