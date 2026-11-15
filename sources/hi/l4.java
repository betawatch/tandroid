package hi;

import android.view.KeyEvent;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class l4 implements org.telegram.ui.ActionBar.e1, v10 {
    public final /* synthetic */ m5 a;

    public /* synthetic */ l4(m5 m5Var) {
        this.a = m5Var;
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        m5 m5Var = this.a;
        m5Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = m5Var.r1) != null && g1Var.isShowing()) {
            m5Var.r1.d(true);
        }
    }

    @Override // org.telegram.messenger.v10
    public void l(Object obj, TLRPC.Document document, Boolean bool) {
        m5 m5Var = this.a;
        m5Var.V1 = true;
        d5 k02 = m5Var.k0(obj, document);
        if (bool.booleanValue()) {
            k02.setScale(1.5f);
        }
        m5Var.b0(k02);
    }
}
