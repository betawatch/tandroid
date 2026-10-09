package com.google.android.recaptcha.internal;

import ae.g0;
import ae.t;
import hd.i;
import jd.c;
import kd.a;
import ld.j;
import sd.p;
import v7.a8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
final class zzga extends j implements p {
    final /* synthetic */ zzgb zza;
    final /* synthetic */ long zzb;
    private /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzga(zzgb zzgbVar, long j3, c cVar) {
        super(2, cVar);
        this.zza = zzgbVar;
        this.zzb = j3;
    }

    @Override // ld.a
    public final c create(Object obj, c cVar) {
        zzga zzgaVar = new zzga(this.zza, this.zzb, cVar);
        zzgaVar.zzc = obj;
        return zzgaVar;
    }

    @Override // sd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzga) create((zzhk) obj, (c) obj2)).invokeSuspend(i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0041, code lost:
    
        if (com.google.android.recaptcha.internal.zzgb.zzo(r1, r9) == false) goto L13;
     */
    @Override // ld.a
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
        a8.b(obj);
        zzhk zzhkVar = (zzhk) this.zzc;
        zzgb zzgbVar = this.zza;
        zzdv zze = zzgbVar.zze();
        zzdsVar = zzdv.zzb;
        boolean a2 = kotlin.jvm.internal.i.a(zze, zzdsVar);
        i iVar = i.a;
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
                t a10 = g0.a();
                zzgbVar.zzb = a10;
                g0.q(zzgb.zzd(zzgbVar).zza(), new zzfz(zzgbVar, a10, zzhkVar, this.zzb, null));
            }
        }
        return iVar;
    }
}
