package fi;

import android.os.Bundle;
import org.telegram.ui.uy;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class n1 extends uy {
    public final /* synthetic */ org.telegram.tgnet.e B4;
    public final /* synthetic */ p1 C4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(p1 p1Var, Bundle bundle, org.telegram.tgnet.e eVar) {
        super(bundle);
        this.C4 = p1Var;
        this.B4 = eVar;
    }

    @Override // org.telegram.ui.uy
    public final boolean I3() {
        return true;
    }

    @Override // org.telegram.ui.uy, org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        p1 p1Var = this.C4;
        if (p1Var.c0) {
            return;
        }
        p1Var.c0 = true;
        this.B4.run("USER_DECLINED", null);
    }
}
