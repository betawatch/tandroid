package di;

import android.content.Context;
import ci.z6;
import org.telegram.ui.Components.rx0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
            z6 z6Var = this.e;
            rx0Var.e(z6Var != null && z6Var.k(), true);
        }
    }
}
