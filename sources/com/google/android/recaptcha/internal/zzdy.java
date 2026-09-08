package com.google.android.recaptcha.internal;

import android.app.Application;
import gd.i;
import id.c;
import jd.a;
import kd.j;
import rd.p;
import v7.t7;
import zd.c0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
final class zzdy extends j implements p {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdy(Application application, String str, c cVar) {
        super(2, cVar);
        this.zzb = application;
        this.zzc = str;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzdy(this.zzb, this.zzc, cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdy) create((c0) obj, (c) obj2)).invokeSuspend(i.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        t7.b(obj);
        if (i10 != 0) {
            return obj;
        }
        Application application = this.zzb;
        String str = this.zzc;
        this.zza = 1;
        Object zzd = zzdz.zzd(application, str, this);
        return zzd == aVar ? aVar : zzd;
    }
}
