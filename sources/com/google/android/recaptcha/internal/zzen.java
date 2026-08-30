package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import dd.p;
import k7.p7;
import ld.c0;
import sc.f;
import uc.c;
import vc.a;
import wc.i;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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

    @Override // wc.a
    public final c create(Object obj, c cVar) {
        return new zzen(this.zzb, this.zzc, this.zzd, cVar);
    }

    @Override // dd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzen) create((c0) obj, (c) obj2)).invokeSuspend(sc.i.a);
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        Object zze;
        a aVar = a.a;
        int i10 = this.zza;
        p7.b(obj);
        if (i10 != 0) {
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
        p7.b(zze);
        return zze;
    }
}
