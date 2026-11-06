package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
