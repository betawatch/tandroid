package com.google.android.recaptcha.internal;

import java.util.Map;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
final class zzlk extends ccb implements eq4 {
    int zza;
    final /* synthetic */ zzly zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlk(zzly zzlyVar, String str, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzb = zzlyVar;
        this.zzc = str;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        zzlk zzlkVar = new zzlk(this.zzb, this.zzc, fw2Var);
        zzlkVar.zzd = obj;
        return zzlkVar;
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlk) create((zzhk) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0107, code lost:
    
        if (r0 != r8) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0171, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c4, code lost:
    
        if (((cp2) r0).h(r16) == r8) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b2, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhg) r4).zza(r0, r16) != r8) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
    
        if (r4 != r8) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0092, code lost:
    
        if (r5 != r8) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005f, code lost:
    
        if (r6 != r8) goto L18;
     */
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Map map;
        Object a;
        zzhk zzhkVar;
        Object zza;
        Object zza2;
        Object zzu;
        Map map2;
        zzcr zzD;
        Object h;
        int i = this.zza;
        bx2 bx2Var = bx2.a;
        try {
        } catch (Exception e) {
            zzcg zza3 = zzh.zza(e, new zzcg(zzce.zzb, zzcd.zzW, e.getMessage(), null, 8, null));
            zzly zzlyVar = this.zzb;
            String str = this.zzc;
            map = zzlyVar.zzd;
            bp2 bp2Var = (bp2) map.remove(str);
            if (bp2Var != null) {
                ((cp2) bp2Var).P(zza3);
            }
            a = qse.a(zza3);
        }
        if (i == 0) {
            qse.b(obj);
            zzhkVar = (zzhk) this.zzd;
            zzdj zzn = this.zzb.zzn();
            zzmc zzmcVar = zzmc.zzd;
            this.zzd = zzhkVar;
            this.zza = 1;
            zza = zzn.zza(zzmcVar, this);
        } else if (i == 1) {
            zzhkVar = (zzhk) this.zzd;
            qse.b(obj);
            zza = obj;
        } else if (i == 2) {
            zzhkVar = (zzhk) this.zzd;
            qse.b(obj);
            zza2 = obj;
            if (!((Boolean) zza2).booleanValue()) {
                zzly zzlyVar2 = this.zzb;
                this.zzd = zzhkVar;
                this.zza = 3;
                zzu = zzly.zzu(zzlyVar2, this);
            }
            bp2 zzz = this.zzb.zzz();
            this.zzd = null;
            this.zza = 5;
        } else if (i == 3) {
            zzhkVar = (zzhk) this.zzd;
            qse.b(obj);
            zzu = obj;
            this.zzd = null;
            this.zza = 4;
        } else if (i == 4) {
            qse.b(obj);
            bp2 zzz2 = this.zzb.zzz();
            this.zzd = null;
            this.zza = 5;
        } else {
            if (i != 5) {
                qse.b(obj);
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
                a = zzf.zzk();
                return new ta9(a);
            }
            qse.b(obj);
            cp2 a2 = hsd.a();
            zzly zzlyVar3 = this.zzb;
            map2 = zzlyVar3.zzd;
            String str2 = this.zzc;
            map2.put(str2, a2);
            zzze zzf4 = zzzf.zzf();
            zzf4.zze(str2);
            byte[] zzd = ((zzzf) zzf4.zzk()).zzd();
            String zzi = zzpp.zzh().zzi(zzd, 0, zzd.length);
            zzD = zzlyVar3.zzD();
            ppd.b(zzD.zzb(), new zzlj(zzlyVar3, zzi, null));
            this.zza = 6;
            h = a2.h(this);
        }
        if (((Boolean) zza).booleanValue()) {
            return new ta9(new sa9(new zzcg(zzce.zzb, zzcd.zzay, null, null, 12, null)));
        }
        zzdj zzn2 = this.zzb.zzn();
        zzmc zzmcVar2 = zzmc.zzc;
        this.zzd = zzhkVar;
        this.zza = 2;
        zza2 = zzn2.zza(zzmcVar2, this);
    }
}
