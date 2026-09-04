package com.google.android.recaptcha.internal;

import gd.i;
import id.c;
import jd.a;
import kd.j;
import rd.p;
import v7.t7;
import zd.c0;
import zd.s;
import zd.t;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
final class zzfz extends j implements p {
    int zza;
    final /* synthetic */ zzgb zzb;
    final /* synthetic */ s zzc;
    final /* synthetic */ zzhk zzd;
    final /* synthetic */ long zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfz(zzgb zzgbVar, s sVar, zzhk zzhkVar, long j3, c cVar) {
        super(2, cVar);
        this.zzb = zzgbVar;
        this.zzc = sVar;
        this.zzd = zzhkVar;
        this.zze = j3;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        return new zzfz(this.zzb, this.zzc, this.zzd, this.zze, cVar);
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfz) create((c0) obj, (c) obj2)).invokeSuspend(i.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        zzcg zzcgVar;
        zzfz zzfzVar;
        zzdr zzdrVar;
        zzcg e7;
        zzcx zzcxVar;
        zzfw zzfwVar;
        zzfy zzfyVar;
        a aVar = a.a;
        if (this.zza != 0) {
            try {
                t7.b(obj);
                zzfzVar = this;
            } catch (zzcg e10) {
                zzcgVar = e10;
                zzfzVar = this;
                zzgb zzgbVar = zzfzVar.zzb;
                zzdrVar = zzdv.zzd;
                zzgbVar.zzf = zzdrVar;
                ((t) zzfzVar.zzc).L(zzcgVar);
                return i.a;
            }
        } else {
            t7.b(obj);
            try {
                zzcxVar = zzcx.zza;
                zzgb zzgbVar2 = this.zzb;
                zzfwVar = new zzfw(zzgbVar2);
                zzfyVar = new zzfy(this.zzd, zzgbVar2, this.zze, this.zzc, null);
                this.zza = 1;
                zzfzVar = this;
            } catch (zzcg e11) {
                e7 = e11;
                zzfzVar = this;
                zzcgVar = e7;
                zzgb zzgbVar3 = zzfzVar.zzb;
                zzdrVar = zzdv.zzd;
                zzgbVar3.zzf = zzdrVar;
                ((t) zzfzVar.zzc).L(zzcgVar);
                return i.a;
            }
            try {
                obj = zzcxVar.zzb(zzfwVar, 100L, 1000L, 2.0d, zzfyVar, zzfzVar);
                if (obj == aVar) {
                    return aVar;
                }
            } catch (zzcg e12) {
                e7 = e12;
                zzcgVar = e7;
                zzgb zzgbVar32 = zzfzVar.zzb;
                zzdrVar = zzdv.zzd;
                zzgbVar32.zzf = zzdrVar;
                ((t) zzfzVar.zzc).L(zzcgVar);
                return i.a;
            }
        }
        ((Boolean) obj).getClass();
        return i.a;
    }
}
