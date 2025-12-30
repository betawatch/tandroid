package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
final class zzgc extends SuspendLambda implements Function2 {
    Object zza;
    double zzb;
    int zzc;
    final /* synthetic */ zzge zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ String zzf;
    final /* synthetic */ RecaptchaAction zzg;
    private /* synthetic */ Object zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgc(zzge zzgeVar, long j, String str, RecaptchaAction recaptchaAction, Continuation continuation) {
        super(2, continuation);
        this.zzd = zzgeVar;
        this.zze = j;
        this.zzf = str;
        this.zzg = recaptchaAction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzgc zzgcVar = new zzgc(this.zzd, this.zze, this.zzf, this.zzg, continuation);
        zzgcVar.zzh = obj;
        return zzgcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgc) create((zzhk) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
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
        double d2;
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
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zzc;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                zzhkVar = (zzhk) this.zzh;
                zzge zzgeVar = this.zzd;
                zzdvVar = zzgeVar.zzb;
                zzdsVar = zzdv.zzb;
                if (!Intrinsics.areEqual(zzdvVar, zzdsVar)) {
                    throw new zzcg(zzce.zzb, zzcd.zzas, null, null, 12, null);
                }
                double d3 = this.zze;
                zzfpVar = zzgeVar.zza;
                String str = this.zzf;
                double d4 = 0.45d * d3;
                this.zzh = zzhkVar;
                this.zza = zzhkVar;
                double d5 = d3 * 0.55d;
                this.zzb = d5;
                this.zzc = 1;
                zzl = zzfpVar.zzl(str, (long) d4, this);
                if (zzl == coroutine_suspended) {
                    return coroutine_suspended;
                }
                d = d5;
                zzhkVar2 = zzhkVar;
            } else if (i == 1) {
                d = this.zzb;
                zzhkVar = (zzhk) this.zza;
                zzhk zzhkVar4 = (zzhk) this.zzh;
                ResultKt.throwOnFailure(obj);
                zzhkVar2 = zzhkVar4;
                zzl = obj;
            } else if (i == 2) {
                d2 = this.zzb;
                zzhk zzhkVar5 = (zzhk) this.zzh;
                ResultKt.throwOnFailure(obj);
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
                zzm = zzfpVar3.zzm(zzk, (long) d2, this);
                if (zzm != coroutine_suspended) {
                    return coroutine_suspended;
                }
                zzhkVar3 = zzhkVar2;
                this.zzh = zzhkVar3;
                this.zza = null;
                this.zzc = 4;
                zza2 = ((zzhf) zzm).zza(zzhkVar2, this);
                if (zza2 == coroutine_suspended) {
                }
                zzygVar = (zzyg) zza2;
                zzfpVar4 = this.zzd.zza;
                this.zzh = zzygVar;
                this.zza = zzhkVar3;
                this.zzc = 5;
                zzo = zzfpVar4.zzo(zzygVar, this);
                if (zzo == coroutine_suspended) {
                }
                this.zzh = zzygVar;
                this.zza = null;
                this.zzc = 6;
                if (zzhj.zzb(zzhkVar3, (zzhf) zzo, this) != coroutine_suspended) {
                }
            } else if (i == 3) {
                zzhk zzhkVar6 = (zzhk) this.zza;
                zzhkVar3 = (zzhk) this.zzh;
                ResultKt.throwOnFailure(obj);
                zzhkVar2 = zzhkVar6;
                zzm = obj;
                this.zzh = zzhkVar3;
                this.zza = null;
                this.zzc = 4;
                zza2 = ((zzhf) zzm).zza(zzhkVar2, this);
                if (zza2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                zzygVar = (zzyg) zza2;
                zzfpVar4 = this.zzd.zza;
                this.zzh = zzygVar;
                this.zza = zzhkVar3;
                this.zzc = 5;
                zzo = zzfpVar4.zzo(zzygVar, this);
                if (zzo == coroutine_suspended) {
                }
                this.zzh = zzygVar;
                this.zza = null;
                this.zzc = 6;
                if (zzhj.zzb(zzhkVar3, (zzhf) zzo, this) != coroutine_suspended) {
                }
            } else {
                if (i != 4) {
                    if (i != 5) {
                        zzygVar2 = (zzyg) this.zzh;
                        ResultKt.throwOnFailure(obj);
                        return zzygVar2.zzj();
                    }
                    zzhk zzhkVar7 = (zzhk) this.zza;
                    zzyg zzygVar3 = (zzyg) this.zzh;
                    ResultKt.throwOnFailure(obj);
                    zzhkVar3 = zzhkVar7;
                    zzygVar = zzygVar3;
                    zzo = obj;
                    this.zzh = zzygVar;
                    this.zza = null;
                    this.zzc = 6;
                    if (zzhj.zzb(zzhkVar3, (zzhf) zzo, this) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    zzygVar2 = zzygVar;
                    return zzygVar2.zzj();
                }
                zzhk zzhkVar8 = (zzhk) this.zzh;
                ResultKt.throwOnFailure(obj);
                zzhkVar3 = zzhkVar8;
                zza2 = obj;
                zzygVar = (zzyg) zza2;
                zzfpVar4 = this.zzd.zza;
                this.zzh = zzygVar;
                this.zza = zzhkVar3;
                this.zzc = 5;
                zzo = zzfpVar4.zzo(zzygVar, this);
                if (zzo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.zzh = zzygVar;
                this.zza = null;
                this.zzc = 6;
                if (zzhj.zzb(zzhkVar3, (zzhf) zzo, this) != coroutine_suspended) {
                }
            }
            this.zzh = zzhkVar2;
            this.zza = null;
            this.zzb = d;
            this.zzc = 2;
            zza = ((zzhf) zzl).zza(zzhkVar, this);
            if (zza == coroutine_suspended) {
                return coroutine_suspended;
            }
            d2 = d;
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
            zzm = zzfpVar3.zzm(zzk2, (long) d2, this);
            if (zzm != coroutine_suspended) {
            }
        } catch (zzcg e) {
            throw e;
        } catch (Exception e2) {
            throw new zzcg(zzce.zzb, zzcd.zzaC, e2.getMessage(), null, 8, null);
        }
    }
}
