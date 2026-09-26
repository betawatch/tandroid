package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import gd.i;
import id.c;
import jd.a;
import kd.j;
import rd.p;
import v7.u7;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
        return ((zzem) create((zzhh) obj, (c) obj2)).invokeSuspend(i.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        u7.b(obj);
        if (i10 != 0) {
            return obj;
        }
        zzhh zzhhVar = (zzhh) this.zze;
        zzel zzelVar = new zzel(this.zzb, this.zzc, this.zzd, null);
        this.zza = 1;
        Object zza = zzhj.zza(zzhhVar, zzelVar, this);
        return zza == aVar ? aVar : zza;
    }
}
