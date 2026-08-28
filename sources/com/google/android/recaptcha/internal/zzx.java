package com.google.android.recaptcha.internal;

import android.content.ContentResolver;
import android.os.Build;
import g7.x5;
import oc.c;
import oc.g;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class zzx implements zzar {
    private final c zza;

    public zzx() {
        int i9 = zzby.zza;
        this.zza = x5.a(zzw.zza);
    }

    public static final /* synthetic */ ContentResolver zzb(zzx zzxVar) {
        return (ContentResolver) ((g) zzxVar.zza).a();
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final int zza() {
        return 17;
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final /* synthetic */ Object zzc(String str, qc.c cVar) {
        return zzam.zza(this, str, cVar);
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final /* synthetic */ Object zzd(zzxp zzxpVar, qc.c cVar) {
        Object zzd;
        zzd = zzhj.zzd(36, zza(), new zzap(this, zzxpVar, null), cVar);
        return zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final Object zze(String str, qc.c cVar) {
        return new zzhg(new zzv(this, null));
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final /* synthetic */ Object zzf(zzxp zzxpVar, qc.c cVar) {
        return zzam.zzc(this, zzxpVar, cVar);
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final Object zzg(Exception exc, qc.c cVar) {
        int i9 = Build.VERSION.SDK_INT;
        zzys zzf = zzyt.zzf();
        zzf.zzr(16);
        zzf.zzq(i9 > 34 ? 59 : 58);
        return zzas.zza(this, (zzyt) zzf.zzk());
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final boolean zzi() {
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final /* synthetic */ void zzh(zzyg zzygVar) {
    }
}
