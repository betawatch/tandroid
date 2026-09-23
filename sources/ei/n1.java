package ei;

import android.os.Bundle;
import org.telegram.ui.ry;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class n1 extends ry {
    public final /* synthetic */ org.telegram.tgnet.e A4;
    public final /* synthetic */ p1 B4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(p1 p1Var, Bundle bundle, org.telegram.tgnet.e eVar) {
        super(bundle);
        this.B4 = p1Var;
        this.A4 = eVar;
    }

    @Override // org.telegram.ui.ry
    public final boolean I3() {
        return true;
    }

    @Override // org.telegram.ui.ry, org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        p1 p1Var = this.B4;
        if (p1Var.c0) {
            return;
        }
        p1Var.c0 = true;
        this.A4.run("USER_DECLINED", null);
    }
}
