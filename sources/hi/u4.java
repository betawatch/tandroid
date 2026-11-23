package hi;

import android.view.KeyEvent;
import org.telegram.messenger.s10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class u4 implements org.telegram.ui.ActionBar.e1, s10 {
    public final /* synthetic */ v5 a;

    public /* synthetic */ u4(v5 v5Var) {
        this.a = v5Var;
    }

    @Override // org.telegram.messenger.s10
    public void l(Object obj, TLRPC.Document document, Boolean bool) {
        v5 v5Var = this.a;
        v5Var.Z1 = true;
        m5 m0 = v5Var.m0(obj, document);
        if (bool.booleanValue()) {
            m0.setScale(1.5f);
        }
        v5Var.c0(m0);
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void m(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        v5 v5Var = this.a;
        v5Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = v5Var.r1) != null && g1Var.isShowing()) {
            v5Var.r1.d(true);
        }
    }
}
