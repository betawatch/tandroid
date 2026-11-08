package fi;

import android.view.KeyEvent;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o4 implements org.telegram.ui.ActionBar.e1, y10 {
    public final /* synthetic */ o5 a;

    public /* synthetic */ o4(o5 o5Var) {
        this.a = o5Var;
    }

    @Override // org.telegram.messenger.y10
    public void i(Object obj, TLRPC.Document document, Boolean bool) {
        o5 o5Var = this.a;
        o5Var.U1 = true;
        f5 k02 = o5Var.k0(obj, document);
        if (bool.booleanValue()) {
            k02.setScale(1.5f);
        }
        o5Var.b0(k02);
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        o5 o5Var = this.a;
        o5Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = o5Var.q1) != null && g1Var.isShowing()) {
            o5Var.q1.d(true);
        }
    }
}
