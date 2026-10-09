package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class q5 extends r5 {
    @Override // com.google.android.gms.internal.cast.r5
    public final void a(Object obj, long j3) {
        u4 u4Var = (u4) ((k5) s6.h(obj, j3));
        if (u4Var.a) {
            u4Var.a = false;
        }
    }

    @Override // com.google.android.gms.internal.cast.r5
    public final void b(Object obj, long j3, Object obj2) {
        k5 k5Var = (k5) s6.h(obj, j3);
        k5 k5Var2 = (k5) s6.h(obj2, j3);
        int size = k5Var.size();
        int size2 = k5Var2.size();
        if (size > 0 && size2 > 0) {
            if (!((u4) k5Var).a) {
                k5Var = k5Var.zzg(size2 + size);
            }
            k5Var.addAll(k5Var2);
        }
        if (size > 0) {
            k5Var2 = k5Var;
        }
        s6.l(obj, j3, k5Var2);
    }
}
