package ei;

import android.content.Context;
import di.q6;
import org.telegram.ui.Components.av0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class i extends m {
    public final /* synthetic */ n w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n nVar, Context context) {
        super(nVar, context);
        this.w = nVar;
    }

    @Override // ei.m, v4.g0
    public final void f() {
        super.f();
        n nVar = this.w;
        if (nVar.r.getVisibility() == 0) {
            nVar.x.f();
        }
        av0 av0Var = nVar.D;
        if (av0Var != null) {
            q6 q6Var = this.e;
            av0Var.e(q6Var != null && q6Var.k(), true);
        }
    }
}
