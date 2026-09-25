package com.google.android.recaptcha.internal;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
final class zzuc {
    public static final /* synthetic */ int zza = 0;
    private static final zzuc zzb = new zzuc();
    private final ConcurrentMap zzd = new ConcurrentHashMap();
    private final zzuh zzc = new zztk();

    private zzuc() {
    }

    public static zzuc zza() {
        return zzb;
    }

    public final zzug zzb(Class cls) {
        zzsv.zzc(cls, "messageType");
        ConcurrentMap concurrentMap = this.zzd;
        zzug zzugVar = (zzug) concurrentMap.get(cls);
        if (zzugVar == null) {
            zzugVar = this.zzc.zza(cls);
            zzsv.zzc(cls, "messageType");
            zzug zzugVar2 = (zzug) concurrentMap.putIfAbsent(cls, zzugVar);
            if (zzugVar2 != null) {
                return zzugVar2;
            }
        }
        return zzugVar;
    }
}
