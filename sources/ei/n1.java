package ei;

import android.os.Bundle;
import org.telegram.ui.qy;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class n1 extends qy {
    public final /* synthetic */ org.telegram.tgnet.e A4;
    public final /* synthetic */ p1 B4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(p1 p1Var, Bundle bundle, org.telegram.tgnet.e eVar) {
        super(bundle);
        this.B4 = p1Var;
        this.A4 = eVar;
    }

    @Override // org.telegram.ui.qy
    public final boolean I3() {
        return true;
    }

    @Override // org.telegram.ui.qy, org.telegram.ui.ActionBar.m2
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
