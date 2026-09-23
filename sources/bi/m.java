package bi;

import ai.d9;
import android.content.Context;
import org.telegram.ui.Components.xw0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
        xw0 xw0Var = uVar.y;
        if (xw0Var != null) {
            d9 d9Var = this.e;
            xw0Var.e(d9Var != null && d9Var.k(), true);
        }
    }
}
