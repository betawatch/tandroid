package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import g7.y5;
import qc.c;
import rc.a;
import sc.i;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zzfq extends i implements p {
    Object zza;
    double zzb;
    int zzc;
    final /* synthetic */ zzgb zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ String zzf;
    final /* synthetic */ RecaptchaAction zzg;
    private /* synthetic */ Object zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfq(zzgb zzgbVar, long j10, String str, RecaptchaAction recaptchaAction, c cVar) {
        super(2, cVar);
        this.zzd = zzgbVar;
        this.zze = j10;
        this.zzf = str;
        this.zzg = recaptchaAction;
    }

    @Override // sc.a
    public final c create(Object obj, c cVar) {
        zzfq zzfqVar = new zzfq(this.zzd, this.zze, this.zzf, this.zzg, cVar);
        zzfqVar.zzh = obj;
        return zzfqVar;
    }

    @Override // zc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfq) create((zzhk) obj, (c) obj2)).invokeSuspend(oc.i.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0099  */
    @Override // sc.a
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
        zzfp zzfpVar4;
        Object zzo;
        zzyg zzygVar;
        zzyg zzygVar2;
        a aVar = a.a;
        try {
            switch (this.zzc) {
                case 0:
                    y5.b(obj);
                    zzhkVar = (zzhk) this.zzh;
                    zzgb zzgbVar = this.zzd;
                    long j10 = this.zze;
                    this.zzh = zzhkVar;
                    this.zza = zzhkVar;
                    this.zzc = 1;
                    obj = new zzhg(new zzfu(zzgbVar, j10, null));
                    if (obj != aVar) {
                        zzhkVar2 = zzhkVar;
                        this.zzh = zzhkVar2;
                        this.zza = null;
                        this.zzc = 2;
                        obj = ((zzhg) obj).zza(zzhkVar, this);
                        if (obj != aVar) {
                            zzhkVar3 = zzhkVar2;
                            double longValue = ((Number) obj).longValue();
                            zzfpVar = this.zzd.zza;
                            String str = this.zzf;
                            double d9 = 0.45d * longValue;
                            this.zzh = zzhkVar3;
                            this.zza = zzhkVar3;
                            d = longValue * 0.55d;
                            this.zzb = d;
                            this.zzc = 3;
                            obj = zzfpVar.zzl(str, (long) d9, this);
                            if (obj != aVar) {
                                zzhkVar4 = zzhkVar3;
                                this.zzh = zzhkVar4;
                                this.zza = null;
                                this.zzb = d;
                                this.zzc = 4;
                                obj = ((zzhf) obj).zza(zzhkVar3, this);
                                if (obj != aVar) {
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
                                    if (obj != aVar) {
                                        zzhkVar6 = zzhkVar5;
                                        this.zzh = zzhkVar6;
                                        this.zza = null;
                                        this.zzc = 6;
                                        obj = ((zzhf) obj).zza(zzhkVar5, this);
                                        if (obj != aVar) {
                                            zzhkVar7 = zzhkVar6;
                                            zzyg zzygVar3 = (zzyg) obj;
                                            zzfpVar4 = this.zzd.zza;
                                            this.zzh = zzygVar3;
                                            this.zza = zzhkVar7;
                                            this.zzc = 7;
                                            zzo = zzfpVar4.zzo(zzygVar3, this);
                                            if (zzo != aVar) {
                                                zzygVar = zzygVar3;
                                                obj = zzo;
                                                this.zzh = zzygVar;
                                                this.zza = null;
                                                this.zzc = 8;
                                                if (zzhj.zzb(zzhkVar7, (zzhf) obj, this) != aVar) {
                                                    zzygVar2 = zzygVar;
                                                    return zzygVar2.zzj();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return aVar;
                case 1:
                    zzhkVar = (zzhk) this.zza;
                    zzhkVar2 = (zzhk) this.zzh;
                    y5.b(obj);
                    this.zzh = zzhkVar2;
                    this.zza = null;
                    this.zzc = 2;
                    obj = ((zzhg) obj).zza(zzhkVar, this);
                    if (obj != aVar) {
                    }
                    return aVar;
                case 2:
                    zzhkVar3 = (zzhk) this.zzh;
                    y5.b(obj);
                    double longValue2 = ((Number) obj).longValue();
                    zzfpVar = this.zzd.zza;
                    String str2 = this.zzf;
                    double d92 = 0.45d * longValue2;
                    this.zzh = zzhkVar3;
                    this.zza = zzhkVar3;
                    d = longValue2 * 0.55d;
                    this.zzb = d;
                    this.zzc = 3;
                    obj = zzfpVar.zzl(str2, (long) d92, this);
                    if (obj != aVar) {
                    }
                    return aVar;
                case 3:
                    d = this.zzb;
                    zzhkVar3 = (zzhk) this.zza;
                    zzhkVar4 = (zzhk) this.zzh;
                    y5.b(obj);
                    this.zzh = zzhkVar4;
                    this.zza = null;
                    this.zzb = d;
                    this.zzc = 4;
                    obj = ((zzhf) obj).zza(zzhkVar3, this);
                    if (obj != aVar) {
                    }
                    return aVar;
                case 4:
                    d = this.zzb;
                    zzhkVar5 = (zzhk) this.zzh;
                    y5.b(obj);
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
                    if (obj != aVar) {
                    }
                    return aVar;
                case 5:
                    zzhkVar5 = (zzhk) this.zza;
                    zzhkVar6 = (zzhk) this.zzh;
                    y5.b(obj);
                    this.zzh = zzhkVar6;
                    this.zza = null;
                    this.zzc = 6;
                    obj = ((zzhf) obj).zza(zzhkVar5, this);
                    if (obj != aVar) {
                    }
                    return aVar;
                case 6:
                    zzhkVar7 = (zzhk) this.zzh;
                    y5.b(obj);
                    zzyg zzygVar32 = (zzyg) obj;
                    zzfpVar4 = this.zzd.zza;
                    this.zzh = zzygVar32;
                    this.zza = zzhkVar7;
                    this.zzc = 7;
                    zzo = zzfpVar4.zzo(zzygVar32, this);
                    if (zzo != aVar) {
                    }
                    return aVar;
                case 7:
                    zzhkVar7 = (zzhk) this.zza;
                    zzygVar = (zzyg) this.zzh;
                    y5.b(obj);
                    this.zzh = zzygVar;
                    this.zza = null;
                    this.zzc = 8;
                    if (zzhj.zzb(zzhkVar7, (zzhf) obj, this) != aVar) {
                    }
                    return aVar;
                default:
                    zzygVar2 = (zzyg) this.zzh;
                    y5.b(obj);
                    return zzygVar2.zzj();
            }
        } catch (zzcg e10) {
            throw e10;
        } catch (Exception e11) {
            throw new zzcg(zzce.zzb, zzcd.zzaB, e11.getMessage(), null, 8, null);
        }
    }
}
