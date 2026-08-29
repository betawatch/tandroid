package com.google.android.recaptcha.internal;

import bd.p;
import i7.c7;
import jd.s;
import jd.t;
import sc.c;
import uc.i;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
final class zzfx extends i implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzgb zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ s zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfx(zzgb zzgbVar, long j10, s sVar, c cVar) {
        super(2, cVar);
        this.zzc = zzgbVar;
        this.zzd = j10;
        this.zze = sVar;
    }

    @Override // uc.a
    public final c create(Object obj, c cVar) {
        zzfx zzfxVar = new zzfx(this.zzc, this.zzd, this.zze, cVar);
        zzfxVar.zzf = obj;
        return zzfxVar;
    }

    @Override // bd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfx) create((zzgr) obj, (c) obj2)).invokeSuspend(qc.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
    
        if (r9 == r0) goto L36;
     */
    @Override // uc.a
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
        tc.a aVar = tc.a.a;
        int i10 = this.zzb;
        try {
            if (i10 == 0) {
                c7.b(obj);
                zzgrVar = (zzgr) this.zzf;
                zzfpVar = this.zzc.zza;
                long j10 = this.zzd;
                this.zzf = zzgrVar;
                this.zza = zzgrVar;
                this.zzb = 1;
                obj = zzfpVar.zzp(j10, this);
                if (obj == aVar) {
                    return aVar;
                }
                zzgrVar2 = zzgrVar;
            } else if (i10 == 1) {
                zzgrVar = (zzgr) this.zza;
                zzgrVar2 = (zzgr) this.zzf;
                c7.b(obj);
            } else {
                if (i10 != 2) {
                    if (i10 != 3) {
                        c7.b(obj);
                        zzgb zzgbVar = this.zzc;
                        zzdsVar = zzdv.zzb;
                        zzgbVar.zzf = zzdsVar;
                        return Boolean.valueOf(((t) this.zze).A(qc.i.a));
                    }
                    zzgrVar3 = (zzgr) this.zzf;
                    c7.b(obj);
                    this.zzf = null;
                    this.zzb = 4;
                    if (((zzhg) obj).zza(zzgrVar3.zza(), this) == aVar) {
                        return aVar;
                    }
                    zzgb zzgbVar2 = this.zzc;
                    zzdsVar = zzdv.zzb;
                    zzgbVar2.zzf = zzdsVar;
                    return Boolean.valueOf(((t) this.zze).A(qc.i.a));
                }
                zzgrVar3 = (zzgr) this.zzf;
                c7.b(obj);
                zzxn zzxnVar = (zzxn) obj;
                zzgb zzgbVar3 = this.zzc;
                zzgbVar3.zze = zzxnVar;
                zzfpVar2 = zzgbVar3.zza;
                long j11 = this.zzd;
                this.zzf = zzgrVar3;
                this.zzb = 3;
                obj = zzfpVar2.zzn(zzxnVar, j11, this);
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
                long j112 = this.zzd;
                this.zzf = zzgrVar3;
                this.zzb = 3;
                obj = zzfpVar2.zzn(zzxnVar2, j112, this);
            }
            return aVar;
        } catch (zzcg e10) {
            this.zzc.zzd = e10;
            throw e10;
        }
    }
}
