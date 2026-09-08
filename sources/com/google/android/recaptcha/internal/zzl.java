package com.google.android.recaptcha.internal;

import gd.i;
import id.c;
import jd.a;
import kd.j;
import rd.p;
import v7.t7;
import zd.e0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
final class zzl extends j implements p {
    int zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzl(zzq zzqVar, String str, long j3, c cVar) {
        super(2, cVar);
        this.zzb = zzqVar;
        this.zzc = str;
        this.zzd = j3;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        zzl zzlVar = new zzl(this.zzb, this.zzc, this.zzd, cVar);
        zzlVar.zze = obj;
        return zzlVar;
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzl) create((zzgr) obj, (c) obj2)).invokeSuspend(i.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        t7.b(obj);
        if (i10 != 0) {
            return obj;
        }
        zzk zzkVar = new zzk(this.zzb, this.zzc, (zzgr) this.zze, this.zzd, null);
        this.zza = 1;
        Object f7 = e0.f(zzkVar, this);
        return f7 == aVar ? aVar : f7;
    }
}
