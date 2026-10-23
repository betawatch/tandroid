package gi;

import android.os.Bundle;
import org.telegram.ui.ey;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class j1 extends ey {
    public final /* synthetic */ ai.s0 D4;
    public final /* synthetic */ l1 E4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(l1 l1Var, Bundle bundle, ai.s0 s0Var) {
        super(bundle);
        this.E4 = l1Var;
        this.D4 = s0Var;
    }

    @Override // org.telegram.ui.ey
    public final boolean G3() {
        return true;
    }

    @Override // org.telegram.ui.ey, org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        l1 l1Var = this.E4;
        if (l1Var.c0) {
            return;
        }
        l1Var.c0 = true;
        this.D4.run("USER_DECLINED", null);
    }
}
