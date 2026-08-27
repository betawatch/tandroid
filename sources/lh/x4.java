package lh;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x4 implements org.telegram.ui.ActionBar.l1, Utilities.Callback3Return {
    public final /* synthetic */ f6 a;

    public /* synthetic */ x4(f6 f6Var) {
        this.a = f6Var;
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        f6 f6Var = this.a;
        f6Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = f6Var.D1) != null && n1Var.isShowing()) {
            f6Var.D1.d(true);
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback3Return
    public Object run(Object obj, Object obj2, Object obj3) {
        f6 f6Var = this.a;
        f6Var.h2 = true;
        s5 n02 = f6Var.n0(obj, (TLRPC.Document) obj2);
        if (((Boolean) obj3).booleanValue()) {
            n02.setScale(1.5f);
        }
        f6Var.d0(n02);
        return Boolean.TRUE;
    }
}
