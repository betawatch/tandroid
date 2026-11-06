package org.telegram.ui.Components;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class a31 {
    public final /* synthetic */ j31 a;
    public final /* synthetic */ n31 b;

    public a31(n31 n31Var, j31 j31Var) {
        this.b = n31Var;
        this.a = j31Var;
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
        n31 n31Var = this.b;
        c31 c31Var = n31Var.n;
        if (z9) {
            v4.g0 adapter = c31Var.getAdapter();
            jg.d2 d2Var = n31Var.w;
            if (adapter != d2Var) {
                c31Var.setAdapter(d2Var);
                if (c31Var.getAdapter().b() <= 0) {
                    n31Var.r.i1(0, org.telegram.messenger.g0.L(58.0f) + (-c31Var.getPaddingTop()) + n31Var.E, false);
                    return;
                }
                return;
            }
        }
        if (z9) {
            return;
        }
        v4.g0 adapter2 = c31Var.getAdapter();
        m31 m31Var = n31Var.s;
        if (adapter2 == m31Var) {
            return;
        }
        c31Var.setAdapter(m31Var);
        if (c31Var.getAdapter().b() <= 0) {
        }
    }
}
