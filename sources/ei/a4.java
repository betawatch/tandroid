package ei;

import android.os.Bundle;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class a4 extends yn {
    public final /* synthetic */ org.telegram.ui.ActionBar.f3 Kc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(Bundle bundle, org.telegram.ui.ActionBar.f3 f3Var) {
        super(bundle);
        this.Kc = f3Var;
    }

    @Override // org.telegram.ui.yn, org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.f3 f3Var = this.Kc;
        f3Var.makeAttached(null);
        f3Var.show();
    }
}
