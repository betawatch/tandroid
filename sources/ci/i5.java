package ci;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final /* synthetic */ class i5 implements org.telegram.ui.ActionBar.l1, Utilities.Callback3Return {
    public final /* synthetic */ r6 a;

    public /* synthetic */ i5(r6 r6Var) {
        this.a = r6Var;
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void p(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        r6 r6Var = this.a;
        r6Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = r6Var.H1) != null && n1Var.isShowing()) {
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
