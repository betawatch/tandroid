package com.google.android.recaptcha.internal;

import a8.ab;
import android.app.Application;
import gd.c;
import kotlin.jvm.internal.f;
import o8.e;
import zd.e0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class zzu extends zzg {
    private final zzcz zza;
    private String zzb;
    private e0 zzc;
    private final c zzd;

    public zzu() {
        this(null, null, 3, null);
    }

    public static final /* synthetic */ Application zzl(zzu zzuVar) {
        return (Application) zzuVar.zzd.getValue();
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
        int i7 = zzby.zza;
        this.zzd = ab.b(zzt.zza);
    }

    public zzu(zzcz zzczVar, e eVar, int i7, f fVar) {
        this(new zzcz(n6.e.b), null);
    }
}
