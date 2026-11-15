package ki;

import android.os.Bundle;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class h1 extends yw {
    public final /* synthetic */ bi.h0 D4;
    public final /* synthetic */ j1 E4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(j1 j1Var, Bundle bundle, bi.h0 h0Var) {
        super(bundle);
        this.E4 = j1Var;
        this.D4 = h0Var;
    }

    @Override // org.telegram.ui.yw
    public final boolean U3() {
        return true;
    }

    @Override // org.telegram.ui.yw, org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        j1 j1Var = this.E4;
        if (j1Var.Y1) {
            return;
        }
        j1Var.Y1 = true;
        this.D4.a("USER_DECLINED", null);
    }
}
