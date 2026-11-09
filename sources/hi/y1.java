package hi;

import org.telegram.messenger.k9;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
