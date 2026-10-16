package fi;

import android.os.Bundle;
import org.telegram.ui.fo;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
