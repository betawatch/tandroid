package gi;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.zo0;
import org.telegram.ui.b20;
import org.telegram.ui.u10;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class a0 implements b20 {
    public final /* synthetic */ k0 a;

    public a0(k0 k0Var) {
        this.a = k0Var;
    }

    @Override // org.telegram.ui.b20
    public final boolean b(u10 u10Var) {
        return false;
    }

    @Override // org.telegram.ui.b20
    public final void c(MessageObject messageObject) {
        int i10;
        k0 k0Var = this.a;
        m2 m2Var = k0Var.s;
        i10 = ((e3) k0Var).currentAccount;
        m2Var.presentFragment(zo0.K(messageObject, i10));
        k0Var.dismiss();
    }

    @Override // org.telegram.ui.b20
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.b20
    public final void a() {
    }

    @Override // org.telegram.ui.b20
    public final void d(MessageObject messageObject, View view, int i10) {
    }
}
