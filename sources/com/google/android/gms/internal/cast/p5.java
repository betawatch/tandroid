package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class p5 implements t5 {
    public final t5[] a;

    public p5(t5... t5VarArr) {
        this.a = t5VarArr;
    }

    @Override // com.google.android.gms.internal.cast.t5
    public final c6 zzb(Class cls) {
        for (int i7 = 0; i7 < 2; i7++) {
            t5 t5Var = this.a[i7];
            if (t5Var.zzc(cls)) {
                return t5Var.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.cast.t5
    public final boolean zzc(Class cls) {
        for (int i7 = 0; i7 < 2; i7++) {
            if (this.a[i7].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
