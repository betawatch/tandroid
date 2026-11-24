// default package

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hc6 implements cga {
    public final /* synthetic */ pc6 a;

    public hc6(pc6 pc6Var) {
        this.a = pc6Var;
    }

    @Override // cga
    public final void W() {
        pc6 pc6Var = this.a;
        ic6 ic6Var = pc6Var.R0;
        int W = ic6Var == null ? 0 : ic6Var.W(8);
        pc6Var.S0.setText(jb6.G(W, "LocationStories", new Object[0]));
        fc6 fc6Var = pc6Var.Q;
        boolean z = W > 0;
        if (fc6Var.a0 != z) {
            fc6Var.a0 = z;
            fc6Var.f();
            pc6Var.R.x0(0, gm.L(200.0f), null);
        }
    }

    @Override // cga
    public final boolean Y() {
        return false;
    }

    @Override // cga
    public final r59 e() {
        return this.a.R;
    }

    @Override // cga
    public final TLRPC.Chat f() {
        return null;
    }

    @Override // cga
    public final boolean g(TLRPC.ChatParticipant chatParticipant, boolean z, boolean z2, View view) {
        return false;
    }

    @Override // cga
    public final boolean t() {
        return true;
    }

    @Override // cga
    public final void I() {
    }
}
