package com.google.android.gms.internal.cast;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
final class zzvf {
    private static final zzvf zza = new zzvf();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzvj zzb = new zzup();

    private zzvf() {
    }

    public static zzvf zza() {
        return zza;
    }

    public final zzvi zzb(Class cls) {
        zzty.zzc(cls, "messageType");
        zzvi zzviVar = (zzvi) this.zzc.get(cls);
        if (zzviVar != null) {
            return zzviVar;
        }
        zzvi zza2 = this.zzb.zza(cls);
        zzty.zzc(cls, "messageType");
        zzvi zzviVar2 = (zzvi) this.zzc.putIfAbsent(cls, zza2);
        return zzviVar2 == null ? zza2 : zzviVar2;
    }
}
