package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b31 {
    public final /* synthetic */ k31 a;
    public final /* synthetic */ n31 b;

    public b31(n31 n31Var, k31 k31Var) {
        this.b = n31Var;
        this.a = k31Var;
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
        n31 n31Var = this.b;
        d31 d31Var = n31Var.n;
        if (z10) {
            u4.h0 adapter = d31Var.getAdapter();
            kg.y1 y1Var = n31Var.w;
            if (adapter != y1Var) {
                d31Var.setAdapter(y1Var);
                if (d31Var.getAdapter().b() <= 0) {
                    n31Var.r.i1(0, org.telegram.messenger.g0.L(58.0f) + (-d31Var.getPaddingTop()) + n31Var.F, false);
                    return;
                }
                return;
            }
        }
        if (z10) {
            return;
        }
        u4.h0 adapter2 = d31Var.getAdapter();
        m31 m31Var = n31Var.s;
        if (adapter2 == m31Var) {
            return;
        }
        d31Var.setAdapter(m31Var);
        if (d31Var.getAdapter().b() <= 0) {
        }
    }
}
