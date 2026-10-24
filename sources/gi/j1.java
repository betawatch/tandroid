package gi;

import android.os.Bundle;
import org.telegram.ui.ey;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
