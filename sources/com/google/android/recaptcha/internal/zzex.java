package com.google.android.recaptcha.internal;

import af.b;
import gd.k;
import id.c;
import id.h;
import kd.j;
import rd.p;
import zd.b0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
final class zzex extends j implements p {
    int zza;
    final /* synthetic */ zzfp zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzye zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzex(zzfp zzfpVar, long j3, zzye zzyeVar, c cVar) {
        super(2, cVar);
        this.zzb = zzfpVar;
        this.zzc = j3;
        this.zzd = zzyeVar;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        zzex zzexVar = new zzex(this.zzb, this.zzc, this.zzd, cVar);
        zzexVar.zze = obj;
        return zzexVar;
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzex) create((zzgr) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.a;
        int i7 = this.zza;
        b.c(obj);
        if (i7 != 0) {
            return obj;
        }
        zzgr zzgrVar = (zzgr) this.zze;
        zzfp zzfpVar = this.zzb;
        h c10 = zzfp.zzf(zzfpVar).zza().c();
        zzew zzewVar = new zzew(this.zzc, zzfpVar, zzgrVar, this.zzd, null);
        this.zza = 1;
        Object y10 = b0.y(c10, zzewVar, this);
        return y10 == aVar ? aVar : y10;
    }
}
