package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* loaded from: classes.dex */
final class zzaf extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzaj zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzhk zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaf(zzaj zzajVar, String str, zzhk zzhkVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzajVar;
        this.zzc = str;
        this.zzd = zzhkVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzaf zzafVar = new zzaf(this.zzb, this.zzc, this.zzd, continuation);
        zzafVar.zze = obj;
        return zzafVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaf) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zzxx zzp;
        List list;
        Job launch$default;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        ResultKt.throwOnFailure(obj);
        if (i == 0) {
            CoroutineScope coroutineScope = (CoroutineScope) this.zze;
            ArrayList arrayList = new ArrayList();
            zzaj zzajVar = this.zzb;
            String str = this.zzc;
            zzajVar.zzn().put(str, arrayList);
            ArrayList arrayList2 = new ArrayList();
            list = zzajVar.zza;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (((zzar) obj2).zzi()) {
                    arrayList3.add(obj2);
                }
            }
            int size = arrayList3.size();
            int i2 = 0;
            while (i2 < size) {
                int i3 = i2 + 1;
                launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new zzae(this.zzd, (zzar) arrayList3.get(i2), str, arrayList, null), 3, null);
                arrayList2.add(launch$default);
                arrayList = arrayList;
                i2 = i3;
                str = str;
            }
            Job[] jobArr = (Job[]) arrayList2.toArray(new Job[0]);
            Job[] jobArr2 = (Job[]) Arrays.copyOf(jobArr, jobArr.length);
            this.zza = 1;
            if (AwaitKt.joinAll(jobArr2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        Result.Companion companion = Result.Companion;
        zzp = this.zzb.zzp(this.zzc);
        return Result.box-impl(Result.constructor-impl(zzp));
    }
}
