package fi;

import android.os.Bundle;
import org.telegram.ui.co;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes4.dex */
public final class z3 extends co {
    public final /* synthetic */ org.telegram.ui.ActionBar.f3 Qc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(Bundle bundle, org.telegram.ui.ActionBar.f3 f3Var) {
        super(bundle);
        this.Qc = f3Var;
    }

    @Override // org.telegram.ui.co, org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.f3 f3Var = this.Qc;
        f3Var.makeAttached(null);
        f3Var.show();
    }
}
