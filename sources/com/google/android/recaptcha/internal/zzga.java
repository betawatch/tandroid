package com.google.android.recaptcha.internal;

import bd.p;
import i7.c7;
import jd.e0;
import jd.t;
import kotlin.jvm.internal.j;
import sc.c;
import uc.i;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    @Override // uc.a
    public final c create(Object obj, c cVar) {
        zzga zzgaVar = new zzga(this.zza, this.zzb, cVar);
        zzgaVar.zzc = obj;
        return zzgaVar;
    }

    @Override // bd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzga) create((zzhk) obj, (c) obj2)).invokeSuspend(qc.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0041, code lost:
    
        if (com.google.android.recaptcha.internal.zzgb.zzo(r1, r9) == false) goto L13;
     */
    @Override // uc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzds zzdsVar;
        zzdt zzdtVar;
        zzdr zzdrVar;
        zzdt zzdtVar2;
        zzcg zzcgVar;
        tc.a aVar = tc.a.a;
        c7.b(obj);
        zzhk zzhkVar = (zzhk) this.zzc;
        zzgb zzgbVar = this.zza;
        zzdv zze = zzgbVar.zze();
        zzdsVar = zzdv.zzb;
        boolean a2 = j.a(zze, zzdsVar);
        qc.i iVar = qc.i.a;
        if (!a2) {
            zzdv zze2 = zzgbVar.zze();
            zzdtVar = zzdv.zzc;
            if (!j.a(zze2, zzdtVar)) {
                zzdv zze3 = zzgbVar.zze();
                zzdrVar = zzdv.zzd;
                if (j.a(zze3, zzdrVar)) {
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
