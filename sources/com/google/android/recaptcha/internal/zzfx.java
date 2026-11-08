package com.google.android.recaptcha.internal;

import af.b;
import gd.k;
import id.c;
import kd.j;
import rd.p;
import zd.s;
import zd.t;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
final class zzfx extends j implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzgb zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ s zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfx(zzgb zzgbVar, long j3, s sVar, c cVar) {
        super(2, cVar);
        this.zzc = zzgbVar;
        this.zzd = j3;
        this.zze = sVar;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        zzfx zzfxVar = new zzfx(this.zzc, this.zzd, this.zze, cVar);
        zzfxVar.zzf = obj;
        return zzfxVar;
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfx) create((zzgr) obj, (c) obj2)).invokeSuspend(k.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
    
        if (r9 == r0) goto L36;
     */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        zzfp zzfpVar;
        zzgr zzgrVar2;
        zzgr zzgrVar3;
        zzfp zzfpVar2;
        zzds zzdsVar;
        jd.a aVar = jd.a.a;
        int i7 = this.zzb;
        try {
            if (i7 == 0) {
                b.c(obj);
                zzgrVar = (zzgr) this.zzf;
                zzfpVar = this.zzc.zza;
                long j3 = this.zzd;
                this.zzf = zzgrVar;
                this.zza = zzgrVar;
                this.zzb = 1;
                obj = zzfpVar.zzp(j3, this);
                if (obj == aVar) {
                    return aVar;
                }
                zzgrVar2 = zzgrVar;
            } else if (i7 == 1) {
                zzgrVar = (zzgr) this.zza;
                zzgrVar2 = (zzgr) this.zzf;
                b.c(obj);
            } else {
                if (i7 != 2) {
                    if (i7 != 3) {
                        b.c(obj);
                        zzgb zzgbVar = this.zzc;
                        zzdsVar = zzdv.zzb;
                        zzgbVar.zzf = zzdsVar;
                        return Boolean.valueOf(((t) this.zze).C(k.a));
                    }
                    zzgrVar3 = (zzgr) this.zzf;
                    b.c(obj);
                    this.zzf = null;
                    this.zzb = 4;
                    if (((zzhg) obj).zza(zzgrVar3.zza(), this) == aVar) {
                        return aVar;
                    }
                    zzgb zzgbVar2 = this.zzc;
                    zzdsVar = zzdv.zzb;
                    zzgbVar2.zzf = zzdsVar;
                    return Boolean.valueOf(((t) this.zze).C(k.a));
                }
                zzgrVar3 = (zzgr) this.zzf;
                b.c(obj);
                zzxn zzxnVar = (zzxn) obj;
                zzgb zzgbVar3 = this.zzc;
                zzgbVar3.zze = zzxnVar;
                zzfpVar2 = zzgbVar3.zza;
                long j10 = this.zzd;
                this.zzf = zzgrVar3;
                this.zzb = 3;
                obj = zzfpVar2.zzn(zzxnVar, j10, this);
            }
            this.zzf = zzgrVar2;
            this.zza = null;
            this.zzb = 2;
            obj = ((zzhf) obj).zza(zzgrVar.zza(), this);
            if (obj != aVar) {
                zzgrVar3 = zzgrVar2;
                zzxn zzxnVar2 = (zzxn) obj;
                zzgb zzgbVar32 = this.zzc;
                zzgbVar32.zze = zzxnVar2;
                zzfpVar2 = zzgbVar32.zza;
                long j102 = this.zzd;
                this.zzf = zzgrVar3;
                this.zzb = 3;
                obj = zzfpVar2.zzn(zzxnVar2, j102, this);
            }
            return aVar;
        } catch (zzcg e10) {
            this.zzc.zzd = e10;
            throw e10;
        }
    }
}
