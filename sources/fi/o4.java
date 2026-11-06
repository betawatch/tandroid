package fi;

import android.view.KeyEvent;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o4 implements org.telegram.ui.ActionBar.e1, y10 {
    public final /* synthetic */ o5 a;

    public /* synthetic */ o4(o5 o5Var) {
        this.a = o5Var;
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

    @Override // org.telegram.messenger.y10
    public void k(Object obj, TLRPC.Document document, Boolean bool) {
        o5 o5Var = this.a;
        o5Var.U1 = true;
        f5 k02 = o5Var.k0(obj, document);
        if (bool.booleanValue()) {
            k02.setScale(1.5f);
        }
        o5Var.b0(k02);
    }
}
