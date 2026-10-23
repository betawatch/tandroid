package di;

import android.content.Context;
import ci.a7;
import org.telegram.ui.Components.tx0;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
        tx0 tx0Var = rVar.y;
        if (tx0Var != null) {
            a7 a7Var = this.e;
            tx0Var.e(a7Var != null && a7Var.k(), true);
        }
    }
}
