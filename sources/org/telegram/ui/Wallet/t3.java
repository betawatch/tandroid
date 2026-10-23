package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ei.d b;
    public final /* synthetic */ org.telegram.ui.ActionBar.h3 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 d;

    public /* synthetic */ t3(ei.d dVar, org.telegram.ui.ActionBar.h3 h3Var, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        this.a = i10;
        this.b = dVar;
        this.c = h3Var;
        this.d = g6Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        String str = (String) obj;
        switch (this.a) {
            case 0:
                this.b.setLoading(false);
                boolean isEmpty = TextUtils.isEmpty(str);
                org.telegram.ui.ActionBar.h3 h3Var = this.c;
                if (!isEmpty) {
                    new xc(h3Var.topBulletinContainer, this.d).e0(str, false);
                    break;
                } else {
                    h3Var.dismiss();
                    break;
                }
            case 1:
                this.b.setLoading(false);
                org.telegram.ui.ActionBar.h3 h3Var2 = this.c;
                if (str == null) {
                    h3Var2.dismiss();
                    break;
                } else {
                    new xc(h3Var2.topBulletinContainer, this.d).e0(str, false);
                    break;
                }
            default:
                org.telegram.ui.ActionBar.h3 h3Var3 = this.c;
                if (str == null) {
                    this.b.setLoading(false);
                    h3Var3.dismiss();
                    break;
                } else {
                    new xc(h3Var3.topBulletinContainer, this.d).e0(str, false);
                    break;
                }
        }
    }

    public /* synthetic */ t3(org.telegram.ui.ActionBar.h3 h3Var, org.telegram.ui.ActionBar.g6 g6Var, ei.d dVar) {
        this.a = 2;
        this.c = h3Var;
        this.d = g6Var;
        this.b = dVar;
    }
}
