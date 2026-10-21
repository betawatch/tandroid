package gi;

import android.os.Bundle;
import org.telegram.ui.cy;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class j1 extends cy {
    public final /* synthetic */ ai.s0 B4;
    public final /* synthetic */ l1 C4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(l1 l1Var, Bundle bundle, ai.s0 s0Var) {
        super(bundle);
        this.C4 = l1Var;
        this.B4 = s0Var;
    }

    @Override // org.telegram.ui.cy
    public final boolean G3() {
        return true;
    }

    @Override // org.telegram.ui.cy, org.telegram.ui.ActionBar.n2
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
