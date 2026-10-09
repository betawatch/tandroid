package bi;

import ai.e9;
import android.content.Context;
import org.telegram.ui.Components.ay0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class m extends t {
    public final /* synthetic */ u v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(u uVar, Context context) {
        super(uVar, context);
        this.v = uVar;
    }

    @Override // bi.t, s4.i0
    public final void l() {
        super.l();
        u uVar = this.v;
        if (uVar.r.getVisibility() == 0) {
            uVar.w.l();
        }
        ay0 ay0Var = uVar.y;
        if (ay0Var != null) {
            e9 e9Var = this.e;
            ay0Var.e(e9Var != null && e9Var.k(), true);
        }
    }
}
