package nh;

import android.os.Bundle;
import org.telegram.ui.gy;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class i1 extends gy {
    public final /* synthetic */ cg.u0 x4;
    public final /* synthetic */ k1 y4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(k1 k1Var, Bundle bundle, cg.u0 u0Var) {
        super(bundle);
        this.y4 = k1Var;
        this.x4 = u0Var;
    }

    @Override // org.telegram.ui.gy
    public final boolean I3() {
        return true;
    }

    @Override // org.telegram.ui.gy, org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        k1 k1Var = this.y4;
        if (k1Var.Y) {
            return;
        }
        k1Var.Y = true;
        this.x4.run("USER_DECLINED", null);
    }
}
