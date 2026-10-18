package gi;

import android.os.Bundle;
import org.telegram.ui.ey;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class j1 extends ey {
    public final /* synthetic */ ai.s0 B4;
    public final /* synthetic */ l1 C4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(l1 l1Var, Bundle bundle, ai.s0 s0Var) {
        super(bundle);
        this.C4 = l1Var;
        this.B4 = s0Var;
    }

    @Override // org.telegram.ui.ey
    public final boolean G3() {
        return true;
    }

    @Override // org.telegram.ui.ey, org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        l1 l1Var = this.C4;
        if (l1Var.c0) {
            return;
        }
        l1Var.c0 = true;
        this.B4.run("USER_DECLINED", null);
    }
}
