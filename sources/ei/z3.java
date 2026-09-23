package ei;

import android.os.Bundle;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class z3 extends xn {
    public final /* synthetic */ org.telegram.ui.ActionBar.f3 Pc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(Bundle bundle, org.telegram.ui.ActionBar.f3 f3Var) {
        super(bundle);
        this.Pc = f3Var;
    }

    @Override // org.telegram.ui.xn, org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.f3 f3Var = this.Pc;
        f3Var.makeAttached(null);
        f3Var.show();
    }
}
