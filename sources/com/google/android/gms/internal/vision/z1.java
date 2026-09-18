package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class z1 implements d2 {
    public d2[] a;

    @Override // com.google.android.gms.internal.vision.d2
    public final boolean zza(Class cls) {
        for (d2 d2Var : this.a) {
            if (d2Var.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.vision.d2
    public final m2 zzb(Class cls) {
        for (d2 d2Var : this.a) {
            if (d2Var.zza(cls)) {
                return d2Var.zzb(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
