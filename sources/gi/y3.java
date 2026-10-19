package gi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class y3 implements org.telegram.ui.ActionBar.a2, d4, GenericProvider {
    public final /* synthetic */ f4 a;

    public /* synthetic */ y3(f4 f4Var) {
        this.a = f4Var;
    }

    @Override // gi.d4
    public void f(boolean z10) {
        f4 f4Var = this.a;
        if (f4Var.N()) {
            return;
        }
        f4Var.J.e(0.0f);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.a.b.dismiss();
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        return Boolean.valueOf(this.a.b.u1.getKeyboardHeight() >= AndroidUtilities.dp(20.0f));
    }
}
