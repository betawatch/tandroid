package gi;

import android.os.Bundle;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class p3 extends sn {
    public final /* synthetic */ org.telegram.ui.ActionBar.f3 Rc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(Bundle bundle, org.telegram.ui.ActionBar.f3 f3Var) {
        super(bundle);
        this.Rc = f3Var;
    }

    @Override // org.telegram.ui.sn, org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.f3 f3Var = this.Rc;
        f3Var.makeAttached(null);
        f3Var.show();
    }
}
