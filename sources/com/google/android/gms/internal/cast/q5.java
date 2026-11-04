package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class q5 implements u5 {
    public final u5[] a;

    public q5(u5... u5VarArr) {
        this.a = u5VarArr;
    }

    @Override // com.google.android.gms.internal.cast.u5
    public final d6 zzb(Class cls) {
        for (int i3 = 0; i3 < 2; i3++) {
            u5 u5Var = this.a[i3];
            if (u5Var.zzc(cls)) {
                return u5Var.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.cast.u5
    public final boolean zzc(Class cls) {
        for (int i3 = 0; i3 < 2; i3++) {
            if (this.a[i3].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
