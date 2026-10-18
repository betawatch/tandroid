package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ei.d b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f3 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 d;

    public /* synthetic */ t3(ei.d dVar, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        this.a = i10;
        this.b = dVar;
        this.c = f3Var;
        this.d = d6Var;
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
                    new xc(f3Var.topBulletinContainer, this.d).e0(str, false);
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
                    new xc(f3Var2.topBulletinContainer, this.d).e0(str, false);
                    break;
                }
            default:
                org.telegram.ui.ActionBar.f3 f3Var3 = this.c;
                if (str == null) {
                    this.b.setLoading(false);
                    f3Var3.dismiss();
                    break;
                } else {
                    new xc(f3Var3.topBulletinContainer, this.d).e0(str, false);
                    break;
                }
        }
    }

    public /* synthetic */ t3(org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.d6 d6Var, ei.d dVar) {
        this.a = 2;
        this.c = f3Var;
        this.d = d6Var;
        this.b = dVar;
    }
}
