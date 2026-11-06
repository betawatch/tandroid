package hi;

import org.telegram.messenger.k9;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y1 implements a4, k9, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ a3 a;

    public /* synthetic */ y1(a3 a3Var) {
        this.a = a3Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        this.a.o(false);
    }

    @Override // org.telegram.messenger.k9
    public Object j(Object obj) {
        return Boolean.valueOf(this.a.f.getKeyboardHeight() >= org.telegram.messenger.g0.L(20.0f));
    }

    @Override // hi.a4
    public void q(boolean z9) {
        a3 a3Var = this.a;
        if (a3Var.e0 && z9) {
            return;
        }
        a3Var.o(true);
    }
}
