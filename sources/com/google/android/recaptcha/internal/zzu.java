package com.google.android.recaptcha.internal;

import ad.c;
import ad.h;
import android.app.Application;
import ib.a;
import l8.e;
import td.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class zzu extends zzg {
    private final zzcz zza;
    private String zzb;
    private h0 zzc;
    private final c zzd;

    public zzu() {
        this(null, null, 3, null);
    }

    public static final /* synthetic */ Application zzl(zzu zzuVar) {
        return (Application) ((h) zzuVar.zzd).a();
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zza(String str, cd.c cVar) {
        zzxw zzf = zzxx.zzf();
        zzf.zze(str);
        return zzf.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzb(String str, cd.c cVar) {
        return new zzhg(new zzr(this, str, null));
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzd(zzxn zzxnVar, cd.c cVar) {
        return new zzhg(new zzs(this, zzxnVar, null));
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final int zzj() {
        return 40;
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final int zzk() {
        return 39;
    }

    public zzu(zzcz zzczVar, e eVar) {
        this.zza = zzczVar;
        int i10 = zzby.zza;
        this.zzd = a.a(zzt.zza);
    }

    public zzu(zzcz zzczVar, e eVar, int i10, kotlin.jvm.internal.e eVar2) {
        this(new zzcz(k6.e.b), null);
    }
}
