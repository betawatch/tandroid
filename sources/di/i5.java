package di;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class i5 implements org.telegram.ui.ActionBar.l1, Utilities.Callback3Return {
    public final /* synthetic */ q6 a;

    public /* synthetic */ i5(q6 q6Var) {
        this.a = q6Var;
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void n(KeyEvent keyEvent) {
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
        d6 n02 = q6Var.n0(obj, (TLRPC.Document) obj2);
        if (((Boolean) obj3).booleanValue()) {
            n02.setScale(1.5f);
        }
        q6Var.d0(n02);
        return Boolean.TRUE;
    }
}
