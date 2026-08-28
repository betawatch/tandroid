package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import g7.y5;
import qc.c;
import rc.a;
import sc.i;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zzem extends i implements p {
    int zza;
    final /* synthetic */ zzeq zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ RecaptchaAction zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzem(zzeq zzeqVar, long j10, RecaptchaAction recaptchaAction, c cVar) {
        super(2, cVar);
        this.zzb = zzeqVar;
        this.zzc = j10;
        this.zzd = recaptchaAction;
    }

    @Override // sc.a
    public final c create(Object obj, c cVar) {
        zzem zzemVar = new zzem(this.zzb, this.zzc, this.zzd, cVar);
        zzemVar.zze = obj;
        return zzemVar;
    }

    @Override // zc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzem) create((zzhh) obj, (c) obj2)).invokeSuspend(oc.i.a);
    }

    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i9 = this.zza;
        y5.b(obj);
        if (i9 != 0) {
            return obj;
        }
        zzhh zzhhVar = (zzhh) this.zze;
        zzel zzelVar = new zzel(this.zzb, this.zzc, this.zzd, null);
        this.zza = 1;
        Object zza = zzhj.zza(zzhhVar, zzelVar, this);
        return zza == aVar ? aVar : zza;
    }
}
