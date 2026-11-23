package ki;

import org.telegram.messenger.i9;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class t1 implements r3, i9, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ t2 a;

    public /* synthetic */ t1(t2 t2Var) {
        this.a = t2Var;
    }

    @Override // ki.r3
    public void b(boolean z10) {
        t2 t2Var = this.a;
        if (t2Var.f0 && z10) {
            return;
        }
        t2Var.o(true);
    }

    @Override // org.telegram.messenger.i9
    public Object h(Object obj) {
        return Boolean.valueOf(this.a.f.getKeyboardHeight() >= org.telegram.messenger.g0.L(20.0f));
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.a.o(false);
    }
}
