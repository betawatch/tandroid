package ki;

import android.os.Bundle;
import org.telegram.ui.cx;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class f1 extends cx {
    public final /* synthetic */ bi.h0 G4;
    public final /* synthetic */ h1 H4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(h1 h1Var, Bundle bundle, bi.h0 h0Var) {
        super(bundle);
        this.H4 = h1Var;
        this.G4 = h0Var;
    }

    @Override // org.telegram.ui.cx
    public final boolean U3() {
        return true;
    }

    @Override // org.telegram.ui.cx, org.telegram.ui.ActionBar.h2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        h1 h1Var = this.H4;
        if (h1Var.Y1) {
            return;
        }
        h1Var.Y1 = true;
        this.G4.a("USER_DECLINED", null);
    }
}
