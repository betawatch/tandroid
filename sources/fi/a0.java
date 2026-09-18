package fi;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.zn0;
import org.telegram.ui.r10;
import org.telegram.ui.y10;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class a0 implements y10 {
    public final /* synthetic */ k0 a;

    public a0(k0 k0Var) {
        this.a = k0Var;
    }

    @Override // org.telegram.ui.y10
    public final boolean c(r10 r10Var) {
        return false;
    }

    @Override // org.telegram.ui.y10
    public final void d(MessageObject messageObject) {
        int i10;
        k0 k0Var = this.a;
        o2 o2Var = k0Var.s;
        i10 = ((g3) k0Var).currentAccount;
        o2Var.presentFragment(zn0.L(messageObject, i10));
        k0Var.dismiss();
    }

    @Override // org.telegram.ui.y10
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.y10
    public final void a() {
    }

    @Override // org.telegram.ui.y10
    public final void e(MessageObject messageObject, View view, int i10) {
    }
}
