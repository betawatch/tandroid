package com.google.android.recaptcha.internal;

import a8.bb;
import gd.c;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class zzad implements zzar {
    private final c zza;
    private boolean zzb;

    public zzad() {
        int i7 = zzby.zza;
        this.zza = bb.b(zzac.zza);
        this.zzb = true;
    }

    public static final /* synthetic */ zzci zzb(zzad zzadVar) {
        return (zzci) zzadVar.zza.getValue();
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
