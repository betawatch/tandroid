package bi;

import ai.d9;
import android.content.Context;
import org.telegram.ui.Components.ix0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
        ix0 ix0Var = uVar.y;
        if (ix0Var != null) {
            d9 d9Var = this.e;
            ix0Var.e(d9Var != null && d9Var.k(), true);
        }
    }
}
