package bi;

import ai.d9;
import android.content.Context;
import org.telegram.ui.Components.ix0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
