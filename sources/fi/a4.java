package fi;

import android.os.Bundle;
import org.telegram.ui.fo;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class a4 extends fo {
    public final /* synthetic */ org.telegram.ui.ActionBar.e3 Qc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(Bundle bundle, org.telegram.ui.ActionBar.e3 e3Var) {
        super(bundle);
        this.Qc = e3Var;
    }

    @Override // org.telegram.ui.fo, org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.e3 e3Var = this.Qc;
        e3Var.makeAttached(null);
        e3Var.show();
    }
}
