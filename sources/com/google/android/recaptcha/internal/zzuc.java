package com.google.android.recaptcha.internal;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
        if (zzugVar != null) {
            return zzugVar;
        }
        zzug zza2 = this.zzc.zza(cls);
        zzsv.zzc(cls, "messageType");
        zzug zzugVar2 = (zzug) concurrentMap.putIfAbsent(cls, zza2);
        return zzugVar2 != null ? zzugVar2 : zza2;
    }
}
