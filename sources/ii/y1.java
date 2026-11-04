package ii;

import org.telegram.messenger.e9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y1 implements b4, e9, org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ a3 a;

    public /* synthetic */ y1(a3 a3Var) {
        this.a = a3Var;
    }

    @Override // ii.b4
    public void a(boolean z10) {
        a3 a3Var = this.a;
        if (a3Var.f0 && z10) {
            return;
        }
        a3Var.o(true);
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        this.a.o(false);
    }

    @Override // org.telegram.messenger.e9
    public Object k(Object obj) {
        return Boolean.valueOf(this.a.f.getKeyboardHeight() >= org.telegram.messenger.g0.L(20.0f));
    }
}
