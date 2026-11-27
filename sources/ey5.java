// default package

import android.view.KeyEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
