package com.google.android.recaptcha.internal;

import af.b;
import gd.g;
import gd.k;
import id.c;
import java.util.Map;
import kd.j;
import rd.p;
import zd.b0;
import zd.s;
import zd.t;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
final class zzlk extends j implements p {
    int zza;
    final /* synthetic */ zzly zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlk(zzly zzlyVar, String str, c cVar) {
        super(2, cVar);
        this.zzb = zzlyVar;
        this.zzc = str;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        zzlk zzlkVar = new zzlk(this.zzb, this.zzc, cVar);
        zzlkVar.zzd = obj;
        return zzlkVar;
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlk) create((zzhk) obj, (c) obj2)).invokeSuspend(k.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c6, code lost:
    
        if (((zd.t) r2).i(r16) == r0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b4, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhg) r5).zza(r2, r16) != r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a8, code lost:
    
        if (r5 != r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0094, code lost:
    
        if (r6 != r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0062, code lost:
    
        if (r7 != r0) goto L20;
     */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Map map;
        Object b10;
        zzhk zzhkVar;
        Object zza;
        Object zza2;
        Object zzu;
        Map map2;
        zzcr zzD;
        Object i7;
        jd.a aVar = jd.a.a;
        int i10 = this.zza;
        try {
        } catch (Exception e10) {
            zzcg zza3 = zzh.zza(e10, new zzcg(zzce.zzb, zzcd.zzW, e10.getMessage(), null, 8, null));
            zzly zzlyVar = this.zzb;
            String str = this.zzc;
            map = zzlyVar.zzd;
            s sVar = (s) map.remove(str);
            if (sVar != null) {
                ((t) sVar).Q(zza3);
            }
            b10 = b.b(zza3);
        }
        if (i10 == 0) {
            b.c(obj);
            zzhkVar = (zzhk) this.zzd;
            zzdj zzn = this.zzb.zzn();
            zzmc zzmcVar = zzmc.zzd;
            this.zzd = zzhkVar;
            this.zza = 1;
            zza = zzn.zza(zzmcVar, this);
        } else if (i10 == 1) {
            zzhkVar = (zzhk) this.zzd;
            b.c(obj);
            zza = obj;
        } else if (i10 == 2) {
            zzhkVar = (zzhk) this.zzd;
            b.c(obj);
            zza2 = obj;
            if (!((Boolean) zza2).booleanValue()) {
                zzly zzlyVar2 = this.zzb;
                this.zzd = zzhkVar;
                this.zza = 3;
                zzu = zzly.zzu(zzlyVar2, this);
            }
            s zzz = this.zzb.zzz();
            this.zzd = null;
            this.zza = 5;
        } else if (i10 == 3) {
            zzhkVar = (zzhk) this.zzd;
            b.c(obj);
            zzu = obj;
            this.zzd = null;
            this.zza = 4;
        } else {
            if (i10 != 4) {
                if (i10 != 5) {
                    b.c(obj);
                    i7 = obj;
                    zzxx zzxxVar = (zzxx) i7;
                    zzxw zzf = zzxx.zzf();
                    zzf.zze(this.zzc);
                    zzya zzf2 = zzyb.zzf();
                    zzf2.zze(zzxxVar.zzl());
                    zzf.zzr(zzf2);
                    zzxy zzf3 = zzxz.zzf();
                    zzf3.zze(zzxxVar.zzj());
                    zzf3.zzf(zzxxVar.zzM());
                    zzf.zzs(zzf3);
                    b10 = zzf.zzk();
                    return new g(b10);
                }
                b.c(obj);
                t a10 = b0.a();
                zzly zzlyVar3 = this.zzb;
                map2 = zzlyVar3.zzd;
                String str2 = this.zzc;
                map2.put(str2, a10);
                zzze zzf4 = zzzf.zzf();
                zzf4.zze(str2);
                byte[] zzd = ((zzzf) zzf4.zzk()).zzd();
                String zzi = zzpp.zzh().zzi(zzd, 0, zzd.length);
                zzD = zzlyVar3.zzD();
                b0.q(zzD.zzb(), new zzlj(zzlyVar3, zzi, null));
                this.zza = 6;
                i7 = a10.i(this);
                if (i7 == aVar) {
                    return aVar;
                }
                zzxx zzxxVar2 = (zzxx) i7;
                zzxw zzf5 = zzxx.zzf();
                zzf5.zze(this.zzc);
                zzya zzf22 = zzyb.zzf();
                zzf22.zze(zzxxVar2.zzl());
                zzf5.zzr(zzf22);
                zzxy zzf32 = zzxz.zzf();
                zzf32.zze(zzxxVar2.zzj());
                zzf32.zzf(zzxxVar2.zzM());
                zzf5.zzs(zzf32);
                b10 = zzf5.zzk();
                return new g(b10);
            }
            b.c(obj);
            s zzz2 = this.zzb.zzz();
            this.zzd = null;
            this.zza = 5;
        }
        if (((Boolean) zza).booleanValue()) {
            return new g(b.b(new zzcg(zzce.zzb, zzcd.zzay, null, null, 12, null)));
        }
        zzdj zzn2 = this.zzb.zzn();
        zzmc zzmcVar2 = zzmc.zzc;
        this.zzd = zzhkVar;
        this.zza = 2;
        zza2 = zzn2.zza(zzmcVar2, this);
    }
}
