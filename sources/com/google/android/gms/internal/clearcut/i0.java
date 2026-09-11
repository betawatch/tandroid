package com.google.android.gms.internal.clearcut;

/* loaded from: classes.dex */
public final class i0 extends g0 {
    @Override // com.google.android.gms.internal.clearcut.g0
    public final void a(Object obj, long j3) {
        ((j) ((b0) j1.k(obj, j3))).a = false;
    }

    @Override // com.google.android.gms.internal.clearcut.g0
    public final void b(Object obj, long j3, Object obj2) {
        b0 b0Var = (b0) j1.k(obj, j3);
        b0 b0Var2 = (b0) j1.k(obj2, j3);
        int size = b0Var.size();
        int size2 = b0Var2.size();
        if (size > 0 && size2 > 0) {
            if (!((j) b0Var).a) {
                b0Var = b0Var.f(size2 + size);
            }
            b0Var.addAll(b0Var2);
        }
        if (size > 0) {
            b0Var2 = b0Var;
        }
        j1.d(obj, j3, b0Var2);
    }
}
