// default package

import android.view.KeyEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ey5 implements l8, lcc {
    public final /* synthetic */ wy5 a;

    public /* synthetic */ ey5(wy5 wy5Var) {
        this.a = wy5Var;
    }

    @Override // lcc
    public final void h(Object obj, TLRPC.Document document, Boolean bool) {
        ny5 e0 = this.a.e0(obj, document, true);
        if (bool.booleanValue()) {
            e0.setScale(1.5f);
        }
    }

    @Override // l8
    public final void o(KeyEvent keyEvent) {
        wy5 wy5Var;
        n8 n8Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n8Var = (wy5Var = this.a).B1) != null && n8Var.isShowing()) {
            wy5Var.B1.d(true);
        }
    }
}
