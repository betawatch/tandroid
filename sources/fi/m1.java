package fi;

import android.os.Bundle;
import org.telegram.ui.yy;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class m1 extends yy {
    public final /* synthetic */ org.telegram.tgnet.e A4;
    public final /* synthetic */ o1 B4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(o1 o1Var, Bundle bundle, org.telegram.tgnet.e eVar) {
        super(bundle);
        this.B4 = o1Var;
        this.A4 = eVar;
    }

    @Override // org.telegram.ui.yy
    public final boolean F3() {
        return true;
    }

    @Override // org.telegram.ui.yy, org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        o1 o1Var = this.B4;
        if (o1Var.c0) {
            return;
        }
        o1Var.c0 = true;
        this.A4.run("USER_DECLINED", null);
    }
}
