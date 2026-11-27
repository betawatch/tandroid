package com.google.android.recaptcha.internal;

import android.app.Application;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class zzu extends zzg {
    private final zzcz zza;
    private String zzb;
    private rd3 zzc;
    private final h26 zzd;

    public zzu(zzcz zzczVar, k59 k59Var) {
        this.zza = zzczVar;
        int i = zzby.zza;
        this.zzd = ure.b(zzt.zza);
    }

    public static final /* synthetic */ Application zzl(zzu zzuVar) {
        return (Application) zzuVar.zzd.getValue();
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zza(String str, zw2 zw2Var) {
        zzxw zzf = zzxx.zzf();
        zzf.zze(str);
        return zzf.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzb(String str, zw2 zw2Var) {
        return new zzhg(new zzr(this, str, null));
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzd(zzxn zzxnVar, zw2 zw2Var) {
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

    public zzu() {
        this(null, null, 3, null);
    }

    public zzu(zzcz zzczVar, k59 k59Var, int i, ma3 ma3Var) {
        this(new zzcz(j05.b), null);
    }
}
