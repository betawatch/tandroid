package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class p5 extends q5 {
    @Override // com.google.android.gms.internal.cast.q5
    public final void a(Object obj, long j10) {
        u4 u4Var = (u4) ((j5) r6.h(obj, j10));
        if (u4Var.a) {
            u4Var.a = false;
        }
    }

    @Override // com.google.android.gms.internal.cast.q5
    public final void b(Object obj, long j10, Object obj2) {
        j5 j5Var = (j5) r6.h(obj, j10);
        j5 j5Var2 = (j5) r6.h(obj2, j10);
        int size = j5Var.size();
        int size2 = j5Var2.size();
        if (size > 0 && size2 > 0) {
            if (!((u4) j5Var).a) {
                j5Var = j5Var.zzg(size2 + size);
            }
            j5Var.addAll(j5Var2);
        }
        if (size > 0) {
            j5Var2 = j5Var;
        }
        r6.l(obj, j10, j5Var2);
    }
}
