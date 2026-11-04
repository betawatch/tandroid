package com.google.android.recaptcha.internal;

import b8.ib;
import dd.k;
import fd.c;
import hd.j;
import od.p;
import wd.s;
import wd.t;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
final class zzfx extends j implements p {
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

    @Override // hd.a
    public final c create(Object obj, c cVar) {
        zzfx zzfxVar = new zzfx(this.zzc, this.zzd, this.zze, cVar);
        zzfxVar.zzf = obj;
        return zzfxVar;
    }

    @Override // od.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfx) create((zzgr) obj, (c) obj2)).invokeSuspend(k.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
    
        if (r9 == r0) goto L36;
     */
    @Override // hd.a
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
        gd.a aVar = gd.a.a;
        int i3 = this.zzb;
        try {
            if (i3 == 0) {
                ib.b(obj);
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
            } else if (i3 == 1) {
                zzgrVar = (zzgr) this.zza;
                zzgrVar2 = (zzgr) this.zzf;
                ib.b(obj);
            } else {
                if (i3 != 2) {
                    if (i3 != 3) {
                        ib.b(obj);
                        zzgb zzgbVar = this.zzc;
                        zzdsVar = zzdv.zzb;
                        zzgbVar.zzf = zzdsVar;
                        return Boolean.valueOf(((t) this.zze).C(k.a));
                    }
                    zzgrVar3 = (zzgr) this.zzf;
                    ib.b(obj);
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
                ib.b(obj);
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
