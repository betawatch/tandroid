package di;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g5 implements org.telegram.ui.ActionBar.k1, Utilities.Callback3Return {
    public final /* synthetic */ o6 a;

    public /* synthetic */ g5(o6 o6Var) {
        this.a = o6Var;
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        o6 o6Var = this.a;
        o6Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = o6Var.H1) != null && m1Var.isShowing()) {
            o6Var.H1.d(true);
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback3Return
    public Object run(Object obj, Object obj2, Object obj3) {
        o6 o6Var = this.a;
        o6Var.l2 = true;
        b6 m0 = o6Var.m0(obj, (TLRPC.Document) obj2);
        if (((Boolean) obj3).booleanValue()) {
            m0.setScale(1.5f);
        }
        o6Var.d0(m0);
        return Boolean.TRUE;
    }
}
