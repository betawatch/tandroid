package hi;

import android.os.Bundle;
import org.telegram.ui.zw;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class g1 extends zw {
    public final /* synthetic */ bi.t0 C4;
    public final /* synthetic */ i1 D4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(i1 i1Var, Bundle bundle, bi.t0 t0Var) {
        super(bundle);
        this.D4 = i1Var;
        this.C4 = t0Var;
    }

    @Override // org.telegram.ui.zw
    public final boolean U3() {
        return true;
    }

    @Override // org.telegram.ui.zw, org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        i1 i1Var = this.D4;
        if (i1Var.X1) {
            return;
        }
        i1Var.X1 = true;
        this.C4.a("USER_DECLINED", null);
    }
}
