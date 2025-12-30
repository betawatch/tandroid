package com.google.android.recaptcha.internal;

import android.content.ContentResolver;
import android.os.Build;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class zzx implements zzar {
    private final Lazy zza;

    public zzx() {
        int i = zzby.zza;
        this.zza = LazyKt.lazy(zzw.zza);
    }

    public static final /* synthetic */ ContentResolver zzb(zzx zzxVar) {
        return (ContentResolver) zzxVar.zza.getValue();
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final int zza() {
        return 17;
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final /* synthetic */ Object zzc(String str, Continuation continuation) {
        return zzam.zza(this, str, continuation);
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final /* synthetic */ Object zzd(zzxp zzxpVar, Continuation continuation) {
        Object zzd;
        zzd = zzhj.zzd(36, zza(), new zzap(this, zzxpVar, null), continuation);
        return zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final Object zze(String str, Continuation continuation) {
        return new zzhg(new zzv(this, null));
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final /* synthetic */ Object zzf(zzxp zzxpVar, Continuation continuation) {
        return zzam.zzc(this, zzxpVar, continuation);
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final Object zzg(Exception exc, Continuation continuation) {
        int i = Build.VERSION.SDK_INT;
        zzys zzf = zzyt.zzf();
        zzf.zzr(16);
        zzf.zzq(i > 34 ? 59 : 58);
        return zzas.zza(this, (zzyt) zzf.zzk());
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final /* synthetic */ void zzh(zzyg zzygVar) {
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final boolean zzi() {
        return true;
    }
}
