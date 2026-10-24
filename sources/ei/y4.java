package ei;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y4 implements org.telegram.ui.ActionBar.k1, Utilities.Callback3Return {
    public final /* synthetic */ f6 a;

    public /* synthetic */ y4(f6 f6Var) {
        this.a = f6Var;
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void j(KeyEvent keyEvent) {
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
        s5 l02 = f6Var.l0(obj, (TLRPC.Document) obj2);
        if (((Boolean) obj3).booleanValue()) {
            l02.setScale(1.5f);
        }
        f6Var.c0(l02);
        return Boolean.TRUE;
    }
}
