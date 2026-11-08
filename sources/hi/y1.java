package hi;

import org.telegram.messenger.k9;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
