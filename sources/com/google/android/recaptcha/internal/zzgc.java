package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import gd.i;
import id.c;
import jd.a;
import kd.j;
import rd.p;
import v7.u7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
final class zzgc extends j implements p {
    Object zza;
    double zzb;
    int zzc;
    final /* synthetic */ zzge zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ String zzf;
    final /* synthetic */ RecaptchaAction zzg;
    private /* synthetic */ Object zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgc(zzge zzgeVar, long j3, String str, RecaptchaAction recaptchaAction, c cVar) {
        super(2, cVar);
        this.zzd = zzgeVar;
        this.zze = j3;
        this.zzf = str;
        this.zzg = recaptchaAction;
    }

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        zzgc zzgcVar = new zzgc(this.zzd, this.zze, this.zzf, this.zzg, cVar);
        zzgcVar.zzh = obj;
        return zzgcVar;
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgc) create((zzhk) obj, (c) obj2)).invokeSuspend(i.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        zzdv zzdvVar;
        zzds zzdsVar;
        zzfp zzfpVar;
        Object zzl;
        double d;
        zzhk zzhkVar2;
        Object zza;
        double d10;
        zzfp zzfpVar2;
        zzxn zzxnVar;
        zzfp zzfpVar3;
        Object zzm;
        zzhk zzhkVar3;
        Object zza2;
        zzyg zzygVar;
        zzfp zzfpVar4;
        Object zzo;
        zzyg zzygVar2;
        a aVar = a.a;
        int i10 = this.zzc;
        try {
            if (i10 == 0) {
                u7.b(obj);
                zzhkVar = (zzhk) this.zzh;
                zzge zzgeVar = this.zzd;
                zzdvVar = zzgeVar.zzb;
                zzdsVar = zzdv.zzb;
                if (!kotlin.jvm.internal.i.a(zzdvVar, zzdsVar)) {
                    throw new zzcg(zzce.zzb, zzcd.zzas, null, null, 12, null);
                }
                double d11 = this.zze;
                zzfpVar = zzgeVar.zza;
                String str = this.zzf;
                double d12 = 0.45d * d11;
                this.zzh = zzhkVar;
                this.zza = zzhkVar;
                double d13 = d11 * 0.55d;
                this.zzb = d13;
                this.zzc = 1;
                zzl = zzfpVar.zzl(str, (long) d12, this);
                if (zzl == aVar) {
                    return aVar;
                }
                d = d13;
                zzhkVar2 = zzhkVar;
            } else if (i10 == 1) {
                d = this.zzb;
                zzhkVar = (zzhk) this.zza;
                zzhk zzhkVar4 = (zzhk) this.zzh;
                u7.b(obj);
                zzhkVar2 = zzhkVar4;
                zzl = obj;
            } else if (i10 == 2) {
                d10 = this.zzb;
                zzhk zzhkVar5 = (zzhk) this.zzh;
                u7.b(obj);
                zzhkVar2 = zzhkVar5;
                zza = obj;
                zzxx zzxxVar = (zzxx) zza;
                zzge zzgeVar2 = this.zzd;
                zzfpVar2 = zzgeVar2.zza;
                RecaptchaAction recaptchaAction = this.zzg;
                zzxnVar = zzgeVar2.zzc;
                if (zzxnVar == null) {
                    zzxnVar = null;
                }
                zzye zzk = zzfpVar2.zzk(recaptchaAction, zzxxVar, zzxnVar);
                zzfpVar3 = zzgeVar2.zza;
                this.zzh = zzhkVar2;
                this.zza = zzhkVar2;
                this.zzc = 3;
                zzm = zzfpVar3.zzm(zzk, (long) d10, this);
                if (zzm != aVar) {
                    return aVar;
                }
                zzhkVar3 = zzhkVar2;
                this.zzh = zzhkVar3;
                this.zza = null;
                this.zzc = 4;
                zza2 = ((zzhf) zzm).zza(zzhkVar2, this);
                if (zza2 == aVar) {
                }
                zzygVar = (zzyg) zza2;
                zzfpVar4 = this.zzd.zza;
                this.zzh = zzygVar;
                this.zza = zzhkVar3;
                this.zzc = 5;
                zzo = zzfpVar4.zzo(zzygVar, this);
                if (zzo == aVar) {
                }
                this.zzh = zzygVar;
                this.zza = null;
                this.zzc = 6;
                if (zzhj.zzb(zzhkVar3, (zzhf) zzo, this) != aVar) {
                }
            } else if (i10 == 3) {
                zzhk zzhkVar6 = (zzhk) this.zza;
                zzhkVar3 = (zzhk) this.zzh;
                u7.b(obj);
                zzhkVar2 = zzhkVar6;
                zzm = obj;
                this.zzh = zzhkVar3;
                this.zza = null;
                this.zzc = 4;
                zza2 = ((zzhf) zzm).zza(zzhkVar2, this);
                if (zza2 == aVar) {
                    return aVar;
                }
                zzygVar = (zzyg) zza2;
                zzfpVar4 = this.zzd.zza;
                this.zzh = zzygVar;
                this.zza = zzhkVar3;
                this.zzc = 5;
                zzo = zzfpVar4.zzo(zzygVar, this);
                if (zzo == aVar) {
                }
                this.zzh = zzygVar;
                this.zza = null;
                this.zzc = 6;
                if (zzhj.zzb(zzhkVar3, (zzhf) zzo, this) != aVar) {
                }
            } else {
                if (i10 != 4) {
                    if (i10 != 5) {
                        zzygVar2 = (zzyg) this.zzh;
                        u7.b(obj);
                        return zzygVar2.zzj();
                    }
                    zzhk zzhkVar7 = (zzhk) this.zza;
                    zzyg zzygVar3 = (zzyg) this.zzh;
                    u7.b(obj);
                    zzhkVar3 = zzhkVar7;
                    zzygVar = zzygVar3;
                    zzo = obj;
                    this.zzh = zzygVar;
                    this.zza = null;
                    this.zzc = 6;
                    if (zzhj.zzb(zzhkVar3, (zzhf) zzo, this) != aVar) {
                        return aVar;
                    }
                    zzygVar2 = zzygVar;
                    return zzygVar2.zzj();
                }
                zzhk zzhkVar8 = (zzhk) this.zzh;
                u7.b(obj);
                zzhkVar3 = zzhkVar8;
                zza2 = obj;
                zzygVar = (zzyg) zza2;
                zzfpVar4 = this.zzd.zza;
                this.zzh = zzygVar;
                this.zza = zzhkVar3;
                this.zzc = 5;
                zzo = zzfpVar4.zzo(zzygVar, this);
                if (zzo == aVar) {
                    return aVar;
                }
                this.zzh = zzygVar;
                this.zza = null;
                this.zzc = 6;
                if (zzhj.zzb(zzhkVar3, (zzhf) zzo, this) != aVar) {
                }
            }
            this.zzh = zzhkVar2;
            this.zza = null;
            this.zzb = d;
            this.zzc = 2;
            zza = ((zzhf) zzl).zza(zzhkVar, this);
            if (zza == aVar) {
                return aVar;
            }
            d10 = d;
            zzxx zzxxVar2 = (zzxx) zza;
            zzge zzgeVar22 = this.zzd;
            zzfpVar2 = zzgeVar22.zza;
            RecaptchaAction recaptchaAction2 = this.zzg;
            zzxnVar = zzgeVar22.zzc;
            if (zzxnVar == null) {
            }
            zzye zzk2 = zzfpVar2.zzk(recaptchaAction2, zzxxVar2, zzxnVar);
            zzfpVar3 = zzgeVar22.zza;
            this.zzh = zzhkVar2;
            this.zza = zzhkVar2;
            this.zzc = 3;
            zzm = zzfpVar3.zzm(zzk2, (long) d10, this);
            if (zzm != aVar) {
            }
        } catch (zzcg e) {
            throw e;
        } catch (Exception e7) {
            throw new zzcg(zzce.zzb, zzcd.zzaC, e7.getMessage(), null, 8, null);
        }
    }
}
