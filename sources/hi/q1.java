package hi;

import android.os.Bundle;
import org.telegram.ui.cy;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class q1 extends cy {
    public final /* synthetic */ bi.t0 C4;
    public final /* synthetic */ s1 D4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(s1 s1Var, Bundle bundle, bi.t0 t0Var) {
        super(bundle);
        this.D4 = s1Var;
        this.C4 = t0Var;
    }

    @Override // org.telegram.ui.cy
    public final boolean Q3() {
        return true;
    }

    @Override // org.telegram.ui.cy, org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        s1 s1Var = this.D4;
        if (s1Var.c0) {
            return;
        }
        s1Var.c0 = true;
        this.C4.run("USER_DECLINED", null);
    }
}
