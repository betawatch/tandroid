package com.google.android.recaptcha.internal;

import java.util.HashMap;
import org.telegram.messenger.at;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
        zzjaVar.zzd(at.D2, hashMap);
    }

    public final zzja zza() {
        return this.zza;
    }

    public final void zzb() {
        zzja zzjaVar = this.zza;
        zzjaVar.zzc();
        zzjaVar.zzd(at.D2, this.zzb);
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
