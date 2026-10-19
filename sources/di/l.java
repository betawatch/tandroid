package di;

import android.content.Context;
import ci.a7;
import org.telegram.ui.Components.sx0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class l extends q {
    public final /* synthetic */ r v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r rVar, Context context) {
        super(rVar, context);
        this.v = rVar;
    }

    @Override // di.q, s4.g0
    public final void l() {
        super.l();
        r rVar = this.v;
        if (rVar.r.getVisibility() == 0) {
            rVar.w.l();
        }
        sx0 sx0Var = rVar.y;
        if (sx0Var != null) {
            a7 a7Var = this.e;
            sx0Var.e(a7Var != null && a7Var.k(), true);
        }
    }
}
