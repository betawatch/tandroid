package ki;

import org.telegram.messenger.i9;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class u1 implements r3, i9, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ t2 a;

    public /* synthetic */ u1(t2 t2Var) {
        this.a = t2Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        this.a.o(false);
    }

    @Override // org.telegram.messenger.i9
    public Object m(Object obj) {
        return Boolean.valueOf(this.a.f.getKeyboardHeight() >= org.telegram.messenger.g0.L(20.0f));
    }

    @Override // ki.r3
    public void s(boolean z10) {
        t2 t2Var = this.a;
        if (t2Var.f0 && z10) {
            return;
        }
        t2Var.o(true);
    }
}
