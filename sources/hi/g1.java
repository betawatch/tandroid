package hi;

import android.os.Bundle;
import org.telegram.ui.ww;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class g1 extends ww {
    public final /* synthetic */ bi.t0 B4;
    public final /* synthetic */ i1 C4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(i1 i1Var, Bundle bundle, bi.t0 t0Var) {
        super(bundle);
        this.C4 = i1Var;
        this.B4 = t0Var;
    }

    @Override // org.telegram.ui.ww
    public final boolean U3() {
        return true;
    }

    @Override // org.telegram.ui.ww, org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        i1 i1Var = this.C4;
        if (i1Var.U1) {
            return;
        }
        i1Var.U1 = true;
        this.B4.a("USER_DECLINED", null);
    }
}
