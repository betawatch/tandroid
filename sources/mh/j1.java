package mh;

import android.os.Bundle;
import org.telegram.ui.dy;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class j1 extends dy {
    public final /* synthetic */ bg.y0 x4;
    public final /* synthetic */ l1 y4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(l1 l1Var, Bundle bundle, bg.y0 y0Var) {
        super(bundle);
        this.y4 = l1Var;
        this.x4 = y0Var;
    }

    @Override // org.telegram.ui.dy
    public final boolean I3() {
        return true;
    }

    @Override // org.telegram.ui.dy, org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        l1 l1Var = this.y4;
        if (l1Var.Y) {
            return;
        }
        l1Var.Y = true;
        this.x4.run("USER_DECLINED", null);
    }
}
