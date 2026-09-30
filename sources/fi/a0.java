package fi;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.no0;
import org.telegram.ui.l10;
import org.telegram.ui.s10;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final class a0 implements s10 {
    public final /* synthetic */ k0 a;

    public a0(k0 k0Var) {
        this.a = k0Var;
    }

    @Override // org.telegram.ui.s10
    public final boolean c(l10 l10Var) {
        return false;
    }

    @Override // org.telegram.ui.s10
    public final void d(MessageObject messageObject) {
        int i10;
        k0 k0Var = this.a;
        m2 m2Var = k0Var.s;
        i10 = ((e3) k0Var).currentAccount;
        m2Var.presentFragment(no0.K(messageObject, i10));
        k0Var.dismiss();
    }

    @Override // org.telegram.ui.s10
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.s10
    public final void a() {
    }

    @Override // org.telegram.ui.s10
    public final void e(MessageObject messageObject, View view, int i10) {
    }
}
