package com.google.android.recaptcha.internal;

import ad.g;
import cd.c;
import com.google.android.recaptcha.RecaptchaAction;
import dd.a;
import ed.j;
import l9.b;
import ld.p;
import td.c0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
final class zzen extends j implements p {
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

    @Override // ed.a
    public final c create(Object obj, c cVar) {
        return new zzen(this.zzb, this.zzc, this.zzd, cVar);
    }

    @Override // ld.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzen) create((c0) obj, (c) obj2)).invokeSuspend(ad.j.a);
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        Object zze;
        a aVar = a.a;
        int i10 = this.zza;
        b.b(obj);
        if (i10 != 0) {
            zze = ((g) obj).a;
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
        b.b(zze);
        return zze;
    }
}
