package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class s5 implements w5 {
    public final w5[] a;

    public s5(w5... w5VarArr) {
        this.a = w5VarArr;
    }

    @Override // com.google.android.gms.internal.cast.w5
    public final f6 zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            w5 w5Var = this.a[i10];
            if (w5Var.zzc(cls)) {
                return w5Var.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.cast.w5
    public final boolean zzc(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.a[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
