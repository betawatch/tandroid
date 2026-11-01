package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class k41 {
    public final /* synthetic */ t41 a;
    public final /* synthetic */ x41 b;

    public k41(x41 x41Var, t41 t41Var) {
        this.b = x41Var;
        this.a = t41Var;
    }

    public final int a() {
        return this.b.s.w;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(boolean z10) {
        x41 x41Var = this.b;
        m41 m41Var = x41Var.n;
        if (z10) {
            s4.g0 adapter = m41Var.getAdapter();
            zf.o1 o1Var = x41Var.w;
            if (adapter != o1Var) {
                m41Var.setAdapter(o1Var);
                if (m41Var.getAdapter().b() <= 0) {
                    x41Var.r.i1(0, org.telegram.messenger.i0.L(58.0f) + (-m41Var.getPaddingTop()) + x41Var.E, false);
                    return;
                }
                return;
            }
        }
        if (z10) {
            return;
        }
        s4.g0 adapter2 = m41Var.getAdapter();
        w41 w41Var = x41Var.s;
        if (adapter2 == w41Var) {
            return;
        }
        m41Var.setAdapter(w41Var);
        if (m41Var.getAdapter().b() <= 0) {
        }
    }
}
