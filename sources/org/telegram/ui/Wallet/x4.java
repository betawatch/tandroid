package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x4 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hi.e b;
    public final /* synthetic */ org.telegram.ui.ActionBar.w2 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 d;

    public /* synthetic */ x4(hi.e eVar, org.telegram.ui.ActionBar.w2 w2Var, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        this.a = i7;
        this.b = eVar;
        this.c = w2Var;
        this.d = h6Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        String str = (String) obj;
        switch (this.a) {
            case 0:
                this.b.setLoading(false);
                boolean isEmpty = TextUtils.isEmpty(str);
                org.telegram.ui.ActionBar.w2 w2Var = this.c;
                if (!isEmpty) {
                    new lc(w2Var.F, this.d).f0(str, false);
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
                    new lc(w2Var2.F, this.d).f0(str, false);
                    break;
                }
        }
    }
}
