package com.google.android.gms.internal.vision;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
final class zzky {
    private static final zzky zza = new zzky();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzlf zzb = new zzkb();

    public static zzky zza() {
        return zza;
    }

    public final zzlc zza(Class cls) {
        zzjf.zza((Object) cls, "messageType");
        zzlc zzlcVar = (zzlc) this.zzc.get(cls);
        if (zzlcVar == null) {
            zzlcVar = this.zzb.zza(cls);
            zzjf.zza((Object) cls, "messageType");
            zzjf.zza((Object) zzlcVar, "schema");
            zzlc zzlcVar2 = (zzlc) this.zzc.putIfAbsent(cls, zzlcVar);
            if (zzlcVar2 != null) {
                return zzlcVar2;
            }
        }
        return zzlcVar;
    }

    public final zzlc zza(Object obj) {
        return zza((Class) obj.getClass());
    }

    private zzky() {
    }
}
