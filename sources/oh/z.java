package oh;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.jn0;
import org.telegram.ui.a10;
import org.telegram.ui.h10;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class z implements h10 {
    public final /* synthetic */ j0 a;

    public z(j0 j0Var) {
        this.a = j0Var;
    }

    @Override // org.telegram.ui.h10
    public final boolean b(a10 a10Var) {
        return false;
    }

    @Override // org.telegram.ui.h10
    public final void c(MessageObject messageObject) {
        int i10;
        j0 j0Var = this.a;
        n2 n2Var = j0Var.s;
        i10 = ((e3) j0Var).currentAccount;
        n2Var.presentFragment(jn0.K(messageObject, i10));
        j0Var.dismiss();
    }

    @Override // org.telegram.ui.h10
    public final boolean f() {
        return false;
    }

    @Override // org.telegram.ui.h10
    public final void a() {
    }

    @Override // org.telegram.ui.h10
    public final void d(MessageObject messageObject, View view, int i10) {
    }
}
