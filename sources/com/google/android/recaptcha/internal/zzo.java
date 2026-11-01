package com.google.android.recaptcha.internal;

import cd.c;
import dd.a;
import ed.j;
import l9.b;
import ld.p;
import td.e0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
final class zzo extends j implements p {
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

    @Override // ed.a
    public final c create(Object obj, c cVar) {
        zzo zzoVar = new zzo(this.zzb, this.zzc, this.zzd, cVar);
        zzoVar.zze = obj;
        return zzoVar;
    }

    @Override // ld.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzo) create((zzgr) obj, (c) obj2)).invokeSuspend(ad.j.a);
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        b.b(obj);
        if (i10 == 0) {
            zzn zznVar = new zzn(this.zzb, (zzgr) this.zze, this.zzc, this.zzd, null);
            this.zza = 1;
            if (e0.f(zznVar, this) == aVar) {
                return aVar;
            }
        }
        return ad.j.a;
    }
}
