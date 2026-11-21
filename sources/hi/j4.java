package hi;

import android.view.KeyEvent;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j4 implements org.telegram.ui.ActionBar.e1, t10 {
    public final /* synthetic */ k5 a;

    public /* synthetic */ j4(k5 k5Var) {
        this.a = k5Var;
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        k5 k5Var = this.a;
        k5Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = k5Var.r1) != null && g1Var.isShowing()) {
            k5Var.r1.d(true);
        }
    }

    @Override // org.telegram.messenger.t10
    public void m(Object obj, TLRPC.Document document, Boolean bool) {
        k5 k5Var = this.a;
        k5Var.V1 = true;
        b5 k02 = k5Var.k0(obj, document);
        if (bool.booleanValue()) {
            k02.setScale(1.5f);
        }
        k5Var.b0(k02);
    }
}
