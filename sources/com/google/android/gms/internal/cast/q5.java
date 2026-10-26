package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class q5 implements u5 {
    public final u5[] a;

    public q5(u5... u5VarArr) {
        this.a = u5VarArr;
    }

    @Override // com.google.android.gms.internal.cast.u5
    public final d6 zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            u5 u5Var = this.a[i10];
            if (u5Var.zzc(cls)) {
                return u5Var.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.cast.u5
    public final boolean zzc(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.a[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
