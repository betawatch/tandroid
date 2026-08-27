package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class o5 extends p5 {
    @Override // com.google.android.gms.internal.cast.p5
    public final void a(Object obj, long j10) {
        s4 s4Var = (s4) ((i5) q6.h(obj, j10));
        if (s4Var.a) {
            s4Var.a = false;
        }
    }

    @Override // com.google.android.gms.internal.cast.p5
    public final void b(Object obj, long j10, Object obj2) {
        i5 i5Var = (i5) q6.h(obj, j10);
        i5 i5Var2 = (i5) q6.h(obj2, j10);
        int size = i5Var.size();
        int size2 = i5Var2.size();
        if (size > 0 && size2 > 0) {
            if (!((s4) i5Var).a) {
                i5Var = i5Var.zzg(size2 + size);
            }
            i5Var.addAll(i5Var2);
        }
        if (size > 0) {
            i5Var2 = i5Var;
        }
        q6.l(obj, j10, i5Var2);
    }
}
