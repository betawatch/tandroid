package com.google.android.recaptcha.internal;

import android.app.Application;
import be.i0;
import id.c;
import id.g;
import l8.e;
import v7.h8;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class zzu extends zzg {
    private final zzcz zza;
    private String zzb;
    private i0 zzc;
    private final c zzd;

    public zzu() {
        this(null, null, 3, null);
    }

    public static final /* synthetic */ Application zzl(zzu zzuVar) {
        return (Application) ((g) zzuVar.zzd).a();
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zza(String str, kd.c cVar) {
        zzxw zzf = zzxx.zzf();
        zzf.zze(str);
        return zzf.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzb(String str, kd.c cVar) {
        return new zzhg(new zzr(this, str, null));
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzd(zzxn zzxnVar, kd.c cVar) {
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
        this.zzd = h8.a(zzt.zza);
    }

    public zzu(zzcz zzczVar, e eVar, int i10, kotlin.jvm.internal.e eVar2) {
        this(new zzcz(k6.e.b), null);
    }
}
