package com.google.android.recaptcha.internal;

import dd.p;
import k7.p7;
import k7.s7;
import uc.c;
import vc.a;
import wc.i;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
final class zzaa extends i implements p {
    final /* synthetic */ zzad zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaa(zzad zzadVar, c cVar) {
        super(2, cVar);
        this.zza = zzadVar;
    }

    @Override // wc.a
    public final c create(Object obj, c cVar) {
        return new zzaa(this.zza, cVar);
    }

    @Override // dd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaa) create((zzhk) obj, (c) obj2)).invokeSuspend(sc.i.a);
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.a;
        p7.b(obj);
        zzad zzadVar = this.zza;
        String zza = zzad.zzb(zzadVar).zza();
        zzyu zzf = zzyx.zzf();
        zzyv zzf2 = zzyw.zzf();
        zzf2.zzw(zza);
        zzf.zze(s7.a(zzf2.zzk()));
        return zzas.zzb(zzadVar, (zzyx) zzf.zzk());
    }
}
