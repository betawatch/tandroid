package ei;

import android.os.Bundle;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
