package com.google.android.recaptcha.internal;

import a8.jd;
import ce.f0;
import ce.t;
import ld.c;
import md.a;
import nd.i;
import ud.p;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
final class zzga extends i implements p {
    final /* synthetic */ zzgb zza;
    final /* synthetic */ long zzb;
    private /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzga(zzgb zzgbVar, long j10, c cVar) {
        super(2, cVar);
        this.zza = zzgbVar;
        this.zzb = j10;
    }

    @Override // nd.a
    public final c create(Object obj, c cVar) {
        zzga zzgaVar = new zzga(this.zza, this.zzb, cVar);
        zzgaVar.zzc = obj;
        return zzgaVar;
    }

    @Override // ud.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzga) create((zzhk) obj, (c) obj2)).invokeSuspend(jd.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0041, code lost:
    
        if (com.google.android.recaptcha.internal.zzgb.zzo(r1, r9) == false) goto L13;
     */
    @Override // nd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzds zzdsVar;
        zzdt zzdtVar;
        zzdr zzdrVar;
        zzdt zzdtVar2;
        zzcg zzcgVar;
        a aVar = a.a;
        jd.b(obj);
        zzhk zzhkVar = (zzhk) this.zzc;
        zzgb zzgbVar = this.zza;
        zzdv zze = zzgbVar.zze();
        zzdsVar = zzdv.zzb;
        boolean a2 = kotlin.jvm.internal.i.a(zze, zzdsVar);
        jd.i iVar = jd.i.a;
        if (!a2) {
            zzdv zze2 = zzgbVar.zze();
            zzdtVar = zzdv.zzc;
            if (!kotlin.jvm.internal.i.a(zze2, zzdtVar)) {
                zzdv zze3 = zzgbVar.zze();
                zzdrVar = zzdv.zzd;
                if (kotlin.jvm.internal.i.a(zze3, zzdrVar)) {
                    zzcgVar = zzgbVar.zzd;
                }
                zzdtVar2 = zzdv.zzc;
                zzgbVar.zzf = zzdtVar2;
                t a10 = f0.a();
                zzgbVar.zzb = a10;
                f0.q(zzgb.zzd(zzgbVar).zza(), new zzfz(zzgbVar, a10, zzhkVar, this.zzb, null));
            }
        }
        return iVar;
    }
}
