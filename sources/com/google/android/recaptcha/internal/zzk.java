package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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
import kotlinx.coroutines.Deferred;

/* loaded from: classes.dex */
final class zzk extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzgr zzd;
    final /* synthetic */ long zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzk(zzq zzqVar, String str, zzgr zzgrVar, long j, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzqVar;
        this.zzc = str;
        this.zzd = zzgrVar;
        this.zze = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzk zzkVar = new zzk(this.zzb, this.zzc, this.zzd, this.zze, continuation);
        zzkVar.zzf = obj;
        return zzkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzk) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object awaitAll;
        Deferred async$default;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        ResultKt.throwOnFailure(obj);
        if (i != 0) {
            awaitAll = obj;
        } else {
            CoroutineScope coroutineScope = (CoroutineScope) this.zzf;
            ArrayList arrayList = new ArrayList();
            for (zzg zzgVar : this.zzb.zzd()) {
                if (zzgVar.zzi()) {
                    async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new zzj(this.zzd, zzgVar, this.zzc, this.zze, null), 3, null);
                    arrayList.add(async$default);
                }
            }
            Deferred[] deferredArr = (Deferred[]) arrayList.toArray(new Deferred[0]);
            Deferred[] deferredArr2 = (Deferred[]) Arrays.copyOf(deferredArr, deferredArr.length);
            this.zza = 1;
            awaitAll = AwaitKt.awaitAll(deferredArr2, this);
            if (awaitAll == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        String str = this.zzc;
        zzxw zzf = zzxx.zzf();
        zzf.zze(str);
        Iterator it = ((List) awaitAll).iterator();
        while (it.hasNext()) {
            Object obj2 = ((Result) it.next()).unbox-impl();
            if (Result.isSuccess-impl(obj2)) {
                zzf.zzh((zzxx) obj2);
            }
        }
        return (zzxx) zzf.zzk();
    }
}
