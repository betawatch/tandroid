package com.google.android.gms.internal.clearcut;

/* loaded from: classes.dex */
public final class k0 implements o0 {
    public o0[] a;

    @Override // com.google.android.gms.internal.clearcut.o0
    public final boolean zza(Class cls) {
        for (o0 o0Var : this.a) {
            if (o0Var.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.clearcut.o0
    public final x0 zzb(Class cls) {
        for (o0 o0Var : this.a) {
            if (o0Var.zza(cls)) {
                return o0Var.zzb(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
