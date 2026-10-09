package fi;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.dp0;
import org.telegram.ui.o10;
import org.telegram.ui.v10;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class a0 implements v10 {
    public final /* synthetic */ k0 a;

    public a0(k0 k0Var) {
        this.a = k0Var;
    }

    @Override // org.telegram.ui.v10
    public final boolean c(o10 o10Var) {
        return false;
    }

    @Override // org.telegram.ui.v10
    public final void d(MessageObject messageObject) {
        int i10;
        k0 k0Var = this.a;
        n2 n2Var = k0Var.s;
        i10 = ((f3) k0Var).currentAccount;
        n2Var.presentFragment(dp0.K(messageObject, i10));
        k0Var.dismiss();
    }

    @Override // org.telegram.ui.v10
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.v10
    public final void a() {
    }

    @Override // org.telegram.ui.v10
    public final void e(MessageObject messageObject, View view, int i10) {
    }
}
