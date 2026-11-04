package ii;

import org.telegram.messenger.e9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u3 implements org.telegram.ui.ActionBar.p1, b4, e9 {
    public final /* synthetic */ d4 a;

    public /* synthetic */ u3(d4 d4Var) {
        this.a = d4Var;
    }

    @Override // ii.b4
    public void a(boolean z10) {
        d4 d4Var = this.a;
        if (d4Var.O()) {
            return;
        }
        d4Var.K.e(0.0f);
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        this.a.b.dismiss();
    }

    @Override // org.telegram.messenger.e9
    public Object k(Object obj) {
        return Boolean.valueOf(this.a.b.m3.getKeyboardHeight() >= org.telegram.messenger.g0.L(20.0f));
    }
}
