package gi;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.zo0;
import org.telegram.ui.a20;
import org.telegram.ui.t10;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class a0 implements a20 {
    public final /* synthetic */ k0 a;

    public a0(k0 k0Var) {
        this.a = k0Var;
    }

    @Override // org.telegram.ui.a20
    public final boolean b(t10 t10Var) {
        return false;
    }

    @Override // org.telegram.ui.a20
    public final void c(MessageObject messageObject) {
        int i10;
        k0 k0Var = this.a;
        m2 m2Var = k0Var.s;
        i10 = ((e3) k0Var).currentAccount;
        m2Var.presentFragment(zo0.K(messageObject, i10));
        k0Var.dismiss();
    }

    @Override // org.telegram.ui.a20
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.a20
    public final void a() {
    }

    @Override // org.telegram.ui.a20
    public final void d(MessageObject messageObject, View view, int i10) {
    }
}
