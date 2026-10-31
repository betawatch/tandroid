package com.google.android.recaptcha.internal;

import android.app.Application;
import cd.c;
import dd.a;
import ed.j;
import l9.b;
import ld.p;
import td.c0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
final class zzdx extends j implements p {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdx(Application application, String str, long j10, c cVar) {
        super(2, cVar);
        this.zzb = application;
        this.zzc = str;
        this.zzd = j10;
    }

    @Override // ed.a
    public final c create(Object obj, c cVar) {
        return new zzdx(this.zzb, this.zzc, this.zzd, cVar);
    }

    @Override // ld.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdx) create((c0) obj, (c) obj2)).invokeSuspend(ad.j.a);
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        b.b(obj);
        if (i10 != 0) {
            return obj;
        }
        Application application = this.zzb;
        String str = this.zzc;
        long j10 = this.zzd;
        this.zza = 1;
        Object zzb = zzdz.zzb(application, str, j10, this);
        return zzb == aVar ? aVar : zzb;
    }
}
