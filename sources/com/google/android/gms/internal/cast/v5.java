package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class v5 implements z5 {
    public final z5[] a;

    public v5(z5... z5VarArr) {
        this.a = z5VarArr;
    }

    @Override // com.google.android.gms.internal.cast.z5
    public final i6 zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            z5 z5Var = this.a[i10];
            if (z5Var.zzc(cls)) {
                return z5Var.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.cast.z5
    public final boolean zzc(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.a[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
