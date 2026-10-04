package bi;

import ai.d9;
import android.content.Context;
import org.telegram.ui.Components.tx0;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final class m extends t {
    public final /* synthetic */ u v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(u uVar, Context context) {
        super(uVar, context);
        this.v = uVar;
    }

    @Override // bi.t, s4.h0
    public final void l() {
        super.l();
        u uVar = this.v;
        if (uVar.r.getVisibility() == 0) {
            uVar.w.l();
        }
        tx0 tx0Var = uVar.y;
        if (tx0Var != null) {
            d9 d9Var = this.e;
            tx0Var.e(d9Var != null && d9Var.k(), true);
        }
    }
}
