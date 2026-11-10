package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.c20;
import org.telegram.ui.Components.gc;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p4 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fi.d b;
    public final /* synthetic */ org.telegram.ui.ActionBar.w2 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 d;

    public /* synthetic */ p4(fi.d dVar, org.telegram.ui.ActionBar.w2 w2Var, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        this.a = i7;
        this.b = dVar;
        this.c = w2Var;
        this.d = h6Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        String str = (String) obj;
        switch (this.a) {
            case 0:
                this.b.setLoading(false);
                boolean isEmpty = TextUtils.isEmpty(str);
                org.telegram.ui.ActionBar.w2 w2Var = this.c;
                if (!isEmpty) {
                    new gc(w2Var.E, this.d).e0(str, false);
                    break;
                } else {
                    w2Var.dismiss();
                    break;
                }
            default:
                this.b.setLoading(false);
                org.telegram.ui.ActionBar.w2 w2Var2 = this.c;
                if (str == null) {
                    w2Var2.dismiss();
                    break;
                } else {
                    new gc(w2Var2.E, this.d).e0(str, false);
                    break;
                }
        }
    }
}
