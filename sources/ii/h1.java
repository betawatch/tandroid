package ii;

import android.os.Bundle;
import org.telegram.ui.uw;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h1 extends uw {
    public final /* synthetic */ ai.n0 C4;
    public final /* synthetic */ j1 D4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(j1 j1Var, Bundle bundle, ai.n0 n0Var) {
        super(bundle);
        this.D4 = j1Var;
        this.C4 = n0Var;
    }

    @Override // org.telegram.ui.uw
    public final boolean U3() {
        return true;
    }

    @Override // org.telegram.ui.uw, org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        j1 j1Var = this.D4;
        if (j1Var.V1) {
            return;
        }
        j1Var.V1 = true;
        this.C4.a("USER_DECLINED", null);
    }
}
