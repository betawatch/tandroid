package ci;

import android.content.Context;
import bi.l8;
import org.telegram.ui.Components.xw0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class l extends s {
    public final /* synthetic */ t v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(t tVar, Context context) {
        super(tVar, context);
        this.v = tVar;
    }

    @Override // ci.s, s4.h0
    public final void l() {
        super.l();
        t tVar = this.v;
        if (tVar.r.getVisibility() == 0) {
            tVar.w.l();
        }
        xw0 xw0Var = tVar.y;
        if (xw0Var != null) {
            l8 l8Var = this.e;
            xw0Var.e(l8Var != null && l8Var.k(), true);
        }
    }
}
