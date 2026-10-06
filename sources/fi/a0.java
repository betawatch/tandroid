package fi;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.qo0;
import org.telegram.ui.p10;
import org.telegram.ui.w10;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class a0 implements w10 {
    public final /* synthetic */ k0 a;

    public a0(k0 k0Var) {
        this.a = k0Var;
    }

    @Override // org.telegram.ui.w10
    public final boolean c(p10 p10Var) {
        return false;
    }

    @Override // org.telegram.ui.w10
    public final void d(MessageObject messageObject) {
        int i10;
        k0 k0Var = this.a;
        n2 n2Var = k0Var.s;
        i10 = ((f3) k0Var).currentAccount;
        n2Var.presentFragment(qo0.M(messageObject, i10));
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
    public final void e(MessageObject messageObject, View view, int i10) {
    }
}
