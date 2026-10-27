package ii;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.fp0;
import org.telegram.ui.b10;
import org.telegram.ui.i10;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class z implements i10 {
    public final /* synthetic */ j0 a;

    public z(j0 j0Var) {
        this.a = j0Var;
    }

    @Override // org.telegram.ui.i10
    public final boolean c(b10 b10Var) {
        return false;
    }

    @Override // org.telegram.ui.i10
    public final void d(MessageObject messageObject) {
        int i10;
        j0 j0Var = this.a;
        r2 r2Var = j0Var.s;
        i10 = ((k3) j0Var).currentAccount;
        r2Var.presentFragment(fp0.M(messageObject, i10));
        j0Var.dismiss();
    }

    @Override // org.telegram.ui.i10
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.i10
    public final void a() {
    }

    @Override // org.telegram.ui.i10
    public final void e(MessageObject messageObject, View view, int i10) {
    }
}
