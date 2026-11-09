package hi;

import android.os.Bundle;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class g1 extends yw {
    public final /* synthetic */ bi.t0 C4;
    public final /* synthetic */ i1 D4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(i1 i1Var, Bundle bundle, bi.t0 t0Var) {
        super(bundle);
        this.D4 = i1Var;
        this.C4 = t0Var;
    }

    @Override // org.telegram.ui.yw
    public final boolean U3() {
        return true;
    }

    @Override // org.telegram.ui.yw, org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        i1 i1Var = this.D4;
        if (i1Var.U1) {
            return;
        }
        i1Var.U1 = true;
        this.C4.a("USER_DECLINED", null);
    }
}
