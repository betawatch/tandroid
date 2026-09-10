package com.google.android.recaptcha.internal;

import gd.i;
import id.c;
import jd.a;
import kd.j;
import rd.p;
import v7.u7;
import zd.e0;
import zd.t;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        zzga zzgaVar = new zzga(this.zza, this.zzb, cVar);
        zzgaVar.zzc = obj;
        return zzgaVar;
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzga) create((zzhk) obj, (c) obj2)).invokeSuspend(i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0041, code lost:
    
        if (com.google.android.recaptcha.internal.zzgb.zzo(r1, r9) == false) goto L13;
     */
    @Override // kd.a
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
        u7.b(obj);
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
                t a10 = e0.a();
                zzgbVar.zzb = a10;
                e0.q(zzgb.zzd(zzgbVar).zza(), new zzfz(zzgbVar, a10, zzhkVar, this.zzb, null));
            }
        }
        return iVar;
    }
}
