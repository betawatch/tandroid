package di;

import android.content.Context;
import ci.z6;
import org.telegram.ui.Components.wx0;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
        wx0 wx0Var = rVar.y;
        if (wx0Var != null) {
            z6 z6Var = this.e;
            wx0Var.e(z6Var != null && z6Var.k(), true);
        }
    }
}
