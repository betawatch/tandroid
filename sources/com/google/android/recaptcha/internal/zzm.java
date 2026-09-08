package com.google.android.recaptcha.internal;

import gd.f;
import gd.i;
import id.c;
import jd.a;
import kd.j;
import rd.p;
import v7.t7;
import zd.c0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
final class zzm extends j implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzgr zzc;
    final /* synthetic */ zzg zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzxn zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzm(zzgr zzgrVar, zzg zzgVar, long j3, zzxn zzxnVar, c cVar) {
        super(2, cVar);
        this.zzc = zzgrVar;
        this.zzd = zzgVar;
        this.zze = j3;
        this.zzf = zzxnVar;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzm(this.zzc, this.zzd, this.zze, this.zzf, cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzm) create((c0) obj, (c) obj2)).invokeSuspend(i.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        Object a2;
        zzgr zzgrVar;
        a aVar = a.a;
        int i10 = this.zzb;
        try {
        } catch (zzcg e7) {
            a2 = t7.a(e7);
        }
        if (i10 == 0) {
            t7.b(obj);
            zzgrVar = this.zzc;
            zzg zzgVar = this.zzd;
            long j3 = this.zze;
            zzxn zzxnVar = this.zzf;
            this.zza = zzgrVar;
            this.zzb = 1;
            zzhf zzhfVar = new zzhf(zzgVar.zzk(), new zzd(zzgVar, j3, zzxnVar, null), null);
            if (zzhfVar != aVar) {
                obj = zzhfVar;
            }
            return aVar;
        }
        if (i10 != 1) {
            t7.b(obj);
            a2 = i.a;
            return new f(a2);
        }
        zzgrVar = (zzgr) this.zza;
        t7.b(obj);
        this.zza = null;
        this.zzb = 2;
        if (((zzhf) obj).zza(zzgrVar.zza(), this) == aVar) {
            return aVar;
        }
        a2 = i.a;
        return new f(a2);
    }
}
