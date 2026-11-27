// default package

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class mc6 implements tha {
    public final /* synthetic */ uc6 a;

    public mc6(uc6 uc6Var) {
        this.a = uc6Var;
    }

    @Override // tha
    public final void V() {
        uc6 uc6Var = this.a;
        nc6 nc6Var = uc6Var.R0;
        int W = nc6Var == null ? 0 : nc6Var.W(8);
        uc6Var.S0.setText(ob6.G(W, "LocationStories", new Object[0]));
        kc6 kc6Var = uc6Var.Q;
        boolean z = W > 0;
        if (kc6Var.a0 != z) {
            kc6Var.a0 = z;
            kc6Var.f();
            uc6Var.R.y0(0, hl.L(200.0f), null);
        }
    }

    @Override // tha
    public final boolean X() {
        return false;
    }

    @Override // tha
    public final d79 d() {
        return this.a.R;
    }

    @Override // tha
    public final TLRPC.Chat e() {
        return null;
    }

    @Override // tha
    public final boolean g(TLRPC.ChatParticipant chatParticipant, boolean z, boolean z2, View view) {
        return false;
    }

    @Override // tha
    public final boolean u() {
        return true;
    }

    @Override // tha
    public final void I() {
    }
}
