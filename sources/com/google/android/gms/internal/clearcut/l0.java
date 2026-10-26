package com.google.android.gms.internal.clearcut;

/* loaded from: classes.dex */
public final class l0 implements p0 {
    public p0[] a;

    @Override // com.google.android.gms.internal.clearcut.p0
    public final boolean zza(Class cls) {
        for (p0 p0Var : this.a) {
            if (p0Var.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.clearcut.p0
    public final x0 zzb(Class cls) {
        for (p0 p0Var : this.a) {
            if (p0Var.zza(cls)) {
                return p0Var.zzb(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
