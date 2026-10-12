package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class w1 extends s1 {
    @Override // com.google.android.gms.internal.vision.s1
    public final void a(Object obj, long j10, Object obj2) {
        o1 o1Var = (o1) x2.l(obj, j10);
        o1 o1Var2 = (o1) x2.l(obj2, j10);
        int size = o1Var.size();
        int size2 = o1Var2.size();
        if (size > 0 && size2 > 0) {
            if (!o1Var.zza()) {
                o1Var = o1Var.zza(size2 + size);
            }
            o1Var.addAll(o1Var2);
        }
        if (size > 0) {
            o1Var2 = o1Var;
        }
        x2.d(obj, j10, o1Var2);
    }

    @Override // com.google.android.gms.internal.vision.s1
    public final void b(Object obj, long j10) {
        ((o1) x2.l(obj, j10)).zzb();
    }
}
