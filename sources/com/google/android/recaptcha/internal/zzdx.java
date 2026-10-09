package com.google.android.recaptcha.internal;

import ae.d0;
import android.app.Application;
import hd.i;
import jd.c;
import kd.a;
import ld.j;
import sd.p;
import v7.a8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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

    @Override // ld.a
    public final c create(Object obj, c cVar) {
        return new zzdx(this.zzb, this.zzc, this.zzd, cVar);
    }

    @Override // sd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdx) create((d0) obj, (c) obj2)).invokeSuspend(i.a);
    }

    @Override // ld.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        a8.b(obj);
        if (i10 != 0) {
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
