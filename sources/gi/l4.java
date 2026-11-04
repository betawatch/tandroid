package gi;

import android.view.KeyEvent;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l4 implements org.telegram.ui.ActionBar.d1, q10 {
    public final /* synthetic */ m5 a;

    public /* synthetic */ l4(m5 m5Var) {
        this.a = m5Var;
    }

    @Override // org.telegram.messenger.q10
    public void i(Object obj, TLRPC.Document document, Boolean bool) {
        m5 m5Var = this.a;
        m5Var.V1 = true;
        d5 k02 = m5Var.k0(obj, document);
        if (bool.booleanValue()) {
            k02.setScale(1.5f);
        }
        m5Var.b0(k02);
    }

    @Override // org.telegram.ui.ActionBar.d1
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.f1 f1Var;
        m5 m5Var = this.a;
        m5Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (f1Var = m5Var.r1) != null && f1Var.isShowing()) {
            m5Var.r1.d(true);
        }
    }
}
