// default package

import android.view.KeyEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dt7 implements k8, l8c {
    public final /* synthetic */ wt7 a;

    public /* synthetic */ dt7(wt7 wt7Var) {
        this.a = wt7Var;
    }

    @Override // l8c
    public final void h(Object obj, TLRPC.Document document, Boolean bool) {
        wt7 wt7Var = this.a;
        wt7Var.f2 = true;
        pt7 k0 = wt7Var.k0(obj, document);
        if (bool.booleanValue()) {
            k0.setScale(1.5f);
        }
        wt7Var.a0(k0);
    }

    @Override // k8
    public final void r(KeyEvent keyEvent) {
        wt7 wt7Var;
        m8 m8Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m8Var = (wt7Var = this.a).x1) != null && m8Var.isShowing()) {
            wt7Var.x1.d(true);
        }
    }
}
