package di;

import android.os.Bundle;
import org.telegram.ui.wy;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class q1 extends wy {
    public final /* synthetic */ org.telegram.tgnet.g B4;
    public final /* synthetic */ s1 C4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(s1 s1Var, Bundle bundle, org.telegram.tgnet.g gVar) {
        super(bundle);
        this.C4 = s1Var;
        this.B4 = gVar;
    }

    @Override // org.telegram.ui.wy
    public final boolean I3() {
        return true;
    }

    @Override // org.telegram.ui.wy, org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        s1 s1Var = this.C4;
        if (s1Var.c0) {
            return;
        }
        s1Var.c0 = true;
        this.B4.run("USER_DECLINED", null);
    }
}
