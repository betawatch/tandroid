package com.google.android.recaptcha.internal;

import a8.id;
import android.content.ContentResolver;
import android.os.Build;
import jd.c;
import jd.g;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class zzx implements zzar {
    private final c zza;

    public zzx() {
        int i10 = zzby.zza;
        this.zza = id.a(zzw.zza);
    }

    public static final /* synthetic */ ContentResolver zzb(zzx zzxVar) {
        return (ContentResolver) ((g) zzxVar.zza).a();
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final int zza() {
        return 17;
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final /* synthetic */ Object zzc(String str, ld.c cVar) {
        return zzam.zza(this, str, cVar);
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final /* synthetic */ Object zzd(zzxp zzxpVar, ld.c cVar) {
        Object zzd;
        zzd = zzhj.zzd(36, zza(), new zzap(this, zzxpVar, null), cVar);
        return zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final Object zze(String str, ld.c cVar) {
        return new zzhg(new zzv(this, null));
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final /* synthetic */ Object zzf(zzxp zzxpVar, ld.c cVar) {
        return zzam.zzc(this, zzxpVar, cVar);
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final Object zzg(Exception exc, ld.c cVar) {
        int i10 = Build.VERSION.SDK_INT;
        zzys zzf = zzyt.zzf();
        zzf.zzr(16);
        zzf.zzq(i10 > 34 ? 59 : 58);
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
