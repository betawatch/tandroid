package ki;

import android.os.Bundle;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class c3 extends bn {
    public final /* synthetic */ org.telegram.ui.ActionBar.w2 vd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(Bundle bundle, org.telegram.ui.ActionBar.w2 w2Var) {
        super(bundle);
        this.vd = w2Var;
    }

    @Override // org.telegram.ui.bn, org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.w2 w2Var = this.vd;
        w2Var.a0(null);
        w2Var.show();
    }
}
