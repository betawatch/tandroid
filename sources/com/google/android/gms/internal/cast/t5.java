package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class t5 implements x5 {
    public final x5[] a;

    public t5(x5... x5VarArr) {
        this.a = x5VarArr;
    }

    @Override // com.google.android.gms.internal.cast.x5
    public final h6 zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            x5 x5Var = this.a[i10];
            if (x5Var.zzc(cls)) {
                return x5Var.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.cast.x5
    public final boolean zzc(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.a[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
