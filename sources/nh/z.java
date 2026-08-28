package nh;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.hn0;
import org.telegram.ui.e10;
import org.telegram.ui.x00;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class z implements e10 {
    public final /* synthetic */ j0 a;

    public z(j0 j0Var) {
        this.a = j0Var;
    }

    @Override // org.telegram.ui.e10
    public final boolean b(x00 x00Var) {
        return false;
    }

    @Override // org.telegram.ui.e10
    public final void c(MessageObject messageObject) {
        int i9;
        j0 j0Var = this.a;
        o2 o2Var = j0Var.s;
        i9 = ((f3) j0Var).currentAccount;
        o2Var.presentFragment(hn0.K(messageObject, i9));
        j0Var.dismiss();
    }

    @Override // org.telegram.ui.e10
    public final boolean f() {
        return false;
    }

    @Override // org.telegram.ui.e10
    public final void a() {
    }

    @Override // org.telegram.ui.e10
    public final void d(MessageObject messageObject, View view, int i9) {
    }
}
