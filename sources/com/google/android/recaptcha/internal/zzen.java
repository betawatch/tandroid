package com.google.android.recaptcha.internal;

import af.b;
import com.google.android.recaptcha.RecaptchaAction;
import gd.g;
import gd.k;
import id.c;
import jd.a;
import kd.j;
import rd.p;
import zd.z;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
final class zzen extends j implements p {
    int zza;
    final /* synthetic */ zzeq zzb;
    final /* synthetic */ RecaptchaAction zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzen(zzeq zzeqVar, RecaptchaAction recaptchaAction, long j3, c cVar) {
        super(2, cVar);
        this.zzb = zzeqVar;
        this.zzc = recaptchaAction;
        this.zzd = j3;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzen(this.zzb, this.zzc, this.zzd, cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzen) create((z) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        Object zze;
        a aVar = a.a;
        int i7 = this.zza;
        b.c(obj);
        if (i7 != 0) {
            zze = ((g) obj).a;
        } else {
            zzeq zzeqVar = this.zzb;
            RecaptchaAction recaptchaAction = this.zzc;
            long j3 = this.zzd;
            this.zza = 1;
            zze = zzeqVar.zze(recaptchaAction, j3, this);
            if (zze == aVar) {
                return aVar;
            }
        }
        b.c(zze);
        return zze;
    }
}
