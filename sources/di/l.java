package di;

import android.content.Context;
import ci.z6;
import org.telegram.ui.Components.wx0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
