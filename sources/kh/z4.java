package kh;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z4 implements org.telegram.ui.ActionBar.m1, Utilities.Callback3Return {
    public final /* synthetic */ g6 a;

    public /* synthetic */ z4(g6 g6Var) {
        this.a = g6Var;
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        g6 g6Var = this.a;
        g6Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = g6Var.D1) != null && o1Var.isShowing()) {
            g6Var.D1.d(true);
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback3Return
    public Object run(Object obj, Object obj2, Object obj3) {
        g6 g6Var = this.a;
        g6Var.h2 = true;
        t5 n02 = g6Var.n0(obj, (TLRPC.Document) obj2);
        if (((Boolean) obj3).booleanValue()) {
            n02.setScale(1.5f);
        }
        g6Var.d0(n02);
        return Boolean.TRUE;
    }
}
