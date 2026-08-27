package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w3 implements org.telegram.ui.ActionBar.a2, c4, GenericProvider {
    public final /* synthetic */ e4 a;

    public /* synthetic */ w3(e4 e4Var) {
        this.a = e4Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.a.b.dismiss();
    }

    @Override // nh.c4
    public void i(boolean z10) {
        e4 e4Var = this.a;
        if (e4Var.K()) {
            return;
        }
        e4Var.F.e(0.0f);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        return Boolean.valueOf(this.a.b.n1.getKeyboardHeight() >= AndroidUtilities.dp(20.0f));
    }
}
