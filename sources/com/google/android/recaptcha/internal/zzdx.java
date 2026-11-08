package com.google.android.recaptcha.internal;

import af.b;
import android.app.Application;
import gd.k;
import id.c;
import kd.j;
import rd.p;
import zd.z;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
final class zzdx extends j implements p {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdx(Application application, String str, long j3, c cVar) {
        super(2, cVar);
        this.zzb = application;
        this.zzc = str;
        this.zzd = j3;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzdx(this.zzb, this.zzc, this.zzd, cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdx) create((z) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.a;
        int i7 = this.zza;
        b.c(obj);
        if (i7 != 0) {
            return obj;
        }
        Application application = this.zzb;
        String str = this.zzc;
        long j3 = this.zzd;
        this.zza = 1;
        Object zzb = zzdz.zzb(application, str, j3, this);
        return zzb == aVar ? aVar : zzb;
    }
}
