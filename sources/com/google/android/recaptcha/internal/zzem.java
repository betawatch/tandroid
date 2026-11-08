package com.google.android.recaptcha.internal;

import af.b;
import com.google.android.recaptcha.RecaptchaAction;
import gd.k;
import id.c;
import kd.j;
import rd.p;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
final class zzem extends j implements p {
    int zza;
    final /* synthetic */ zzeq zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ RecaptchaAction zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzem(zzeq zzeqVar, long j3, RecaptchaAction recaptchaAction, c cVar) {
        super(2, cVar);
        this.zzb = zzeqVar;
        this.zzc = j3;
        this.zzd = recaptchaAction;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        zzem zzemVar = new zzem(this.zzb, this.zzc, this.zzd, cVar);
        zzemVar.zze = obj;
        return zzemVar;
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzem) create((zzhh) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.a;
        int i7 = this.zza;
        b.c(obj);
        if (i7 != 0) {
            return obj;
        }
        zzhh zzhhVar = (zzhh) this.zze;
        zzel zzelVar = new zzel(this.zzb, this.zzc, this.zzd, null);
        this.zza = 1;
        Object zza = zzhj.zza(zzhhVar, zzelVar, this);
        return zza == aVar ? aVar : zza;
    }
}
