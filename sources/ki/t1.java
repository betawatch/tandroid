package ki;

import org.telegram.messenger.j9;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t1 implements q3, j9, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ s2 a;

    public /* synthetic */ t1(s2 s2Var) {
        this.a = s2Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.a.o(false);
    }

    @Override // org.telegram.messenger.j9
    public Object m(Object obj) {
        return Boolean.valueOf(this.a.f.getKeyboardHeight() >= org.telegram.messenger.g0.L(20.0f));
    }

    @Override // ki.q3
    public void s(boolean z10) {
        s2 s2Var = this.a;
        if (s2Var.f0 && z10) {
            return;
        }
        s2Var.o(true);
    }
}
