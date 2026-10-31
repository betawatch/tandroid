package com.google.android.recaptcha.internal;

import cd.c;
import cd.h;
import dd.a;
import ed.j;
import l9.b;
import ld.p;
import td.e0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
final class zzex extends j implements p {
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

    @Override // ed.a
    public final c create(Object obj, c cVar) {
        zzex zzexVar = new zzex(this.zzb, this.zzc, this.zzd, cVar);
        zzexVar.zze = obj;
        return zzexVar;
    }

    @Override // ld.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzex) create((zzgr) obj, (c) obj2)).invokeSuspend(ad.j.a);
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        b.b(obj);
        if (i10 != 0) {
            return obj;
        }
        zzgr zzgrVar = (zzgr) this.zze;
        zzfp zzfpVar = this.zzb;
        h c10 = zzfp.zzf(zzfpVar).zza().c();
        zzew zzewVar = new zzew(this.zzc, zzfpVar, zzgrVar, this.zzd, null);
        this.zza = 1;
        Object w9 = e0.w(c10, zzewVar, this);
        return w9 == aVar ? aVar : w9;
    }
}
