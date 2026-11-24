package com.google.android.recaptcha.internal;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
            w26.j("key must be repeating");
        } else {
            this.zzc.remove(zzmxVar);
            this.zzd.put(zzmxVar, zzniVar);
        }
    }
}
