package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
