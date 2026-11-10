package ei;

import android.content.Context;
import di.r6;
import org.telegram.ui.Components.bv0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        bv0 bv0Var = nVar.D;
        if (bv0Var != null) {
            r6 r6Var = this.e;
            bv0Var.e(r6Var != null && r6Var.k(), true);
        }
    }
}
