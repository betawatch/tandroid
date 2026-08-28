package jh;

import android.content.Context;
import ih.n6;
import org.telegram.ui.Components.gw0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class l extends p {
    public final /* synthetic */ q v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(q qVar, Context context) {
        super(qVar, context);
        this.v = qVar;
    }

    @Override // jh.p, f2.r0
    public final void l() {
        super.l();
        q qVar = this.v;
        if (qVar.r.getVisibility() == 0) {
            qVar.w.l();
        }
        gw0 gw0Var = qVar.y;
        if (gw0Var != null) {
            n6 n6Var = this.e;
            gw0Var.e(n6Var != null && n6Var.k(), true);
        }
    }
}
