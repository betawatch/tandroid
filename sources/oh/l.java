package oh;

import android.content.Context;
import nh.l6;
import org.telegram.ui.Components.zw0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class l extends q {
    public final /* synthetic */ r v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r rVar, Context context) {
        super(rVar, context);
        this.v = rVar;
    }

    @Override // oh.q, f2.o0
    public final void l() {
        super.l();
        r rVar = this.v;
        if (rVar.r.getVisibility() == 0) {
            rVar.w.l();
        }
        zw0 zw0Var = rVar.y;
        if (zw0Var != null) {
            l6 l6Var = this.e;
            zw0Var.e(l6Var != null && l6Var.k(), true);
        }
    }
}
