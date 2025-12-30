package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes.dex */
final class zzlh extends SuspendLambda implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzly zzc;
    final /* synthetic */ zzxn zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzlh(zzly zzlyVar, zzxn zzxnVar, Continuation continuation) {
        super(2, continuation);
        this.zzc = zzlyVar;
        this.zzd = zzxnVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzlh zzlhVar = new zzlh(this.zzc, this.zzd, continuation);
        zzlhVar.zze = obj;
        return zzlhVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlh) create((zzhk) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        zzhk zzhkVar2;
        zzhk zzhkVar3;
        zzcr zzD;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zzb;
        try {
        } catch (zzcg e) {
            this.zzc.zzz().completeExceptionally(e);
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            zzhkVar = (zzhk) this.zze;
            zzib zzp = zzly.zzp(this.zzc);
            zzxn zzxnVar = this.zzd;
            this.zze = zzhkVar;
            this.zza = zzhkVar;
            this.zzb = 1;
            obj = zzp.zzc(zzxnVar, this);
            if (obj != coroutine_suspended) {
                zzhkVar2 = zzhkVar;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            zzhkVar3 = (zzhk) this.zze;
            ResultKt.throwOnFailure(obj);
            zzly zzlyVar = this.zzc;
            zzD = zzlyVar.zzD();
            BuildersKt__Builders_commonKt.launch$default(zzD.zzb(), null, null, new zzlg(zzlyVar, zzhkVar3, (String) obj, null), 3, null);
            return Unit.INSTANCE;
        }
        zzhk zzhkVar4 = (zzhk) this.zza;
        zzhk zzhkVar5 = (zzhk) this.zze;
        ResultKt.throwOnFailure(obj);
        zzhkVar2 = zzhkVar4;
        zzhkVar = zzhkVar5;
        this.zze = zzhkVar;
        this.zza = null;
        this.zzb = 2;
        obj = ((zzhg) obj).zza(zzhkVar2, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        zzhkVar3 = zzhkVar;
        zzly zzlyVar2 = this.zzc;
        zzD = zzlyVar2.zzD();
        BuildersKt__Builders_commonKt.launch$default(zzD.zzb(), null, null, new zzlg(zzlyVar2, zzhkVar3, (String) obj, null), 3, null);
        return Unit.INSTANCE;
    }
}
