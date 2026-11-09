package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class h31 {
    public final /* synthetic */ q31 a;
    public final /* synthetic */ u31 b;

    public h31(u31 u31Var, q31 q31Var) {
        this.b = u31Var;
        this.a = q31Var;
    }

    public final int a() {
        return this.b.s.w;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(boolean z9) {
        u31 u31Var = this.b;
        j31 j31Var = u31Var.n;
        if (z9) {
            v4.g0 adapter = j31Var.getAdapter();
            jg.d2 d2Var = u31Var.w;
            if (adapter != d2Var) {
                j31Var.setAdapter(d2Var);
                if (j31Var.getAdapter().b() <= 0) {
                    u31Var.r.i1(0, org.telegram.messenger.g0.L(58.0f) + (-j31Var.getPaddingTop()) + u31Var.E, false);
                    return;
                }
                return;
            }
        }
        if (z9) {
            return;
        }
        v4.g0 adapter2 = j31Var.getAdapter();
        t31 t31Var = u31Var.s;
        if (adapter2 == t31Var) {
            return;
        }
        j31Var.setAdapter(t31Var);
        if (j31Var.getAdapter().b() <= 0) {
        }
    }
}
