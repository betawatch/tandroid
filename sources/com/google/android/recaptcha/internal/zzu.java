package com.google.android.recaptcha.internal;

import a8.id;
import android.app.Application;
import ce.i0;
import jd.c;
import jd.g;
import m8.e;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
    public final Object zza(String str, ld.c cVar) {
        zzxw zzf = zzxx.zzf();
        zzf.zze(str);
        return zzf.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzb(String str, ld.c cVar) {
        return new zzhg(new zzr(this, str, null));
    }

    @Override // com.google.android.recaptcha.internal.zzg
    public final Object zzd(zzxn zzxnVar, ld.c cVar) {
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
        this.zzd = id.a(zzt.zza);
    }

    public zzu(zzcz zzczVar, e eVar, int i10, kotlin.jvm.internal.e eVar2) {
        this(new zzcz(l6.e.b), null);
    }
}
