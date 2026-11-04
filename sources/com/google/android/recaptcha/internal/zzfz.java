package com.google.android.recaptcha.internal;

import b8.ib;
import dd.k;
import fd.c;
import hd.j;
import od.p;
import wd.s;
import wd.t;
import wd.z;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
final class zzfz extends j implements p {
    int zza;
    final /* synthetic */ zzgb zzb;
    final /* synthetic */ s zzc;
    final /* synthetic */ zzhk zzd;
    final /* synthetic */ long zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfz(zzgb zzgbVar, s sVar, zzhk zzhkVar, long j10, c cVar) {
        super(2, cVar);
        this.zzb = zzgbVar;
        this.zzc = sVar;
        this.zzd = zzhkVar;
        this.zze = j10;
    }

    @Override // hd.a
    public final c create(Object obj, c cVar) {
        return new zzfz(this.zzb, this.zzc, this.zzd, this.zze, cVar);
    }

    @Override // od.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfz) create((z) obj, (c) obj2)).invokeSuspend(k.a);
    }

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        zzcg zzcgVar;
        zzfz zzfzVar;
        zzdr zzdrVar;
        zzcg e10;
        zzcx zzcxVar;
        zzfw zzfwVar;
        zzfy zzfyVar;
        gd.a aVar = gd.a.a;
        if (this.zza != 0) {
            try {
                ib.b(obj);
                zzfzVar = this;
            } catch (zzcg e11) {
                zzcgVar = e11;
                zzfzVar = this;
                zzgb zzgbVar = zzfzVar.zzb;
                zzdrVar = zzdv.zzd;
                zzgbVar.zzf = zzdrVar;
                ((t) zzfzVar.zzc).Q(zzcgVar);
                return k.a;
            }
        } else {
            ib.b(obj);
            try {
                zzcxVar = zzcx.zza;
                zzgb zzgbVar2 = this.zzb;
                zzfwVar = new zzfw(zzgbVar2);
                zzfyVar = new zzfy(this.zzd, zzgbVar2, this.zze, this.zzc, null);
                this.zza = 1;
                zzfzVar = this;
            } catch (zzcg e12) {
                e10 = e12;
                zzfzVar = this;
                zzcgVar = e10;
                zzgb zzgbVar3 = zzfzVar.zzb;
                zzdrVar = zzdv.zzd;
                zzgbVar3.zzf = zzdrVar;
                ((t) zzfzVar.zzc).Q(zzcgVar);
                return k.a;
            }
            try {
                obj = zzcxVar.zzb(zzfwVar, 100L, 1000L, 2.0d, zzfyVar, zzfzVar);
                if (obj == aVar) {
                    return aVar;
                }
            } catch (zzcg e13) {
                e10 = e13;
                zzcgVar = e10;
                zzgb zzgbVar32 = zzfzVar.zzb;
                zzdrVar = zzdv.zzd;
                zzgbVar32.zzf = zzdrVar;
                ((t) zzfzVar.zzc).Q(zzcgVar);
                return k.a;
            }
        }
        ((Boolean) obj).getClass();
        return k.a;
    }
}
