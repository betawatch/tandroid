package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.w10;
import org.telegram.ui.Components.kc;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class x4 implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hi.e b;
    public final /* synthetic */ org.telegram.ui.ActionBar.w2 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 d;

    public /* synthetic */ x4(hi.e eVar, org.telegram.ui.ActionBar.w2 w2Var, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        this.a = i7;
        this.b = eVar;
        this.c = w2Var;
        this.d = i6Var;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        String str = (String) obj;
        switch (this.a) {
            case 0:
                this.b.setLoading(false);
                boolean isEmpty = TextUtils.isEmpty(str);
                org.telegram.ui.ActionBar.w2 w2Var = this.c;
                if (!isEmpty) {
                    new kc(w2Var.F, this.d).f0(str, false);
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
                    new kc(w2Var2.F, this.d).f0(str, false);
                    break;
                }
        }
    }
}
