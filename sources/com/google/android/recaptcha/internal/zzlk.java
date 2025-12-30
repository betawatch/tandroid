package com.google.android.recaptcha.internal;

import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;

/* loaded from: classes.dex */
final class zzlk extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzly zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzlk(zzly zzlyVar, String str, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzlyVar;
        this.zzc = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzlk zzlkVar = new zzlk(this.zzb, this.zzc, continuation);
        zzlkVar.zzd = obj;
        return zzlkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlk) create((zzhk) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Map map;
        Object obj2;
        zzhk zzhkVar;
        Object zza;
        Object zza2;
        Object zzu;
        CompletableDeferred zzz;
        Map map2;
        zzcr zzD;
        Object await;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        try {
        } catch (Exception e) {
            zzcg zza3 = zzh.zza(e, new zzcg(zzce.zzb, zzcd.zzW, e.getMessage(), null, 8, null));
            zzly zzlyVar = this.zzb;
            String str = this.zzc;
            map = zzlyVar.zzd;
            CompletableDeferred completableDeferred = (CompletableDeferred) map.remove(str);
            if (completableDeferred != null) {
                Boxing.boxBoolean(completableDeferred.completeExceptionally(zza3));
            }
            Result.Companion companion = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(zza3));
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            zzhkVar = (zzhk) this.zzd;
            zzdj zzn = this.zzb.zzn();
            zzmc zzmcVar = zzmc.zzd;
            this.zzd = zzhkVar;
            this.zza = 1;
            zza = zzn.zza(zzmcVar, this);
            if (zza == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    zzhkVar = (zzhk) this.zzd;
                    ResultKt.throwOnFailure(obj);
                    zza2 = obj;
                    if (!((Boolean) zza2).booleanValue()) {
                        zzly zzlyVar2 = this.zzb;
                        this.zzd = zzhkVar;
                        this.zza = 3;
                        zzu = zzly.zzu(zzlyVar2, this);
                        if (zzu == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        this.zzd = null;
                        this.zza = 4;
                        if (((zzhg) zzu).zza(zzhkVar, this) == coroutine_suspended) {
                        }
                    }
                    zzz = this.zzb.zzz();
                    this.zzd = null;
                    this.zza = 5;
                    if (zzz.await(this) == coroutine_suspended) {
                    }
                    CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                    zzly zzlyVar3 = this.zzb;
                    map2 = zzlyVar3.zzd;
                    String str2 = this.zzc;
                    map2.put(str2, CompletableDeferred$default);
                    zzze zzf = zzzf.zzf();
                    zzf.zze(str2);
                    byte[] zzd = ((zzzf) zzf.zzk()).zzd();
                    String zzi = zzpp.zzh().zzi(zzd, 0, zzd.length);
                    zzD = zzlyVar3.zzD();
                    BuildersKt__Builders_commonKt.launch$default(zzD.zzb(), null, null, new zzlj(zzlyVar3, zzi, null), 3, null);
                    this.zza = 6;
                    await = CompletableDeferred$default.await(this);
                    if (await == coroutine_suspended) {
                    }
                    zzxx zzxxVar = (zzxx) await;
                    zzxw zzf2 = zzxx.zzf();
                    zzf2.zze(this.zzc);
                    zzya zzf3 = zzyb.zzf();
                    zzf3.zze(zzxxVar.zzl());
                    zzf2.zzr(zzf3);
                    zzxy zzf4 = zzxz.zzf();
                    zzf4.zze(zzxxVar.zzj());
                    zzf4.zzf(zzxxVar.zzM());
                    zzf2.zzs(zzf4);
                    Result.Companion companion2 = Result.Companion;
                    obj2 = Result.constructor-impl(zzf2.zzk());
                    return Result.box-impl(obj2);
                }
                if (i == 3) {
                    zzhkVar = (zzhk) this.zzd;
                    ResultKt.throwOnFailure(obj);
                    zzu = obj;
                    this.zzd = null;
                    this.zza = 4;
                    if (((zzhg) zzu).zza(zzhkVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    zzz = this.zzb.zzz();
                    this.zzd = null;
                    this.zza = 5;
                    if (zzz.await(this) == coroutine_suspended) {
                    }
                    CompletableDeferred CompletableDeferred$default2 = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                    zzly zzlyVar32 = this.zzb;
                    map2 = zzlyVar32.zzd;
                    String str22 = this.zzc;
                    map2.put(str22, CompletableDeferred$default2);
                    zzze zzf5 = zzzf.zzf();
                    zzf5.zze(str22);
                    byte[] zzd2 = ((zzzf) zzf5.zzk()).zzd();
                    String zzi2 = zzpp.zzh().zzi(zzd2, 0, zzd2.length);
                    zzD = zzlyVar32.zzD();
                    BuildersKt__Builders_commonKt.launch$default(zzD.zzb(), null, null, new zzlj(zzlyVar32, zzi2, null), 3, null);
                    this.zza = 6;
                    await = CompletableDeferred$default2.await(this);
                    if (await == coroutine_suspended) {
                    }
                    zzxx zzxxVar2 = (zzxx) await;
                    zzxw zzf22 = zzxx.zzf();
                    zzf22.zze(this.zzc);
                    zzya zzf32 = zzyb.zzf();
                    zzf32.zze(zzxxVar2.zzl());
                    zzf22.zzr(zzf32);
                    zzxy zzf42 = zzxz.zzf();
                    zzf42.zze(zzxxVar2.zzj());
                    zzf42.zzf(zzxxVar2.zzM());
                    zzf22.zzs(zzf42);
                    Result.Companion companion22 = Result.Companion;
                    obj2 = Result.constructor-impl(zzf22.zzk());
                    return Result.box-impl(obj2);
                }
                if (i == 4) {
                    ResultKt.throwOnFailure(obj);
                    zzz = this.zzb.zzz();
                    this.zzd = null;
                    this.zza = 5;
                    if (zzz.await(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    CompletableDeferred CompletableDeferred$default22 = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                    zzly zzlyVar322 = this.zzb;
                    map2 = zzlyVar322.zzd;
                    String str222 = this.zzc;
                    map2.put(str222, CompletableDeferred$default22);
                    zzze zzf52 = zzzf.zzf();
                    zzf52.zze(str222);
                    byte[] zzd22 = ((zzzf) zzf52.zzk()).zzd();
                    String zzi22 = zzpp.zzh().zzi(zzd22, 0, zzd22.length);
                    zzD = zzlyVar322.zzD();
                    BuildersKt__Builders_commonKt.launch$default(zzD.zzb(), null, null, new zzlj(zzlyVar322, zzi22, null), 3, null);
                    this.zza = 6;
                    await = CompletableDeferred$default22.await(this);
                    if (await == coroutine_suspended) {
                    }
                    zzxx zzxxVar22 = (zzxx) await;
                    zzxw zzf222 = zzxx.zzf();
                    zzf222.zze(this.zzc);
                    zzya zzf322 = zzyb.zzf();
                    zzf322.zze(zzxxVar22.zzl());
                    zzf222.zzr(zzf322);
                    zzxy zzf422 = zzxz.zzf();
                    zzf422.zze(zzxxVar22.zzj());
                    zzf422.zzf(zzxxVar22.zzM());
                    zzf222.zzs(zzf422);
                    Result.Companion companion222 = Result.Companion;
                    obj2 = Result.constructor-impl(zzf222.zzk());
                    return Result.box-impl(obj2);
                }
                if (i != 5) {
                    ResultKt.throwOnFailure(obj);
                    await = obj;
                    zzxx zzxxVar222 = (zzxx) await;
                    zzxw zzf2222 = zzxx.zzf();
                    zzf2222.zze(this.zzc);
                    zzya zzf3222 = zzyb.zzf();
                    zzf3222.zze(zzxxVar222.zzl());
                    zzf2222.zzr(zzf3222);
                    zzxy zzf4222 = zzxz.zzf();
                    zzf4222.zze(zzxxVar222.zzj());
                    zzf4222.zzf(zzxxVar222.zzM());
                    zzf2222.zzs(zzf4222);
                    Result.Companion companion2222 = Result.Companion;
                    obj2 = Result.constructor-impl(zzf2222.zzk());
                    return Result.box-impl(obj2);
                }
                ResultKt.throwOnFailure(obj);
                CompletableDeferred CompletableDeferred$default222 = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                zzly zzlyVar3222 = this.zzb;
                map2 = zzlyVar3222.zzd;
                String str2222 = this.zzc;
                map2.put(str2222, CompletableDeferred$default222);
                zzze zzf522 = zzzf.zzf();
                zzf522.zze(str2222);
                byte[] zzd222 = ((zzzf) zzf522.zzk()).zzd();
                String zzi222 = zzpp.zzh().zzi(zzd222, 0, zzd222.length);
                zzD = zzlyVar3222.zzD();
                BuildersKt__Builders_commonKt.launch$default(zzD.zzb(), null, null, new zzlj(zzlyVar3222, zzi222, null), 3, null);
                this.zza = 6;
                await = CompletableDeferred$default222.await(this);
                if (await == coroutine_suspended) {
                    return coroutine_suspended;
                }
                zzxx zzxxVar2222 = (zzxx) await;
                zzxw zzf22222 = zzxx.zzf();
                zzf22222.zze(this.zzc);
                zzya zzf32222 = zzyb.zzf();
                zzf32222.zze(zzxxVar2222.zzl());
                zzf22222.zzr(zzf32222);
                zzxy zzf42222 = zzxz.zzf();
                zzf42222.zze(zzxxVar2222.zzj());
                zzf42222.zzf(zzxxVar2222.zzM());
                zzf22222.zzs(zzf42222);
                Result.Companion companion22222 = Result.Companion;
                obj2 = Result.constructor-impl(zzf22222.zzk());
                return Result.box-impl(obj2);
            }
            zzhkVar = (zzhk) this.zzd;
            ResultKt.throwOnFailure(obj);
            zza = obj;
        }
        if (((Boolean) zza).booleanValue()) {
            zzcg zzcgVar = new zzcg(zzce.zzb, zzcd.zzay, null, null, 12, null);
            Result.Companion companion3 = Result.Companion;
            return Result.box-impl(Result.constructor-impl(ResultKt.createFailure(zzcgVar)));
        }
        zzdj zzn2 = this.zzb.zzn();
        zzmc zzmcVar2 = zzmc.zzc;
        this.zzd = zzhkVar;
        this.zza = 2;
        zza2 = zzn2.zza(zzmcVar2, this);
        if (zza2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        if (!((Boolean) zza2).booleanValue()) {
        }
        zzz = this.zzb.zzz();
        this.zzd = null;
        this.zza = 5;
        if (zzz.await(this) == coroutine_suspended) {
        }
        CompletableDeferred CompletableDeferred$default2222 = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        zzly zzlyVar32222 = this.zzb;
        map2 = zzlyVar32222.zzd;
        String str22222 = this.zzc;
        map2.put(str22222, CompletableDeferred$default2222);
        zzze zzf5222 = zzzf.zzf();
        zzf5222.zze(str22222);
        byte[] zzd2222 = ((zzzf) zzf5222.zzk()).zzd();
        String zzi2222 = zzpp.zzh().zzi(zzd2222, 0, zzd2222.length);
        zzD = zzlyVar32222.zzD();
        BuildersKt__Builders_commonKt.launch$default(zzD.zzb(), null, null, new zzlj(zzlyVar32222, zzi2222, null), 3, null);
        this.zza = 6;
        await = CompletableDeferred$default2222.await(this);
        if (await == coroutine_suspended) {
        }
        zzxx zzxxVar22222 = (zzxx) await;
        zzxw zzf222222 = zzxx.zzf();
        zzf222222.zze(this.zzc);
        zzya zzf322222 = zzyb.zzf();
        zzf322222.zze(zzxxVar22222.zzl());
        zzf222222.zzr(zzf322222);
        zzxy zzf422222 = zzxz.zzf();
        zzf422222.zze(zzxxVar22222.zzj());
        zzf422222.zzf(zzxxVar22222.zzM());
        zzf222222.zzs(zzf422222);
        Result.Companion companion222222 = Result.Companion;
        obj2 = Result.constructor-impl(zzf222222.zzk());
        return Result.box-impl(obj2);
    }
}
