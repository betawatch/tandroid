package ci;

import android.content.Context;
import bi.o8;
import org.telegram.ui.Components.wx0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
