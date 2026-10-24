package gi;

import android.os.Bundle;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class p3 extends sn {
    public final /* synthetic */ org.telegram.ui.ActionBar.h3 ed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(Bundle bundle, org.telegram.ui.ActionBar.h3 h3Var) {
        super(bundle);
        this.ed = h3Var;
    }

    @Override // org.telegram.ui.sn, org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.h3 h3Var = this.ed;
        h3Var.makeAttached(null);
        h3Var.show();
    }
}
