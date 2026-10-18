package di;

import android.content.Context;
import ci.a7;
import org.telegram.ui.Components.rx0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
        rx0 rx0Var = rVar.y;
        if (rx0Var != null) {
            a7 a7Var = this.e;
            rx0Var.e(a7Var != null && a7Var.k(), true);
        }
    }
}
