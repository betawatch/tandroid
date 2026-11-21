package org.telegram.ui.Wallet;

import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u8 b;

    public /* synthetic */ t8(u8 u8Var, int i7) {
        this.a = i7;
        this.b = u8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        u8 u8Var = this.b;
        switch (i7) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, u8Var.getParentActivity(), u8Var.getResourceProvider());
                alertDialog$Builder.a.U = gd.N0(2131742880, null);
                org.telegram.messenger.f3.m(null, 2131747637, alertDialog$Builder, null);
                break;
            default:
                u8Var.d0();
                break;
        }
    }
}
