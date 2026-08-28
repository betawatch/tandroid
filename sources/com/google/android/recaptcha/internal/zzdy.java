package com.google.android.recaptcha.internal;

import android.app.Application;
import g7.y5;
import hd.c0;
import qc.c;
import rc.a;
import sc.i;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zzdy extends i implements p {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdy(Application application, String str, c cVar) {
        super(2, cVar);
        this.zzb = application;
        this.zzc = str;
    }

    @Override // sc.a
    public final c create(Object obj, c cVar) {
        return new zzdy(this.zzb, this.zzc, cVar);
    }

    @Override // zc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdy) create((c0) obj, (c) obj2)).invokeSuspend(oc.i.a);
    }

    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i9 = this.zza;
        y5.b(obj);
        if (i9 != 0) {
            return obj;
        }
        Application application = this.zzb;
        String str = this.zzc;
        this.zza = 1;
        Object zzd = zzdz.zzd(application, str, this);
        return zzd == aVar ? aVar : zzd;
    }
}
