package fi;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x4 implements org.telegram.ui.ActionBar.m1, Utilities.Callback3Return {
    public final /* synthetic */ e6 a;

    public /* synthetic */ x4(e6 e6Var) {
        this.a = e6Var;
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        e6 e6Var = this.a;
        e6Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = e6Var.w1) != null && o1Var.isShowing()) {
            e6Var.w1.d(true);
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback3Return
    public Object run(Object obj, Object obj2, Object obj3) {
        e6 e6Var = this.a;
        e6Var.a2 = true;
        r5 k02 = e6Var.k0(obj, (TLRPC.Document) obj2);
        if (((Boolean) obj3).booleanValue()) {
            k02.setScale(1.5f);
        }
        e6Var.b0(k02);
        return Boolean.TRUE;
    }
}
