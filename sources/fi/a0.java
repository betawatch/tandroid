package fi;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.yn0;
import org.telegram.ui.m10;
import org.telegram.ui.t10;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class a0 implements t10 {
    public final /* synthetic */ k0 a;

    public a0(k0 k0Var) {
        this.a = k0Var;
    }

    @Override // org.telegram.ui.t10
    public final boolean c(m10 m10Var) {
        return false;
    }

    @Override // org.telegram.ui.t10
    public final void d(MessageObject messageObject) {
        int i10;
        k0 k0Var = this.a;
        n2 n2Var = k0Var.s;
        i10 = ((f3) k0Var).currentAccount;
        n2Var.presentFragment(yn0.K(messageObject, i10));
        k0Var.dismiss();
    }

    @Override // org.telegram.ui.t10
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.t10
    public final void a() {
    }

    @Override // org.telegram.ui.t10
    public final void e(MessageObject messageObject, View view, int i10) {
    }
}
