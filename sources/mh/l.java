package mh;

import android.content.Context;
import lh.k6;
import org.telegram.ui.Components.qw0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class l extends q {
    public final /* synthetic */ r v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r rVar, Context context) {
        super(rVar, context);
        this.v = rVar;
    }

    @Override // mh.q, f2.p0
    public final void l() {
        super.l();
        r rVar = this.v;
        if (rVar.r.getVisibility() == 0) {
            rVar.w.l();
        }
        qw0 qw0Var = rVar.y;
        if (qw0Var != null) {
            k6 k6Var = this.e;
            qw0Var.e(k6Var != null && k6Var.k(), true);
        }
    }
}
