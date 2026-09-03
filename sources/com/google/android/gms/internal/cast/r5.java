package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class r5 implements v5 {
    public final v5[] a;

    public r5(v5... v5VarArr) {
        this.a = v5VarArr;
    }

    @Override // com.google.android.gms.internal.cast.v5
    public final e6 zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            v5 v5Var = this.a[i10];
            if (v5Var.zzc(cls)) {
                return v5Var.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.cast.v5
    public final boolean zzc(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.a[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
