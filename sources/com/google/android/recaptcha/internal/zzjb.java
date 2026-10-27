package com.google.android.recaptcha.internal;

import java.util.HashMap;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class zzjb {
    private final zzja zza;
    private final HashMap zzb;
    private final zzis zzc;
    private final zzdo zzd;

    public zzjb(zzis zzisVar, zzdo zzdoVar, zzct zzctVar) {
        this.zzc = zzisVar;
        this.zzd = zzdoVar;
        zzja zzjaVar = new zzja();
        this.zza = zzjaVar;
        HashMap hashMap = new HashMap();
        this.zzb = hashMap;
        zzjaVar.zzd(173, hashMap);
    }

    public final zzja zza() {
        return this.zza;
    }

    public final void zzb() {
        zzja zzjaVar = this.zza;
        zzjaVar.zzc();
        zzjaVar.zzd(173, this.zzb);
    }

    public final zzdo zzc() {
        return this.zzd;
    }

    public final zzis zzd() {
        return this.zzc;
    }

    public final void zze(int i10, Object obj) {
        this.zzb.put(Integer.valueOf(i10 - 2), obj);
    }
}
