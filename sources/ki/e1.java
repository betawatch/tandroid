package ki;

import android.os.Bundle;
import org.telegram.ui.bx;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class e1 extends bx {
    public final /* synthetic */ bi.h0 G4;
    public final /* synthetic */ g1 H4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(g1 g1Var, Bundle bundle, bi.h0 h0Var) {
        super(bundle);
        this.H4 = g1Var;
        this.G4 = h0Var;
    }

    @Override // org.telegram.ui.bx
    public final boolean U3() {
        return true;
    }

    @Override // org.telegram.ui.bx, org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        g1 g1Var = this.H4;
        if (g1Var.Y1) {
            return;
        }
        g1Var.Y1 = true;
        this.G4.a("USER_DECLINED", null);
    }
}
