package com.google.android.recaptcha.internal;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class zzng {
    private static final zznj zza = new zzne();
    private static final zzni zzb = new zznf();
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();

    public /* synthetic */ zzng(zznj zznjVar, zznk zznkVar) {
    }

    public final zznl zza() {
        return new zznh(this, null);
    }

    public final void zzd(zzmx zzmxVar) {
        zzot.zza(zzmxVar, "key");
        if (!zzmxVar.zzb()) {
            zznj zznjVar = zza;
            zzot.zza(zzmxVar, "key");
            this.zzd.remove(zzmxVar);
            this.zzc.put(zzmxVar, zznjVar);
            return;
        }
        zzni zzniVar = zzb;
        zzot.zza(zzmxVar, "key");
        if (!zzmxVar.zzb()) {
            throw new IllegalArgumentException("key must be repeating");
        }
        this.zzc.remove(zzmxVar);
        this.zzd.put(zzmxVar, zzniVar);
    }
}
