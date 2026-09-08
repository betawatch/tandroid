package com.google.android.recaptcha.internal;

import gd.c;
import gd.g;
import v7.s7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class zzad implements zzar {
    private final c zza;
    private boolean zzb;

    public zzad() {
        int i10 = zzby.zza;
        this.zza = s7.a(zzac.zza);
        this.zzb = true;
    }

    public static final /* synthetic */ zzci zzb(zzad zzadVar) {
        return (zzci) ((g) zzadVar.zza).a();
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final int zza() {
        return 25;
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final /* synthetic */ Object zzc(String str, id.c cVar) {
        return zzam.zza(this, str, cVar);
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final /* synthetic */ Object zzd(zzxp zzxpVar, id.c cVar) {
        Object zzd;
        zzd = zzhj.zzd(36, zza(), new zzap(this, zzxpVar, null), cVar);
        return zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final Object zze(String str, id.c cVar) {
        return new zzhg(new zzaa(this, null));
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final Object zzf(zzxp zzxpVar, id.c cVar) {
        return new zzhg(new zzab(zzxpVar, this, null));
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final /* synthetic */ Object zzg(Exception exc, id.c cVar) {
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
