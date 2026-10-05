package ci;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h5 implements org.telegram.ui.ActionBar.l1, Utilities.Callback3Return {
    public final /* synthetic */ q6 a;

    public /* synthetic */ h5(q6 q6Var) {
        this.a = q6Var;
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        q6 q6Var = this.a;
        q6Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = q6Var.H1) != null && n1Var.isShowing()) {
            q6Var.H1.d(true);
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback3Return
    public Object run(Object obj, Object obj2, Object obj3) {
        q6 q6Var = this.a;
        q6Var.l2 = true;
        c6 n02 = q6Var.n0(obj, (TLRPC.Document) obj2);
        if (((Boolean) obj3).booleanValue()) {
            n02.setScale(1.5f);
        }
        q6Var.d0(n02);
        return Boolean.TRUE;
    }
}
