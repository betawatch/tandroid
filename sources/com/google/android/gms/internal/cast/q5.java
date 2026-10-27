package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
