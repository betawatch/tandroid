package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class zzfq extends yfb implements is4 {
    Object zza;
    double zzb;
    int zzc;
    final /* synthetic */ zzgb zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ String zzf;
    final /* synthetic */ RecaptchaAction zzg;
    private /* synthetic */ Object zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfq(zzgb zzgbVar, long j, String str, RecaptchaAction recaptchaAction, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzd = zzgbVar;
        this.zze = j;
        this.zzf = str;
        this.zzg = recaptchaAction;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        zzfq zzfqVar = new zzfq(this.zzd, this.zze, this.zzf, this.zzg, zw2Var);
        zzfqVar.zzh = obj;
        return zzfqVar;
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfq) create((zzhk) obj, (zw2) obj2)).invokeSuspend(f9c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x011e, code lost:
    
        if (r3 == r2) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0094  */
    @Override // qf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        zzhk zzhkVar2;
        zzhk zzhkVar3;
        zzfp zzfpVar;
        double d;
        zzhk zzhkVar4;
        zzhk zzhkVar5;
        zzfp zzfpVar2;
        zzxn zzxnVar;
        zzfp zzfpVar3;
        zzhk zzhkVar6;
        zzhk zzhkVar7;
        zzyg zzygVar;
        zzfp zzfpVar4;
        Object zzo;
        zzyg zzygVar2;
        int i = this.zzc;
        vx2 vx2Var = vx2.a;
        try {
            switch (i) {
                case 0:
                    ixe.b(obj);
                    zzhkVar = (zzhk) this.zzh;
                    zzgb zzgbVar = this.zzd;
                    long j = this.zze;
                    this.zzh = zzhkVar;
                    this.zza = zzhkVar;
                    this.zzc = 1;
                    obj = new zzhg(new zzfu(zzgbVar, j, null));
                    if (obj != vx2Var) {
                        zzhkVar2 = zzhkVar;
                        this.zzh = zzhkVar2;
                        this.zza = null;
                        this.zzc = 2;
                        obj = ((zzhg) obj).zza(zzhkVar, this);
                        if (obj != vx2Var) {
                            zzhkVar3 = zzhkVar2;
                            double longValue = ((Number) obj).longValue();
                            zzfpVar = this.zzd.zza;
                            String str = this.zzf;
                            double d2 = 0.45d * longValue;
                            this.zzh = zzhkVar3;
                            this.zza = zzhkVar3;
                            d = longValue * 0.55d;
                            this.zzb = d;
                            this.zzc = 3;
                            obj = zzfpVar.zzl(str, (long) d2, this);
                            if (obj != vx2Var) {
                                zzhkVar4 = zzhkVar3;
                                this.zzh = zzhkVar4;
                                this.zza = null;
                                this.zzb = d;
                                this.zzc = 4;
                                obj = ((zzhf) obj).zza(zzhkVar3, this);
                                if (obj != vx2Var) {
                                    zzhkVar5 = zzhkVar4;
                                    zzxx zzxxVar = (zzxx) obj;
                                    zzgb zzgbVar2 = this.zzd;
                                    zzfpVar2 = zzgbVar2.zza;
                                    RecaptchaAction recaptchaAction = this.zzg;
                                    zzxnVar = zzgbVar2.zze;
                                    if (zzxnVar == null) {
                                        zzxnVar = null;
                                    }
                                    zzye zzk = zzfpVar2.zzk(recaptchaAction, zzxxVar, zzxnVar);
                                    zzfpVar3 = zzgbVar2.zza;
                                    this.zzh = zzhkVar5;
                                    this.zza = zzhkVar5;
                                    this.zzc = 5;
                                    obj = zzfpVar3.zzm(zzk, (long) d, this);
                                    if (obj != vx2Var) {
                                        zzhkVar6 = zzhkVar5;
                                        this.zzh = zzhkVar6;
                                        this.zza = null;
                                        this.zzc = 6;
                                        obj = ((zzhf) obj).zza(zzhkVar5, this);
                                        if (obj != vx2Var) {
                                            zzhkVar7 = zzhkVar6;
                                            zzygVar = (zzyg) obj;
                                            zzfpVar4 = this.zzd.zza;
                                            this.zzh = zzygVar;
                                            this.zza = zzhkVar7;
                                            this.zzc = 7;
                                            zzo = zzfpVar4.zzo(zzygVar, this);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return vx2Var;
                case 1:
                    zzhkVar = (zzhk) this.zza;
                    zzhkVar2 = (zzhk) this.zzh;
                    ixe.b(obj);
                    this.zzh = zzhkVar2;
                    this.zza = null;
                    this.zzc = 2;
                    obj = ((zzhg) obj).zza(zzhkVar, this);
                    if (obj != vx2Var) {
                    }
                    return vx2Var;
                case 2:
                    zzhkVar3 = (zzhk) this.zzh;
                    ixe.b(obj);
                    double longValue2 = ((Number) obj).longValue();
                    zzfpVar = this.zzd.zza;
                    String str2 = this.zzf;
                    double d22 = 0.45d * longValue2;
                    this.zzh = zzhkVar3;
                    this.zza = zzhkVar3;
                    d = longValue2 * 0.55d;
                    this.zzb = d;
                    this.zzc = 3;
                    obj = zzfpVar.zzl(str2, (long) d22, this);
                    if (obj != vx2Var) {
                    }
                    return vx2Var;
                case 3:
                    d = this.zzb;
                    zzhkVar3 = (zzhk) this.zza;
                    zzhkVar4 = (zzhk) this.zzh;
                    ixe.b(obj);
                    this.zzh = zzhkVar4;
                    this.zza = null;
                    this.zzb = d;
                    this.zzc = 4;
                    obj = ((zzhf) obj).zza(zzhkVar3, this);
                    if (obj != vx2Var) {
                    }
                    return vx2Var;
                case 4:
                    d = this.zzb;
                    zzhkVar5 = (zzhk) this.zzh;
                    ixe.b(obj);
                    zzxx zzxxVar2 = (zzxx) obj;
                    zzgb zzgbVar22 = this.zzd;
                    zzfpVar2 = zzgbVar22.zza;
                    RecaptchaAction recaptchaAction2 = this.zzg;
                    zzxnVar = zzgbVar22.zze;
                    if (zzxnVar == null) {
                    }
                    zzye zzk2 = zzfpVar2.zzk(recaptchaAction2, zzxxVar2, zzxnVar);
                    zzfpVar3 = zzgbVar22.zza;
                    this.zzh = zzhkVar5;
                    this.zza = zzhkVar5;
                    this.zzc = 5;
                    obj = zzfpVar3.zzm(zzk2, (long) d, this);
                    if (obj != vx2Var) {
                    }
                    return vx2Var;
                case 5:
                    zzhkVar5 = (zzhk) this.zza;
                    zzhkVar6 = (zzhk) this.zzh;
                    ixe.b(obj);
                    this.zzh = zzhkVar6;
                    this.zza = null;
                    this.zzc = 6;
                    obj = ((zzhf) obj).zza(zzhkVar5, this);
                    if (obj != vx2Var) {
                    }
                    return vx2Var;
                case 6:
                    zzhkVar7 = (zzhk) this.zzh;
                    ixe.b(obj);
                    zzygVar = (zzyg) obj;
                    zzfpVar4 = this.zzd.zza;
                    this.zzh = zzygVar;
                    this.zza = zzhkVar7;
                    this.zzc = 7;
                    zzo = zzfpVar4.zzo(zzygVar, this);
                    break;
                case 7:
                    zzhkVar7 = (zzhk) this.zza;
                    zzyg zzygVar3 = (zzyg) this.zzh;
                    ixe.b(obj);
                    zzo = obj;
                    zzygVar = zzygVar3;
                    this.zzh = zzygVar;
                    this.zza = null;
                    this.zzc = 8;
                    if (zzhj.zzb(zzhkVar7, (zzhf) zzo, this) != vx2Var) {
                        zzygVar2 = zzygVar;
                        return zzygVar2.zzj();
                    }
                    return vx2Var;
                default:
                    zzygVar2 = (zzyg) this.zzh;
                    ixe.b(obj);
                    return zzygVar2.zzj();
            }
        } catch (zzcg e) {
            throw e;
        } catch (Exception e2) {
            throw new zzcg(zzce.zzb, zzcd.zzaB, e2.getMessage(), null, 8, null);
        }
    }
}
