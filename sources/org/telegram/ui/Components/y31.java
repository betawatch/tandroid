package org.telegram.ui.Components;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class y31 {
    public final /* synthetic */ h41 a;
    public final /* synthetic */ k41 b;

    public y31(k41 k41Var, h41 h41Var) {
        this.b = k41Var;
        this.a = h41Var;
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
        k41 k41Var = this.b;
        a41 a41Var = k41Var.n;
        if (z10) {
            v4.i0 adapter = a41Var.getAdapter();
            jg.c2 c2Var = k41Var.w;
            if (adapter != c2Var) {
                a41Var.setAdapter(c2Var);
                if (a41Var.getAdapter().b() <= 0) {
                    k41Var.r.i1(0, org.telegram.messenger.g0.L(58.0f) + (-a41Var.getPaddingTop()) + k41Var.F, false);
                    return;
                }
                return;
            }
        }
        if (z10) {
            return;
        }
        v4.i0 adapter2 = a41Var.getAdapter();
        j41 j41Var = k41Var.s;
        if (adapter2 == j41Var) {
            return;
        }
        a41Var.setAdapter(j41Var);
        if (a41Var.getAdapter().b() <= 0) {
        }
    }
}
