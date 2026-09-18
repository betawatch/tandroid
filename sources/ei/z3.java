package ei;

import android.os.Bundle;
import org.telegram.ui.bo;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class z3 extends bo {
    public final /* synthetic */ org.telegram.ui.ActionBar.g3 Pc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(Bundle bundle, org.telegram.ui.ActionBar.g3 g3Var) {
        super(bundle);
        this.Pc = g3Var;
    }

    @Override // org.telegram.ui.bo, org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.g3 g3Var = this.Pc;
        g3Var.makeAttached(null);
        g3Var.show();
    }
}
