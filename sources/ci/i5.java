package ci;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i5 implements org.telegram.ui.ActionBar.m1, Utilities.Callback3Return {
    public final /* synthetic */ r6 a;

    public /* synthetic */ i5(r6 r6Var) {
        this.a = r6Var;
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        r6 r6Var = this.a;
        r6Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = r6Var.H1) != null && o1Var.isShowing()) {
            r6Var.H1.d(true);
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback3Return
    public Object run(Object obj, Object obj2, Object obj3) {
        r6 r6Var = this.a;
        r6Var.l2 = true;
        d6 n02 = r6Var.n0(obj, (TLRPC.Document) obj2);
        if (((Boolean) obj3).booleanValue()) {
            n02.setScale(1.5f);
        }
        r6Var.d0(n02);
        return Boolean.TRUE;
    }
}
