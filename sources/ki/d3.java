package ki;

import android.os.Bundle;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class d3 extends bn {
    public final /* synthetic */ org.telegram.ui.ActionBar.x2 vd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(Bundle bundle, org.telegram.ui.ActionBar.x2 x2Var) {
        super(bundle);
        this.vd = x2Var;
    }

    @Override // org.telegram.ui.bn, org.telegram.ui.ActionBar.h2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.x2 x2Var = this.vd;
        x2Var.a0(null);
        x2Var.show();
    }
}
