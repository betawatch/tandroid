// default package

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ia6 implements cea {
    public final /* synthetic */ qa6 a;

    public ia6(qa6 qa6Var) {
        this.a = qa6Var;
    }

    @Override // cea
    public final void V() {
        qa6 qa6Var = this.a;
        ja6 ja6Var = qa6Var.R0;
        int W = ja6Var == null ? 0 : ja6Var.W(8);
        qa6Var.S0.setText(k96.G(W, "LocationStories", new Object[0]));
        ga6 ga6Var = qa6Var.Q;
        boolean z = W > 0;
        if (ga6Var.a0 != z) {
            ga6Var.a0 = z;
            ga6Var.f();
            qa6Var.R.x0(0, gl.L(200.0f), null);
        }
    }

    @Override // cea
    public final boolean X() {
        return false;
    }

    @Override // cea
    public final o39 e() {
        return this.a.R;
    }

    @Override // cea
    public final TLRPC.Chat f() {
        return null;
    }

    @Override // cea
    public final boolean g(TLRPC.ChatParticipant chatParticipant, boolean z, boolean z2, View view) {
        return false;
    }

    @Override // cea
    public final boolean u() {
        return true;
    }

    @Override // cea
    public final void I() {
    }
}
