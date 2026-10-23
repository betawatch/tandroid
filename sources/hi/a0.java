package hi;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.ap0;
import org.telegram.ui.a10;
import org.telegram.ui.h10;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class a0 implements h10 {
    public final /* synthetic */ k0 a;

    public a0(k0 k0Var) {
        this.a = k0Var;
    }

    @Override // org.telegram.ui.h10
    public final boolean b(a10 a10Var) {
        return false;
    }

    @Override // org.telegram.ui.h10
    public final void c(MessageObject messageObject) {
        int i10;
        k0 k0Var = this.a;
        o2 o2Var = k0Var.s;
        i10 = ((h3) k0Var).currentAccount;
        o2Var.presentFragment(ap0.K(messageObject, i10));
        k0Var.dismiss();
    }

    @Override // org.telegram.ui.h10
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.h10
    public final void a() {
    }

    @Override // org.telegram.ui.h10
    public final void d(MessageObject messageObject, View view, int i10) {
    }
}
