package ei;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y4 implements org.telegram.ui.ActionBar.k1, Utilities.Callback3Return {
    public final /* synthetic */ f6 a;

    public /* synthetic */ y4(f6 f6Var) {
        this.a = f6Var;
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        f6 f6Var = this.a;
        f6Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = f6Var.H1) != null && m1Var.isShowing()) {
            f6Var.H1.d(true);
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback3Return
    public Object run(Object obj, Object obj2, Object obj3) {
        f6 f6Var = this.a;
        f6Var.l2 = true;
        s5 m0 = f6Var.m0(obj, (TLRPC.Document) obj2);
        if (((Boolean) obj3).booleanValue()) {
            m0.setScale(1.5f);
        }
        f6Var.d0(m0);
        return Boolean.TRUE;
    }
}
