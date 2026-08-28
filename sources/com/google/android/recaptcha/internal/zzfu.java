package com.google.android.recaptcha.internal;

import g7.y5;
import qc.c;
import rc.a;
import sc.i;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zzfu extends i implements p {
    int zza;
    final /* synthetic */ zzgb zzb;
    final /* synthetic */ long zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfu(zzgb zzgbVar, long j10, c cVar) {
        super(2, cVar);
        this.zzb = zzgbVar;
        this.zzc = j10;
    }

    @Override // sc.a
    public final c create(Object obj, c cVar) {
        zzfu zzfuVar = new zzfu(this.zzb, this.zzc, cVar);
        zzfuVar.zzd = obj;
        return zzfuVar;
    }

    @Override // zc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfu) create((zzhk) obj, (c) obj2)).invokeSuspend(oc.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhg) r13).zza(r1, r12) != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        if (r13 != r0) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006a A[Catch: Exception -> 0x0011, TRY_ENTER, TryCatch #0 {Exception -> 0x0011, blocks: (B:6:0x000d, B:7:0x0055, B:13:0x006a, B:14:0x0078, B:17:0x0042), top: B:2:0x0007 }] */
    @Override // sc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzdr zzdrVar;
        zzcg zzcgVar;
        zzdt zzdtVar;
        zzhk zzhkVar;
        long longValue;
        a aVar = a.a;
        int i9 = this.zza;
        try {
            if (i9 == 0) {
                y5.b(obj);
                zzhkVar = (zzhk) this.zzd;
                zzgb zzgbVar = this.zzb;
                long j10 = this.zzc;
                this.zzd = zzhkVar;
                this.zza = 1;
                obj = zzgbVar.zzq(j10, this);
            } else if (i9 == 1) {
                zzhkVar = (zzhk) this.zzd;
                y5.b(obj);
            } else {
                if (i9 != 2) {
                    y5.b(obj);
                    longValue = this.zzc - ((Number) obj).longValue();
                    if (longValue < 500) {
                        return new Long(longValue);
                    }
                    throw new zzcg(zzce.zzc, zzcd.zzas, null, null, 12, null);
                }
                y5.b(obj);
                zzgb zzgbVar2 = this.zzb;
                zzft zzftVar = new zzft(this.zzc, zzgbVar2, null);
                this.zza = 3;
                obj = zzgbVar2.zzp(zzftVar, this);
                if (obj == aVar) {
                    return aVar;
                }
                longValue = this.zzc - ((Number) obj).longValue();
                if (longValue < 500) {
                }
            }
            this.zzd = null;
            this.zza = 2;
        } catch (Exception e10) {
            zzcg zzcgVar2 = e10 instanceof zzcg ? (zzcg) e10 : null;
            if (zzcgVar2 == null) {
                zzcgVar2 = new zzcg(zzce.zzc, zzcd.zzas, e10.getMessage(), null, 8, null);
            }
            zzgb zzgbVar3 = this.zzb;
            zzdv zze = zzgbVar3.zze();
            zzdrVar = zzdv.zzd;
            if (!kotlin.jvm.internal.i.a(zze, zzdrVar)) {
                zzdv zze2 = zzgbVar3.zze();
                zzdtVar = zzdv.zzc;
                if (!kotlin.jvm.internal.i.a(zze2, zzdtVar)) {
                    throw zzcgVar2;
                }
            }
            zzcgVar = zzgbVar3.zzd;
            if (zzcgVar != null) {
                throw zzcgVar;
            }
            throw zzcgVar2;
        }
    }
}
