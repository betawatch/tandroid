// default package

import android.view.KeyEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class ev7 implements k8, mac {
    public final /* synthetic */ xv7 a;

    public /* synthetic */ ev7(xv7 xv7Var) {
        this.a = xv7Var;
    }

    @Override // mac
    public final void h(Object obj, TLRPC.Document document, Boolean bool) {
        xv7 xv7Var = this.a;
        xv7Var.f2 = true;
        qv7 k0 = xv7Var.k0(obj, document);
        if (bool.booleanValue()) {
            k0.setScale(1.5f);
        }
        xv7Var.a0(k0);
    }

    @Override // k8
    public final void q(KeyEvent keyEvent) {
        xv7 xv7Var;
        m8 m8Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m8Var = (xv7Var = this.a).x1) != null && m8Var.isShowing()) {
            xv7Var.x1.d(true);
        }
    }
}
