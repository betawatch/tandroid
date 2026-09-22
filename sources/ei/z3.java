package ei;

import android.os.Bundle;
import org.telegram.ui.bo;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class z3 extends bo {
    public final /* synthetic */ org.telegram.ui.ActionBar.f3 Pc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(Bundle bundle, org.telegram.ui.ActionBar.f3 f3Var) {
        super(bundle);
        this.Pc = f3Var;
    }

    @Override // org.telegram.ui.bo, org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.f3 f3Var = this.Pc;
        f3Var.makeAttached(null);
        f3Var.show();
    }
}
