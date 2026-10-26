package hi;

import android.os.Bundle;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class y3 extends un {
    public final /* synthetic */ org.telegram.ui.ActionBar.k3 kd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(Bundle bundle, org.telegram.ui.ActionBar.k3 k3Var) {
        super(bundle);
        this.kd = k3Var;
    }

    @Override // org.telegram.ui.un, org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.k3 k3Var = this.kd;
        k3Var.makeAttached(null);
        k3Var.show();
    }
}
