package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j41 {
    public final /* synthetic */ s41 a;
    public final /* synthetic */ w41 b;

    public j41(w41 w41Var, s41 s41Var) {
        this.b = w41Var;
        this.a = s41Var;
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
        w41 w41Var = this.b;
        l41 l41Var = w41Var.n;
        if (z10) {
            s4.g0 adapter = l41Var.getAdapter();
            zf.o1 o1Var = w41Var.w;
            if (adapter != o1Var) {
                l41Var.setAdapter(o1Var);
                if (l41Var.getAdapter().b() <= 0) {
                    w41Var.r.i1(0, org.telegram.messenger.i0.L(58.0f) + (-l41Var.getPaddingTop()) + w41Var.E, false);
                    return;
                }
                return;
            }
        }
        if (z10) {
            return;
        }
        s4.g0 adapter2 = l41Var.getAdapter();
        v41 v41Var = w41Var.s;
        if (adapter2 == v41Var) {
            return;
        }
        l41Var.setAdapter(v41Var);
        if (l41Var.getAdapter().b() <= 0) {
        }
    }
}
