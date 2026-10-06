package bi;

import ai.d9;
import android.content.Context;
import org.telegram.ui.Components.ux0;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
        ux0 ux0Var = uVar.y;
        if (ux0Var != null) {
            d9 d9Var = this.e;
            ux0Var.e(d9Var != null && d9Var.k(), true);
        }
    }
}
