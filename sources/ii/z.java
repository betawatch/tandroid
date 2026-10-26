package ii;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.ep0;
import org.telegram.ui.g10;
import org.telegram.ui.z00;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class z implements g10 {
    public final /* synthetic */ j0 a;

    public z(j0 j0Var) {
        this.a = j0Var;
    }

    @Override // org.telegram.ui.g10
    public final boolean c(z00 z00Var) {
        return false;
    }

    @Override // org.telegram.ui.g10
    public final void d(MessageObject messageObject) {
        int i10;
        j0 j0Var = this.a;
        r2 r2Var = j0Var.s;
        i10 = ((k3) j0Var).currentAccount;
        r2Var.presentFragment(ep0.M(messageObject, i10));
        j0Var.dismiss();
    }

    @Override // org.telegram.ui.g10
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.g10
    public final void a() {
    }

    @Override // org.telegram.ui.g10
    public final void e(MessageObject messageObject, View view, int i10) {
    }
}
