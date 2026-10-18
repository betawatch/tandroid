package hi;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.vo0;
import org.telegram.ui.f10;
import org.telegram.ui.y00;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class a0 implements f10 {
    public final /* synthetic */ k0 a;

    public a0(k0 k0Var) {
        this.a = k0Var;
    }

    @Override // org.telegram.ui.f10
    public final boolean b(y00 y00Var) {
        return false;
    }

    @Override // org.telegram.ui.f10
    public final void c(MessageObject messageObject) {
        int i10;
        k0 k0Var = this.a;
        n2 n2Var = k0Var.s;
        i10 = ((f3) k0Var).currentAccount;
        n2Var.presentFragment(vo0.K(messageObject, i10));
        k0Var.dismiss();
    }

    @Override // org.telegram.ui.f10
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.f10
    public final void a() {
    }

    @Override // org.telegram.ui.f10
    public final void d(MessageObject messageObject, View view, int i10) {
    }
}
