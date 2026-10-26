package ei;

import android.content.Context;
import di.z6;
import org.telegram.ui.Components.ey0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
        ey0 ey0Var = rVar.y;
        if (ey0Var != null) {
            z6 z6Var = this.e;
            ey0Var.e(z6Var != null && z6Var.k(), true);
        }
    }
}
