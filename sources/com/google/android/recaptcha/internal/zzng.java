package com.google.android.recaptcha.internal;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
            u36.j("key must be repeating");
        } else {
            this.zzc.remove(zzmxVar);
            this.zzd.put(zzmxVar, zzniVar);
        }
    }
}
