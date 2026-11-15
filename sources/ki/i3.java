package ki;

import android.os.Bundle;
import org.telegram.ui.an;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class i3 extends an {
    public final /* synthetic */ org.telegram.ui.ActionBar.u2 ud;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(Bundle bundle, org.telegram.ui.ActionBar.u2 u2Var) {
        super(bundle);
        this.ud = u2Var;
    }

    @Override // org.telegram.ui.an, org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.u2 u2Var = this.ud;
        u2Var.a0(null);
        u2Var.show();
    }
}
