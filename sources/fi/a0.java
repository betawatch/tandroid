package fi;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.yn0;
import org.telegram.ui.p10;
import org.telegram.ui.w10;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
    public final void e(MessageObject messageObject, View view, int i10) {
    }
}
