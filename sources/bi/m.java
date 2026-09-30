package bi;

import ai.d9;
import android.content.Context;
import org.telegram.ui.Components.kx0;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
