package ci;

import android.content.Context;
import bi.o8;
import org.telegram.ui.Components.wx0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class l extends s {
    public final /* synthetic */ t v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(t tVar, Context context) {
        super(tVar, context);
        this.v = tVar;
    }

    @Override // ci.s, s4.g0
    public final void l() {
        super.l();
        t tVar = this.v;
        if (tVar.r.getVisibility() == 0) {
            tVar.w.l();
        }
        wx0 wx0Var = tVar.y;
        if (wx0Var != null) {
            o8 o8Var = this.e;
            wx0Var.e(o8Var != null && o8Var.k(), true);
        }
    }
}
