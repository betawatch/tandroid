package ei;

import android.os.Bundle;
import org.telegram.ui.uy;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class o1 extends uy {
    public final /* synthetic */ q1 A4;
    public final /* synthetic */ org.telegram.tgnet.e z4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(q1 q1Var, Bundle bundle, org.telegram.tgnet.e eVar) {
        super(bundle);
        this.A4 = q1Var;
        this.z4 = eVar;
    }

    @Override // org.telegram.ui.uy
    public final boolean R3() {
        return true;
    }

    @Override // org.telegram.ui.uy, org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        q1 q1Var = this.A4;
        if (q1Var.c0) {
            return;
        }
        q1Var.c0 = true;
        this.z4.run("USER_DECLINED", null);
    }
}
