package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import g7.y5;
import hd.c0;
import oc.f;
import qc.c;
import rc.a;
import sc.i;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zzen extends i implements p {
    int zza;
    final /* synthetic */ zzeq zzb;
    final /* synthetic */ RecaptchaAction zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzen(zzeq zzeqVar, RecaptchaAction recaptchaAction, long j10, c cVar) {
        super(2, cVar);
        this.zzb = zzeqVar;
        this.zzc = recaptchaAction;
        this.zzd = j10;
    }

    @Override // sc.a
    public final c create(Object obj, c cVar) {
        return new zzen(this.zzb, this.zzc, this.zzd, cVar);
    }

    @Override // zc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzen) create((c0) obj, (c) obj2)).invokeSuspend(oc.i.a);
    }

    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        Object zze;
        a aVar = a.a;
        int i9 = this.zza;
        y5.b(obj);
        if (i9 != 0) {
            zze = ((f) obj).a;
        } else {
            zzeq zzeqVar = this.zzb;
            RecaptchaAction recaptchaAction = this.zzc;
            long j10 = this.zzd;
            this.zza = 1;
            zze = zzeqVar.zze(recaptchaAction, j10, this);
            if (zze == aVar) {
                return aVar;
            }
        }
        y5.b(zze);
        return zze;
    }
}
