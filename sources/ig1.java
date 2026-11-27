// default package

import android.os.Bundle;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class ig1 extends zu1 {
    public final /* synthetic */ nx0 Jd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig1(Bundle bundle, nx0 nx0Var) {
        super(bundle);
        this.Jd = nx0Var;
    }

    @Override // zu1, org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        nx0 nx0Var = this.Jd;
        nx0Var.X(null);
        nx0Var.show();
    }
}
