package bi;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class e6 implements org.telegram.ui.ActionBar.n1, Utilities.Callback3Return {
    public final /* synthetic */ r7 a;

    public /* synthetic */ e6(r7 r7Var) {
        this.a = r7Var;
    }

    @Override // org.telegram.ui.ActionBar.n1
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        r7 r7Var = this.a;
        r7Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var = r7Var.H1) != null && p1Var.isShowing()) {
            r7Var.H1.d(true);
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback3Return
    public Object run(Object obj, Object obj2, Object obj3) {
        r7 r7Var = this.a;
        r7Var.l2 = true;
        c7 n02 = r7Var.n0(obj, (TLRPC.Document) obj2);
        if (((Boolean) obj3).booleanValue()) {
            n02.setScale(1.5f);
        }
        r7Var.d0(n02);
        return Boolean.TRUE;
    }
}
