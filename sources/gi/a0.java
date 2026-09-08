package gi;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.yn0;
import org.telegram.ui.p10;
import org.telegram.ui.w10;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class a0 implements w10 {
    public final /* synthetic */ k0 a;

    public a0(k0 k0Var) {
        this.a = k0Var;
    }

    @Override // org.telegram.ui.w10
    public final boolean b(p10 p10Var) {
        return false;
    }

    @Override // org.telegram.ui.w10
    public final void c(MessageObject messageObject) {
        int i10;
        k0 k0Var = this.a;
        n2 n2Var = k0Var.s;
        i10 = ((f3) k0Var).currentAccount;
        n2Var.presentFragment(yn0.K(messageObject, i10));
        k0Var.dismiss();
    }

    @Override // org.telegram.ui.w10
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.w10
    public final void a() {
    }

    @Override // org.telegram.ui.w10
    public final void d(MessageObject messageObject, View view, int i10) {
    }
}
