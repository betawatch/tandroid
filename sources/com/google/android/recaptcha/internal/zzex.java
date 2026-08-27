package com.google.android.recaptcha.internal;

import ad.p;
import h7.k6;
import id.f0;
import rc.c;
import rc.h;
import tc.i;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
final class zzex extends i implements p {
    int zza;
    final /* synthetic */ zzfp zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzye zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzex(zzfp zzfpVar, long j10, zzye zzyeVar, c cVar) {
        super(2, cVar);
        this.zzb = zzfpVar;
        this.zzc = j10;
        this.zzd = zzyeVar;
    }

    @Override // tc.a
    public final c create(Object obj, c cVar) {
        zzex zzexVar = new zzex(this.zzb, this.zzc, this.zzd, cVar);
        zzexVar.zze = obj;
        return zzexVar;
    }

    @Override // ad.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzex) create((zzgr) obj, (c) obj2)).invokeSuspend(pc.i.a);
    }

    @Override // tc.a
    public final Object invokeSuspend(Object obj) {
        sc.a aVar = sc.a.a;
        int i10 = this.zza;
        k6.b(obj);
        if (i10 != 0) {
            return obj;
        }
        zzgr zzgrVar = (zzgr) this.zze;
        zzfp zzfpVar = this.zzb;
        h c10 = zzfp.zzf(zzfpVar).zza().c();
        zzew zzewVar = new zzew(this.zzc, zzfpVar, zzgrVar, this.zzd, null);
        this.zza = 1;
        Object w10 = f0.w(c10, zzewVar, this);
        return w10 == aVar ? aVar : w10;
    }
}
