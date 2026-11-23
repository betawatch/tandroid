package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class x31 {
    public final /* synthetic */ g41 a;
    public final /* synthetic */ j41 b;

    public x31(j41 j41Var, g41 g41Var) {
        this.b = j41Var;
        this.a = g41Var;
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
        j41 j41Var = this.b;
        z31 z31Var = j41Var.n;
        if (z10) {
            v4.i0 adapter = z31Var.getAdapter();
            jg.c2 c2Var = j41Var.w;
            if (adapter != c2Var) {
                z31Var.setAdapter(c2Var);
                if (z31Var.getAdapter().b() <= 0) {
                    j41Var.r.i1(0, org.telegram.messenger.g0.L(58.0f) + (-z31Var.getPaddingTop()) + j41Var.F, false);
                    return;
                }
                return;
            }
        }
        if (z10) {
            return;
        }
        v4.i0 adapter2 = z31Var.getAdapter();
        i41 i41Var = j41Var.s;
        if (adapter2 == i41Var) {
            return;
        }
        z31Var.setAdapter(i41Var);
        if (z31Var.getAdapter().b() <= 0) {
        }
    }
}
