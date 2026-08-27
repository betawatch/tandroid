package nh;

import android.os.Bundle;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class n3 extends rn {
    public final /* synthetic */ org.telegram.ui.ActionBar.e3 Mc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(Bundle bundle, org.telegram.ui.ActionBar.e3 e3Var) {
        super(bundle);
        this.Mc = e3Var;
    }

    @Override // org.telegram.ui.rn, org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.e3 e3Var = this.Mc;
        e3Var.makeAttached(null);
        e3Var.show();
    }
}
