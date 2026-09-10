package ei;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ho0;
import org.telegram.ui.r10;
import org.telegram.ui.y10;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class a0 implements y10 {
    public final /* synthetic */ k0 a;

    public a0(k0 k0Var) {
        this.a = k0Var;
    }

    @Override // org.telegram.ui.y10
    public final boolean b(r10 r10Var) {
        return false;
    }

    @Override // org.telegram.ui.y10
    public final void c(MessageObject messageObject) {
        int i10;
        k0 k0Var = this.a;
        p2 p2Var = k0Var.s;
        i10 = ((h3) k0Var).currentAccount;
        p2Var.presentFragment(ho0.K(messageObject, i10));
        k0Var.dismiss();
    }

    @Override // org.telegram.ui.y10
    public final boolean f() {
        return false;
    }

    @Override // org.telegram.ui.y10
    public final void a() {
    }

    @Override // org.telegram.ui.y10
    public final void d(MessageObject messageObject, View view, int i10) {
    }
}
