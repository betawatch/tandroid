package gi;

import android.os.Bundle;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class p3 extends sn {
    public final /* synthetic */ org.telegram.ui.ActionBar.f3 Qc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(Bundle bundle, org.telegram.ui.ActionBar.f3 f3Var) {
        super(bundle);
        this.Qc = f3Var;
    }

    @Override // org.telegram.ui.sn, org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.f3 f3Var = this.Qc;
        f3Var.makeAttached(null);
        f3Var.show();
    }
}
