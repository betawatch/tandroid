package ki;

import android.os.Bundle;
import org.telegram.ui.cx;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class e1 extends cx {
    public final /* synthetic */ bi.h0 G4;
    public final /* synthetic */ g1 H4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(g1 g1Var, Bundle bundle, bi.h0 h0Var) {
        super(bundle);
        this.H4 = g1Var;
        this.G4 = h0Var;
    }

    @Override // org.telegram.ui.cx
    public final boolean U3() {
        return true;
    }

    @Override // org.telegram.ui.cx, org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        g1 g1Var = this.H4;
        if (g1Var.Y1) {
            return;
        }
        g1Var.Y1 = true;
        this.G4.a("USER_DECLINED", null);
    }
}
