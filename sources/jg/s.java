package jg;

import android.view.KeyEvent;
import org.telegram.messenger.m20;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements org.telegram.ui.ActionBar.i1, m20 {
    public final /* synthetic */ r0 a;

    public /* synthetic */ s(r0 r0Var) {
        this.a = r0Var;
    }

    @Override // org.telegram.messenger.m20
    public void i(Object obj, TLRPC.Document document, Boolean bool) {
        g0 g02 = this.a.g0(obj, document, true);
        if (bool.booleanValue()) {
            g02.setScale(1.5f);
        }
    }

    @Override // org.telegram.ui.ActionBar.i1
    public void r(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.k1 k1Var;
        r0 r0Var = this.a;
        r0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (k1Var = r0Var.A1) != null && k1Var.isShowing()) {
            r0Var.A1.d(true);
        }
    }
}
