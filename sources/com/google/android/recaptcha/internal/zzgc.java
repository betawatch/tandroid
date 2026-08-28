package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import g7.y5;
import qc.c;
import rc.a;
import sc.i;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zzgc extends i implements p {
    Object zza;
    double zzb;
    int zzc;
    final /* synthetic */ zzge zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ String zzf;
    final /* synthetic */ RecaptchaAction zzg;
    private /* synthetic */ Object zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgc(zzge zzgeVar, long j10, String str, RecaptchaAction recaptchaAction, c cVar) {
        super(2, cVar);
        this.zzd = zzgeVar;
        this.zze = j10;
        this.zzf = str;
        this.zzg = recaptchaAction;
    }

    @Override // sc.a
    public final c create(Object obj, c cVar) {
        zzgc zzgcVar = new zzgc(this.zzd, this.zze, this.zzf, this.zzg, cVar);
        zzgcVar.zzh = obj;
        return zzgcVar;
    }

    @Override // zc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgc) create((zzhk) obj, (c) obj2)).invokeSuspend(oc.i.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    @Override // sc.a
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
        double d9;
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
        int i9 = this.zzc;
        try {
            if (i9 == 0) {
                y5.b(obj);
                zzhkVar = (zzhk) this.zzh;
                zzge zzgeVar = this.zzd;
                zzdvVar = zzgeVar.zzb;
                zzdsVar = zzdv.zzb;
                if (!kotlin.jvm.internal.i.a(zzdvVar, zzdsVar)) {
                    throw new zzcg(zzce.zzb, zzcd.zzas, null, null, 12, null);
                }
                double d10 = this.zze;
                zzfpVar = zzgeVar.zza;
                String str = this.zzf;
                double d11 = 0.45d * d10;
                this.zzh = zzhkVar;
                this.zza = zzhkVar;
                double d12 = d10 * 0.55d;
                this.zzb = d12;
                this.zzc = 1;
                zzl = zzfpVar.zzl(str, (long) d11, this);
                if (zzl == aVar) {
                    return aVar;
                }
                d = d12;
                zzhkVar2 = zzhkVar;
            } else if (i9 == 1) {
                d = this.zzb;
                zzhkVar = (zzhk) this.zza;
                zzhk zzhkVar4 = (zzhk) this.zzh;
                y5.b(obj);
                zzhkVar2 = zzhkVar4;
                zzl = obj;
            } else if (i9 == 2) {
                d9 = this.zzb;
                zzhk zzhkVar5 = (zzhk) this.zzh;
                y5.b(obj);
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
                zzm = zzfpVar3.zzm(zzk, (long) d9, this);
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
            } else if (i9 == 3) {
                zzhk zzhkVar6 = (zzhk) this.zza;
                zzhkVar3 = (zzhk) this.zzh;
                y5.b(obj);
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
                if (i9 != 4) {
                    if (i9 != 5) {
                        zzygVar2 = (zzyg) this.zzh;
                        y5.b(obj);
                        return zzygVar2.zzj();
                    }
                    zzhk zzhkVar7 = (zzhk) this.zza;
                    zzyg zzygVar3 = (zzyg) this.zzh;
                    y5.b(obj);
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
                y5.b(obj);
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
            d9 = d;
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
            zzm = zzfpVar3.zzm(zzk2, (long) d9, this);
            if (zzm != aVar) {
            }
        } catch (zzcg e10) {
            throw e10;
        } catch (Exception e11) {
            throw new zzcg(zzce.zzb, zzcd.zzaC, e11.getMessage(), null, 8, null);
        }
    }
}
