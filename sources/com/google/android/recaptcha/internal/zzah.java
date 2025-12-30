package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
final class zzah extends SuspendLambda implements Function2 {
    Object zza;
    Object zzb;
    Object zzc;
    int zzd;
    final /* synthetic */ zzxn zze;
    final /* synthetic */ zzaj zzf;
    final /* synthetic */ zzhk zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzah(zzxn zzxnVar, zzaj zzajVar, zzhk zzhkVar, Continuation continuation) {
        super(2, continuation);
        this.zze = zzxnVar;
        this.zzf = zzajVar;
        this.zzg = zzhkVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzah(this.zze, this.zzf, this.zzg, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzah) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x00c1 -> B:5:0x008f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzxp zzk;
        List list;
        Iterator it;
        zzxp zzxpVar;
        Iterator it2;
        zzhk zzhkVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zzd;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            zzxn zzxnVar = this.zze;
            if (!zzxnVar.zzU()) {
                Result.Companion companion = Result.Companion;
                return Result.box-impl(Result.constructor-impl(ResultKt.createFailure(new zzcg(zzce.zzb, zzcd.zzab, null, null, 12, null))));
            }
            zzk = zzxnVar.zzk();
            if (zzk.zzi().zzn()) {
                Result.Companion companion2 = Result.Companion;
                return Result.box-impl(Result.constructor-impl(ResultKt.createFailure(new zzcg(zzce.zzb, zzcd.zzab, null, null, 12, null))));
            }
            zzaj zzajVar = this.zzf;
            zzajVar.zzb = zzk.zzi();
            list = zzajVar.zza;
            it = list.iterator();
        } else {
            if (i == 1) {
                zzhkVar = (zzhk) this.zzc;
                it2 = (Iterator) this.zzb;
                zzxpVar = (zzxp) this.zza;
                ResultKt.throwOnFailure(obj);
                this.zza = zzxpVar;
                this.zzb = it2;
                this.zzc = null;
                this.zzd = 2;
                if (zzhj.zzb(zzhkVar, (zzhf) obj, this) != coroutine_suspended) {
                    it = it2;
                    zzk = zzxpVar;
                }
                return coroutine_suspended;
            }
            it = (Iterator) this.zzb;
            zzk = (zzxp) this.zza;
            ResultKt.throwOnFailure(obj);
        }
        if (!it.hasNext()) {
            Result.Companion companion3 = Result.Companion;
            return Result.box-impl(Result.constructor-impl(Unit.INSTANCE));
        }
        zzar zzarVar = (zzar) it.next();
        zzhk zzhkVar2 = this.zzg;
        this.zza = zzk;
        this.zzb = it;
        this.zzc = zzhkVar2;
        this.zzd = 1;
        obj = zzarVar.zzd(zzk, this);
        if (obj != coroutine_suspended) {
            zzxp zzxpVar2 = zzk;
            it2 = it;
            zzhkVar = zzhkVar2;
            zzxpVar = zzxpVar2;
            this.zza = zzxpVar;
            this.zzb = it2;
            this.zzc = null;
            this.zzd = 2;
            if (zzhj.zzb(zzhkVar, (zzhf) obj, this) != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }
}
