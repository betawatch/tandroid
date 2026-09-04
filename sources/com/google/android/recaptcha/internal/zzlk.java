package com.google.android.recaptcha.internal;

import gd.f;
import gd.i;
import id.c;
import java.util.Map;
import jd.a;
import kd.j;
import rd.p;
import v7.t7;
import zd.e0;
import zd.s;
import zd.t;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
        return ((zzlk) create((zzhk) obj, (c) obj2)).invokeSuspend(i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c6, code lost:
    
        if (((zd.t) r2).h(r16) == r0) goto L45;
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
        Object a2;
        zzhk zzhkVar;
        Object zza;
        Object zza2;
        Object zzu;
        Map map2;
        zzcr zzD;
        Object h;
        a aVar = a.a;
        int i10 = this.zza;
        try {
        } catch (Exception e7) {
            zzcg zza3 = zzh.zza(e7, new zzcg(zzce.zzb, zzcd.zzW, e7.getMessage(), null, 8, null));
            zzly zzlyVar = this.zzb;
            String str = this.zzc;
            map = zzlyVar.zzd;
            s sVar = (s) map.remove(str);
            if (sVar != null) {
                ((t) sVar).L(zza3);
            }
            a2 = t7.a(zza3);
        }
        if (i10 == 0) {
            t7.b(obj);
            zzhkVar = (zzhk) this.zzd;
            zzdj zzn = this.zzb.zzn();
            zzmc zzmcVar = zzmc.zzd;
            this.zzd = zzhkVar;
            this.zza = 1;
            zza = zzn.zza(zzmcVar, this);
        } else if (i10 == 1) {
            zzhkVar = (zzhk) this.zzd;
            t7.b(obj);
            zza = obj;
        } else if (i10 == 2) {
            zzhkVar = (zzhk) this.zzd;
            t7.b(obj);
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
            t7.b(obj);
            zzu = obj;
            this.zzd = null;
            this.zza = 4;
        } else {
            if (i10 != 4) {
                if (i10 != 5) {
                    t7.b(obj);
                    h = obj;
                    zzxx zzxxVar = (zzxx) h;
                    zzxw zzf = zzxx.zzf();
                    zzf.zze(this.zzc);
                    zzya zzf2 = zzyb.zzf();
                    zzf2.zze(zzxxVar.zzl());
                    zzf.zzr(zzf2);
                    zzxy zzf3 = zzxz.zzf();
                    zzf3.zze(zzxxVar.zzj());
                    zzf3.zzf(zzxxVar.zzM());
                    zzf.zzs(zzf3);
                    a2 = zzf.zzk();
                    return new f(a2);
                }
                t7.b(obj);
                t a10 = e0.a();
                zzly zzlyVar3 = this.zzb;
                map2 = zzlyVar3.zzd;
                String str2 = this.zzc;
                map2.put(str2, a10);
                zzze zzf4 = zzzf.zzf();
                zzf4.zze(str2);
                byte[] zzd = ((zzzf) zzf4.zzk()).zzd();
                String zzi = zzpp.zzh().zzi(zzd, 0, zzd.length);
                zzD = zzlyVar3.zzD();
                e0.q(zzD.zzb(), new zzlj(zzlyVar3, zzi, null));
                this.zza = 6;
                h = a10.h(this);
                if (h == aVar) {
                    return aVar;
                }
                zzxx zzxxVar2 = (zzxx) h;
                zzxw zzf5 = zzxx.zzf();
                zzf5.zze(this.zzc);
                zzya zzf22 = zzyb.zzf();
                zzf22.zze(zzxxVar2.zzl());
                zzf5.zzr(zzf22);
                zzxy zzf32 = zzxz.zzf();
                zzf32.zze(zzxxVar2.zzj());
                zzf32.zzf(zzxxVar2.zzM());
                zzf5.zzs(zzf32);
                a2 = zzf5.zzk();
                return new f(a2);
            }
            t7.b(obj);
            s zzz2 = this.zzb.zzz();
            this.zzd = null;
            this.zza = 5;
        }
        if (((Boolean) zza).booleanValue()) {
            return new f(t7.a(new zzcg(zzce.zzb, zzcd.zzay, null, null, 12, null)));
        }
        zzdj zzn2 = this.zzb.zzn();
        zzmc zzmcVar2 = zzmc.zzc;
        this.zzd = zzhkVar;
        this.zza = 2;
        zza2 = zzn2.zza(zzmcVar2, this);
    }
}
