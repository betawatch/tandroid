package hi;

import android.view.KeyEvent;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class k4 implements org.telegram.ui.ActionBar.f1, t10 {
    public final /* synthetic */ l5 a;

    public /* synthetic */ k4(l5 l5Var) {
        this.a = l5Var;
    }

    @Override // org.telegram.ui.ActionBar.f1
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.h1 h1Var;
        l5 l5Var = this.a;
        l5Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (h1Var = l5Var.r1) != null && h1Var.isShowing()) {
            l5Var.r1.d(true);
        }
    }

    @Override // org.telegram.messenger.t10
    public void m(Object obj, TLRPC.Document document, Boolean bool) {
        l5 l5Var = this.a;
        l5Var.V1 = true;
        c5 k02 = l5Var.k0(obj, document);
        if (bool.booleanValue()) {
            k02.setScale(1.5f);
        }
        l5Var.b0(k02);
    }
}
