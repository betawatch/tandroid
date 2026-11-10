package hi;

import android.os.Bundle;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class l3 extends cn {
    public final /* synthetic */ org.telegram.ui.ActionBar.w2 td;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(Bundle bundle, org.telegram.ui.ActionBar.w2 w2Var) {
        super(bundle);
        this.td = w2Var;
    }

    @Override // org.telegram.ui.cn, org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.w2 w2Var = this.td;
        w2Var.a0(null);
        w2Var.show();
    }
}
