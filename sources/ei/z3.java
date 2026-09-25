package ei;

import android.os.Bundle;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class z3 extends wn {
    public final /* synthetic */ org.telegram.ui.ActionBar.e3 Pc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(Bundle bundle, org.telegram.ui.ActionBar.e3 e3Var) {
        super(bundle);
        this.Pc = e3Var;
    }

    @Override // org.telegram.ui.wn, org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.e3 e3Var = this.Pc;
        e3Var.makeAttached(null);
        e3Var.show();
    }
}
