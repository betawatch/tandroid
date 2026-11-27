// default package

import android.os.Bundle;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
