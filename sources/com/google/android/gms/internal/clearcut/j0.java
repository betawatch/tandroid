package com.google.android.gms.internal.clearcut;

/* loaded from: classes.dex */
public final class j0 extends h0 {
    @Override // com.google.android.gms.internal.clearcut.h0
    public final void a(Object obj, long j10) {
        ((k) ((c0) k1.k(obj, j10))).a = false;
    }

    @Override // com.google.android.gms.internal.clearcut.h0
    public final void b(Object obj, long j10, Object obj2) {
        c0 c0Var = (c0) k1.k(obj, j10);
        c0 c0Var2 = (c0) k1.k(obj2, j10);
        int size = c0Var.size();
        int size2 = c0Var2.size();
        if (size > 0 && size2 > 0) {
            if (!((k) c0Var).a) {
                c0Var = c0Var.d(size2 + size);
            }
            c0Var.addAll(c0Var2);
        }
        if (size > 0) {
            c0Var2 = c0Var;
        }
        k1.d(obj, j10, c0Var2);
    }
}
