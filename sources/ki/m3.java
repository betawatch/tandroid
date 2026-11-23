package ki;

import org.telegram.messenger.i9;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class m3 implements org.telegram.ui.ActionBar.q1, r3, i9 {
    public final /* synthetic */ t3 a;

    public /* synthetic */ m3(t3 t3Var) {
        this.a = t3Var;
    }

    @Override // ki.r3
    public void b(boolean z10) {
        t3 t3Var = this.a;
        if (t3Var.P()) {
            return;
        }
        t3Var.K.e(0.0f);
    }

    @Override // org.telegram.messenger.i9
    public Object h(Object obj) {
        return Boolean.valueOf(this.a.b.p3.getKeyboardHeight() >= org.telegram.messenger.g0.L(20.0f));
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.a.b.dismiss();
    }
}
