package ei;

import android.content.Context;
import di.z6;
import org.telegram.ui.Components.fy0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class l extends q {
    public final /* synthetic */ r v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r rVar, Context context) {
        super(rVar, context);
        this.v = rVar;
    }

    @Override // ei.q, s4.h0
    public final void l() {
        super.l();
        r rVar = this.v;
        if (rVar.r.getVisibility() == 0) {
            rVar.w.l();
        }
        fy0 fy0Var = rVar.y;
        if (fy0Var != null) {
            z6 z6Var = this.e;
            fy0Var.e(z6Var != null && z6Var.k(), true);
        }
    }
}
