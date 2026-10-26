package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class n5 extends o5 {
    @Override // com.google.android.gms.internal.cast.o5
    public final void a(Object obj, long j10) {
        r4 r4Var = (r4) ((h5) p6.h(obj, j10));
        if (r4Var.a) {
            r4Var.a = false;
        }
    }

    @Override // com.google.android.gms.internal.cast.o5
    public final void b(Object obj, long j10, Object obj2) {
        h5 h5Var = (h5) p6.h(obj, j10);
        h5 h5Var2 = (h5) p6.h(obj2, j10);
        int size = h5Var.size();
        int size2 = h5Var2.size();
        if (size > 0 && size2 > 0) {
            if (!((r4) h5Var).a) {
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
