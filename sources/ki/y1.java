package ki;

import org.telegram.messenger.j9;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class y1 implements w3, j9, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ x2 a;

    public /* synthetic */ y1(x2 x2Var) {
        this.a = x2Var;
    }

    @Override // ki.w3
    public void b(boolean z10) {
        x2 x2Var = this.a;
        if (x2Var.f0 && z10) {
            return;
        }
        x2Var.o(true);
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.a.o(false);
    }

    @Override // org.telegram.messenger.j9
    public Object o(Object obj) {
        return Boolean.valueOf(this.a.f.getKeyboardHeight() >= org.telegram.messenger.g0.L(20.0f));
    }
}
