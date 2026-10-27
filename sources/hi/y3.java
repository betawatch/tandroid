package hi;

import android.os.Bundle;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class y3 extends wn {
    public final /* synthetic */ org.telegram.ui.ActionBar.k3 od;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(Bundle bundle, org.telegram.ui.ActionBar.k3 k3Var) {
        super(bundle);
        this.od = k3Var;
    }

    @Override // org.telegram.ui.wn, org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.k3 k3Var = this.od;
        k3Var.makeAttached(null);
        k3Var.show();
    }
}
