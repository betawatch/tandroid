// default package

import android.os.Bundle;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
