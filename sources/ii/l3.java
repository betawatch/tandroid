package ii;

import android.os.Bundle;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l3 extends wm {
    public final /* synthetic */ org.telegram.ui.ActionBar.t2 sd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(Bundle bundle, org.telegram.ui.ActionBar.t2 t2Var) {
        super(bundle);
        this.sd = t2Var;
    }

    @Override // org.telegram.ui.wm, org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.t2 t2Var = this.sd;
        t2Var.a0(null);
        t2Var.show();
    }
}
