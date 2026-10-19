package hi;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.vo0;
import org.telegram.ui.d10;
import org.telegram.ui.w00;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class a0 implements d10 {
    public final /* synthetic */ k0 a;

    public a0(k0 k0Var) {
        this.a = k0Var;
    }

    @Override // org.telegram.ui.d10
    public final boolean b(w00 w00Var) {
        return false;
    }

    @Override // org.telegram.ui.d10
    public final void c(MessageObject messageObject) {
        int i10;
        k0 k0Var = this.a;
        n2 n2Var = k0Var.s;
        i10 = ((f3) k0Var).currentAccount;
        n2Var.presentFragment(vo0.K(messageObject, i10));
        k0Var.dismiss();
    }

    @Override // org.telegram.ui.d10
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.d10
    public final void a() {
    }

    @Override // org.telegram.ui.d10
    public final void d(MessageObject messageObject, View view, int i10) {
    }
}
