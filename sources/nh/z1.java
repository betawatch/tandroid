package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z1 implements c4, GenericProvider, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ b3 a;

    public /* synthetic */ z1(b3 b3Var) {
        this.a = b3Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.a.k(false);
    }

    @Override // nh.c4
    public void i(boolean z10) {
        b3 b3Var = this.a;
        if (b3Var.Z && z10) {
            return;
        }
        b3Var.k(true);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        return Boolean.valueOf(this.a.e.getKeyboardHeight() >= AndroidUtilities.dp(20.0f));
    }
}
