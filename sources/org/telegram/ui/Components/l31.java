package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class l31 {
    public final /* synthetic */ u31 a;
    public final /* synthetic */ x31 b;

    public l31(x31 x31Var, u31 u31Var) {
        this.b = x31Var;
        this.a = u31Var;
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
        x31 x31Var = this.b;
        n31 n31Var = x31Var.n;
        if (z10) {
            v4.h0 adapter = n31Var.getAdapter();
            jg.c2 c2Var = x31Var.w;
            if (adapter != c2Var) {
                n31Var.setAdapter(c2Var);
                if (n31Var.getAdapter().b() <= 0) {
                    x31Var.r.i1(0, org.telegram.messenger.g0.L(58.0f) + (-n31Var.getPaddingTop()) + x31Var.F, false);
                    return;
                }
                return;
            }
        }
        if (z10) {
            return;
        }
        v4.h0 adapter2 = n31Var.getAdapter();
        w31 w31Var = x31Var.s;
        if (adapter2 == w31Var) {
            return;
        }
        n31Var.setAdapter(w31Var);
        if (n31Var.getAdapter().b() <= 0) {
        }
    }
}
