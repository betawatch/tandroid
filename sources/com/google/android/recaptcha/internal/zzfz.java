package com.google.android.recaptcha.internal;

import be.c0;
import be.s;
import be.t;
import kd.c;
import ld.a;
import md.i;
import td.p;
import v7.i8;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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

    @Override // md.a
    public final c create(Object obj, c cVar) {
        return new zzfz(this.zzb, this.zzc, this.zzd, this.zze, cVar);
    }

    @Override // td.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfz) create((c0) obj, (c) obj2)).invokeSuspend(id.i.a);
    }

    @Override // md.a
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
                i8.b(obj);
                zzfzVar = this;
            } catch (zzcg e7) {
                zzcgVar = e7;
                zzfzVar = this;
                zzgb zzgbVar = zzfzVar.zzb;
                zzdrVar = zzdv.zzd;
                zzgbVar.zzf = zzdrVar;
                ((t) zzfzVar.zzc).L(zzcgVar);
                return id.i.a;
            }
        } else {
            i8.b(obj);
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
                return id.i.a;
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
                return id.i.a;
            }
        }
        ((Boolean) obj).getClass();
        return id.i.a;
    }
}
