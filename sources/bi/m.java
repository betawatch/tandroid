package bi;

import ai.d9;
import android.content.Context;
import org.telegram.ui.Components.zw0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
        zw0 zw0Var = uVar.y;
        if (zw0Var != null) {
            d9 d9Var = this.e;
            zw0Var.e(d9Var != null && d9Var.k(), true);
        }
    }
}
