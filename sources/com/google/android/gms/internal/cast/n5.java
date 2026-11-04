package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class n5 extends o5 {
    @Override // com.google.android.gms.internal.cast.o5
    public final void a(Object obj, long j10) {
        s4 s4Var = (s4) ((h5) p6.h(obj, j10));
        if (s4Var.a) {
            s4Var.a = false;
        }
    }

    @Override // com.google.android.gms.internal.cast.o5
    public final void b(Object obj, long j10, Object obj2) {
        h5 h5Var = (h5) p6.h(obj, j10);
        h5 h5Var2 = (h5) p6.h(obj2, j10);
        int size = h5Var.size();
        int size2 = h5Var2.size();
        if (size > 0 && size2 > 0) {
            if (!((s4) h5Var).a) {
                h5Var = h5Var.zzg(size2 + size);
            }
            h5Var.addAll(h5Var2);
        }
        if (size > 0) {
            h5Var2 = h5Var;
        }
        p6.l(obj, j10, h5Var2);
    }
}
