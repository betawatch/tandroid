package com.google.android.recaptcha.internal;

import android.app.Application;
import gd.c;
import gd.g;
import l8.e;
import v7.t7;
import zd.h0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        return (Application) ((g) zzuVar.zzd).a();
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zza(String str, id.c cVar) {
        zzxw zzf = zzxx.zzf();
        zzf.zze(str);
        return zzf.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzb(String str, id.c cVar) {
        return new zzhg(new zzr(this, str, null));
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzd(zzxn zzxnVar, id.c cVar) {
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
        this.zzd = t7.a(zzt.zza);
    }

    public zzu(zzcz zzczVar, e eVar, int i10, kotlin.jvm.internal.e eVar2) {
        this(new zzcz(k6.e.b), null);
    }
}
