package mh;

import android.os.Bundle;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class p3 extends qn {
    public final /* synthetic */ org.telegram.ui.ActionBar.f3 Mc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(Bundle bundle, org.telegram.ui.ActionBar.f3 f3Var) {
        super(bundle);
        this.Mc = f3Var;
    }

    @Override // org.telegram.ui.qn, org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.f3 f3Var = this.Mc;
        f3Var.makeAttached(null);
        f3Var.show();
    }
}
