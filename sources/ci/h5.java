package ci;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h5 implements org.telegram.ui.ActionBar.k1, Utilities.Callback3Return {
    public final /* synthetic */ q6 a;

    public /* synthetic */ h5(q6 q6Var) {
        this.a = q6Var;
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void p(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        q6 q6Var = this.a;
        q6Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = q6Var.H1) != null && m1Var.isShowing()) {
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
