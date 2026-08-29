package com.google.android.recaptcha.internal;

import bd.p;
import i7.c7;
import jd.e0;
import sc.c;
import uc.i;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
final class zzo extends i implements p {
    int zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzxn zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzo(zzq zzqVar, long j10, zzxn zzxnVar, c cVar) {
        super(2, cVar);
        this.zzb = zzqVar;
        this.zzc = j10;
        this.zzd = zzxnVar;
    }

    @Override // uc.a
    public final c create(Object obj, c cVar) {
        zzo zzoVar = new zzo(this.zzb, this.zzc, this.zzd, cVar);
        zzoVar.zze = obj;
        return zzoVar;
    }

    @Override // bd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzo) create((zzgr) obj, (c) obj2)).invokeSuspend(qc.i.a);
    }

    @Override // uc.a
    public final Object invokeSuspend(Object obj) {
        tc.a aVar = tc.a.a;
        int i10 = this.zza;
        c7.b(obj);
        if (i10 == 0) {
            zzn zznVar = new zzn(this.zzb, (zzgr) this.zze, this.zzc, this.zzd, null);
            this.zza = 1;
            if (e0.f(zznVar, this) == aVar) {
                return aVar;
            }
        }
        return qc.i.a;
    }
}
