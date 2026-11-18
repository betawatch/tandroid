package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class w4 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hi.d b;
    public final /* synthetic */ org.telegram.ui.ActionBar.x2 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 d;

    public /* synthetic */ w4(hi.d dVar, org.telegram.ui.ActionBar.x2 x2Var, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        this.a = i7;
        this.b = dVar;
        this.c = x2Var;
        this.d = i6Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        String str = (String) obj;
        switch (this.a) {
            case 0:
                this.b.setLoading(false);
                boolean isEmpty = TextUtils.isEmpty(str);
                org.telegram.ui.ActionBar.x2 x2Var = this.c;
                if (!isEmpty) {
                    new lc(x2Var.F, this.d).f0(str, false);
                    break;
                } else {
                    x2Var.dismiss();
                    break;
                }
            default:
                this.b.setLoading(false);
                org.telegram.ui.ActionBar.x2 x2Var2 = this.c;
                if (str == null) {
                    x2Var2.dismiss();
                    break;
                } else {
                    new lc(x2Var2.F, this.d).f0(str, false);
                    break;
                }
        }
    }
}
