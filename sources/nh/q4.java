package nh;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q4 implements org.telegram.ui.ActionBar.m1, Utilities.Callback3Return {
    public final /* synthetic */ t5 a;

    public /* synthetic */ q4(t5 t5Var) {
        this.a = t5Var;
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        t5 t5Var = this.a;
        t5Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = t5Var.D1) != null && o1Var.isShowing()) {
            t5Var.D1.d(true);
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback3Return
    public Object run(Object obj, Object obj2, Object obj3) {
        t5 t5Var = this.a;
        t5Var.h2 = true;
        g5 n02 = t5Var.n0(obj, (TLRPC.Document) obj2);
        if (((Boolean) obj3).booleanValue()) {
            n02.setScale(1.5f);
        }
        t5Var.d0(n02);
        return Boolean.TRUE;
    }
}
