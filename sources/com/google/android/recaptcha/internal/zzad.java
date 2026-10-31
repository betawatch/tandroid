package com.google.android.recaptcha.internal;

import ad.c;
import ad.h;
import ib.a;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class zzad implements zzar {
    private final c zza;
    private boolean zzb;

    public zzad() {
        int i10 = zzby.zza;
        this.zza = a.a(zzac.zza);
        this.zzb = true;
    }

    public static final /* synthetic */ zzci zzb(zzad zzadVar) {
        return (zzci) ((h) zzadVar.zza).a();
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final int zza() {
        return 25;
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final /* synthetic */ Object zzc(String str, cd.c cVar) {
        return zzam.zza(this, str, cVar);
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final /* synthetic */ Object zzd(zzxp zzxpVar, cd.c cVar) {
        Object zzd;
        zzd = zzhj.zzd(36, zza(), new zzap(this, zzxpVar, null), cVar);
        return zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final Object zze(String str, cd.c cVar) {
        return new zzhg(new zzaa(this, null));
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final Object zzf(zzxp zzxpVar, cd.c cVar) {
        return new zzhg(new zzab(zzxpVar, this, null));
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final /* synthetic */ Object zzg(Exception exc, cd.c cVar) {
        return zzam.zzd(this, exc, cVar);
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final boolean zzi() {
        return this.zzb;
    }

    public final void zzj(boolean z10) {
        this.zzb = false;
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final void zzh(zzyg zzygVar) {
    }
}
