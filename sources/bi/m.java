package bi;

import ai.d9;
import android.content.Context;
import org.telegram.ui.Components.lx0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
        lx0 lx0Var = uVar.y;
        if (lx0Var != null) {
            d9 d9Var = this.e;
            lx0Var.e(d9Var != null && d9Var.k(), true);
        }
    }
}
