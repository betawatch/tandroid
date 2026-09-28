package fi;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.no0;
import org.telegram.ui.l10;
import org.telegram.ui.s10;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
