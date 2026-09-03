package com.google.android.recaptcha.internal;

import dd.p;
import k7.p7;
import uc.c;
import vc.a;
import wc.i;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
final class zzed extends i implements p {
    int zza;
    final /* synthetic */ zzeh zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzdw zzd;
    final /* synthetic */ zzdq zze;
    final /* synthetic */ long zzf;
    private /* synthetic */ Object zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzed(zzeh zzehVar, String str, zzdw zzdwVar, zzdq zzdqVar, long j10, c cVar) {
        super(2, cVar);
        this.zzb = zzehVar;
        this.zzc = str;
        this.zzd = zzdwVar;
        this.zze = zzdqVar;
        this.zzf = j10;
    }

    @Override // wc.a
    public final c create(Object obj, c cVar) {
        zzed zzedVar = new zzed(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, cVar);
        zzedVar.zzg = obj;
        return zzedVar;
    }

    @Override // dd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzed) create((zzhh) obj, (c) obj2)).invokeSuspend(sc.i.a);
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        int i10 = this.zza;
        p7.b(obj);
        if (i10 != 0) {
            return obj;
        }
        zzhh zzhhVar = (zzhh) this.zzg;
        zzec zzecVar = new zzec(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, zzhhVar, null);
        this.zza = 1;
        Object zza = zzhj.zza(zzhhVar, zzecVar, this);
        return zza == aVar ? aVar : zza;
    }
}
