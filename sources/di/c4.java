package di;

import android.os.Bundle;
import org.telegram.ui.eo;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class c4 extends eo {
    public final /* synthetic */ org.telegram.ui.ActionBar.h3 Qc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(Bundle bundle, org.telegram.ui.ActionBar.h3 h3Var) {
        super(bundle);
        this.Qc = h3Var;
    }

    @Override // org.telegram.ui.eo, org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.h3 h3Var = this.Qc;
        h3Var.makeAttached(null);
        h3Var.show();
    }
}
