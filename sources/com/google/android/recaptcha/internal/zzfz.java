package com.google.android.recaptcha.internal;

import dd.p;
import k7.p7;
import ld.c0;
import ld.s;
import ld.t;
import uc.c;
import vc.a;
import wc.i;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
final class zzfz extends i implements p {
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

    @Override // wc.a
    public final c create(Object obj, c cVar) {
        return new zzfz(this.zzb, this.zzc, this.zzd, this.zze, cVar);
    }

    @Override // dd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfz) create((c0) obj, (c) obj2)).invokeSuspend(sc.i.a);
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        zzcg zzcgVar;
        zzfz zzfzVar;
        zzdr zzdrVar;
        zzcg e;
        zzcx zzcxVar;
        zzfw zzfwVar;
        zzfy zzfyVar;
        a aVar = a.a;
        if (this.zza != 0) {
            try {
                p7.b(obj);
                zzfzVar = this;
            } catch (zzcg e6) {
                zzcgVar = e6;
                zzfzVar = this;
                zzgb zzgbVar = zzfzVar.zzb;
                zzdrVar = zzdv.zzd;
                zzgbVar.zzf = zzdrVar;
                ((t) zzfzVar.zzc).L(zzcgVar);
                return sc.i.a;
            }
        } else {
            p7.b(obj);
            try {
                zzcxVar = zzcx.zza;
                zzgb zzgbVar2 = this.zzb;
                zzfwVar = new zzfw(zzgbVar2);
                zzfyVar = new zzfy(this.zzd, zzgbVar2, this.zze, this.zzc, null);
                this.zza = 1;
                zzfzVar = this;
            } catch (zzcg e10) {
                e = e10;
                zzfzVar = this;
                zzcgVar = e;
                zzgb zzgbVar3 = zzfzVar.zzb;
                zzdrVar = zzdv.zzd;
                zzgbVar3.zzf = zzdrVar;
                ((t) zzfzVar.zzc).L(zzcgVar);
                return sc.i.a;
            }
            try {
                obj = zzcxVar.zzb(zzfwVar, 100L, 1000L, 2.0d, zzfyVar, zzfzVar);
                if (obj == aVar) {
                    return aVar;
                }
            } catch (zzcg e11) {
                e = e11;
                zzcgVar = e;
                zzgb zzgbVar32 = zzfzVar.zzb;
                zzdrVar = zzdv.zzd;
                zzgbVar32.zzf = zzdrVar;
                ((t) zzfzVar.zzc).L(zzcgVar);
                return sc.i.a;
            }
        }
        ((Boolean) obj).getClass();
        return sc.i.a;
    }
}
