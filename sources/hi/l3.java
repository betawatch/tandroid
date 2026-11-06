package hi;

import android.os.Bundle;
import org.telegram.ui.an;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class l3 extends an {
    public final /* synthetic */ org.telegram.ui.ActionBar.v2 rd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(Bundle bundle, org.telegram.ui.ActionBar.v2 v2Var) {
        super(bundle);
        this.rd = v2Var;
    }

    @Override // org.telegram.ui.an, org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.v2 v2Var = this.rd;
        v2Var.a0(null);
        v2Var.show();
    }
}
