package bi;

import ai.d9;
import android.content.Context;
import org.telegram.ui.Components.yw0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
        yw0 yw0Var = uVar.y;
        if (yw0Var != null) {
            d9 d9Var = this.e;
            yw0Var.e(d9Var != null && d9Var.k(), true);
        }
    }
}
