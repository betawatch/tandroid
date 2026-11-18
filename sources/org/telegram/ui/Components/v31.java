package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class v31 {
    public final /* synthetic */ e41 a;
    public final /* synthetic */ h41 b;

    public v31(h41 h41Var, e41 e41Var) {
        this.b = h41Var;
        this.a = e41Var;
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
        h41 h41Var = this.b;
        x31 x31Var = h41Var.n;
        if (z10) {
            v4.i0 adapter = x31Var.getAdapter();
            jg.c2 c2Var = h41Var.w;
            if (adapter != c2Var) {
                x31Var.setAdapter(c2Var);
                if (x31Var.getAdapter().b() <= 0) {
                    h41Var.r.i1(0, org.telegram.messenger.g0.L(58.0f) + (-x31Var.getPaddingTop()) + h41Var.F, false);
                    return;
                }
                return;
            }
        }
        if (z10) {
            return;
        }
        v4.i0 adapter2 = x31Var.getAdapter();
        g41 g41Var = h41Var.s;
        if (adapter2 == g41Var) {
            return;
        }
        x31Var.setAdapter(g41Var);
        if (x31Var.getAdapter().b() <= 0) {
        }
    }
}
