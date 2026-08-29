package com.google.android.recaptcha.internal;

import bd.p;
import i7.c7;
import jd.e0;
import sc.c;
import sc.h;
import uc.i;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    @Override // uc.a
    public final c create(Object obj, c cVar) {
        zzex zzexVar = new zzex(this.zzb, this.zzc, this.zzd, cVar);
        zzexVar.zze = obj;
        return zzexVar;
    }

    @Override // bd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzex) create((zzgr) obj, (c) obj2)).invokeSuspend(qc.i.a);
    }

    @Override // uc.a
    public final Object invokeSuspend(Object obj) {
        tc.a aVar = tc.a.a;
        int i10 = this.zza;
        c7.b(obj);
        if (i10 != 0) {
            return obj;
        }
        zzgr zzgrVar = (zzgr) this.zze;
        zzfp zzfpVar = this.zzb;
        h c3 = zzfp.zzf(zzfpVar).zza().c();
        zzew zzewVar = new zzew(this.zzc, zzfpVar, zzgrVar, this.zzd, null);
        this.zza = 1;
        Object w10 = e0.w(c3, zzewVar, this);
        return w10 == aVar ? aVar : w10;
    }
}
