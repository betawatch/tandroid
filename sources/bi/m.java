package bi;

import ai.d9;
import android.content.Context;
import org.telegram.ui.Components.kx0;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final class m extends t {
    public final /* synthetic */ u v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(u uVar, Context context) {
        super(uVar, context);
        this.v = uVar;
    }

    @Override // bi.t, s4.h0
    public final void l() {
        super.l();
        u uVar = this.v;
        if (uVar.r.getVisibility() == 0) {
            uVar.w.l();
        }
        kx0 kx0Var = uVar.y;
        if (kx0Var != null) {
            d9 d9Var = this.e;
            kx0Var.e(d9Var != null && d9Var.k(), true);
        }
    }
}
