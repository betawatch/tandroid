package ki;

import android.os.Bundle;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
