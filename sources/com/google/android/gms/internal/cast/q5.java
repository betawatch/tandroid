package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class q5 extends r5 {
    @Override // com.google.android.gms.internal.cast.r5
    public final void a(Object obj, long j10) {
        u4 u4Var = (u4) ((k5) t6.h(obj, j10));
        if (u4Var.a) {
            u4Var.a = false;
        }
    }

    @Override // com.google.android.gms.internal.cast.r5
    public final void b(Object obj, long j10, Object obj2) {
        k5 k5Var = (k5) t6.h(obj, j10);
        k5 k5Var2 = (k5) t6.h(obj2, j10);
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
        t6.l(obj, j10, k5Var2);
    }
}
