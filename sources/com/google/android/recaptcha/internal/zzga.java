package com.google.android.recaptcha.internal;

import b8.ib;
import dd.k;
import fd.c;
import hd.j;
import od.p;
import wd.b0;
import wd.t;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
final class zzga extends j implements p {
    final /* synthetic */ zzgb zza;
    final /* synthetic */ long zzb;
    private /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzga(zzgb zzgbVar, long j10, c cVar) {
        super(2, cVar);
        this.zza = zzgbVar;
        this.zzb = j10;
    }

    @Override // hd.a
    public final c create(Object obj, c cVar) {
        zzga zzgaVar = new zzga(this.zza, this.zzb, cVar);
        zzgaVar.zzc = obj;
        return zzgaVar;
    }

    @Override // od.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzga) create((zzhk) obj, (c) obj2)).invokeSuspend(k.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0041, code lost:
    
        if (com.google.android.recaptcha.internal.zzgb.zzo(r1, r9) == false) goto L13;
     */
    @Override // hd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzds zzdsVar;
        zzdt zzdtVar;
        zzdr zzdrVar;
        zzdt zzdtVar2;
        zzcg zzcgVar;
        gd.a aVar = gd.a.a;
        ib.b(obj);
        zzhk zzhkVar = (zzhk) this.zzc;
        zzgb zzgbVar = this.zza;
        zzdv zze = zzgbVar.zze();
        zzdsVar = zzdv.zzb;
        boolean a10 = kotlin.jvm.internal.j.a(zze, zzdsVar);
        k kVar = k.a;
        if (!a10) {
            zzdv zze2 = zzgbVar.zze();
            zzdtVar = zzdv.zzc;
            if (!kotlin.jvm.internal.j.a(zze2, zzdtVar)) {
                zzdv zze3 = zzgbVar.zze();
                zzdrVar = zzdv.zzd;
                if (kotlin.jvm.internal.j.a(zze3, zzdrVar)) {
                    zzcgVar = zzgbVar.zzd;
                }
                zzdtVar2 = zzdv.zzc;
                zzgbVar.zzf = zzdtVar2;
                t a11 = b0.a();
                zzgbVar.zzb = a11;
                b0.q(zzgb.zzd(zzgbVar).zza(), new zzfz(zzgbVar, a11, zzhkVar, this.zzb, null));
            }
        }
        return kVar;
    }
}
