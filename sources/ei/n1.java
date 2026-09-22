package ei;

import android.os.Bundle;
import org.telegram.ui.uy;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class n1 extends uy {
    public final /* synthetic */ org.telegram.tgnet.e A4;
    public final /* synthetic */ p1 B4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(p1 p1Var, Bundle bundle, org.telegram.tgnet.e eVar) {
        super(bundle);
        this.B4 = p1Var;
        this.A4 = eVar;
    }

    @Override // org.telegram.ui.uy
    public final boolean I3() {
        return true;
    }

    @Override // org.telegram.ui.uy, org.telegram.ui.ActionBar.n2
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
