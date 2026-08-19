package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes.dex */
final class zzbn extends SuspendLambda implements Function2 {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzbo zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbn(zzbo zzboVar, Continuation continuation) {
        super(2, continuation);
        this.zzd = zzboVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzbn zzbnVar = new zzbn(this.zzd, continuation);
        zzbnVar.zze = obj;
        return zzbnVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbn) create((zzhk) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00a6, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhg) r13).zza(r1, r12) != r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
    
        if (r5.lock(null, r12) != r0) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        zzbo zzboVar;
        Mutex mutex;
        zzbp zzbpVar;
        zzhk zzhkVar2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zzc;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                zzhkVar = (zzhk) this.zze;
                zzboVar = this.zzd;
                mutex = zzboVar.zzf;
                this.zze = zzhkVar;
                this.zza = mutex;
                this.zzb = zzboVar;
                this.zzc = 1;
            } else if (i == 1) {
                zzboVar = (zzbo) this.zzb;
                mutex = (Mutex) this.zza;
                zzhk zzhkVar3 = (zzhk) this.zze;
                ResultKt.throwOnFailure(obj);
                zzhkVar = zzhkVar3;
            } else {
                if (i != 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                zzhkVar2 = (zzhk) this.zze;
                ResultKt.throwOnFailure(obj);
                this.zze = null;
                this.zzc = 3;
            }
            zzbpVar = zzboVar.zzc;
            if (!Intrinsics.areEqual(zzbpVar, zzbp.zza)) {
                Unit unit = Unit.INSTANCE;
                mutex.unlock(null);
                return unit;
            }
            zzboVar.zzc = zzbp.zzb;
            Unit unit2 = Unit.INSTANCE;
            mutex.unlock(null);
            zzbo zzboVar2 = this.zzd;
            zzboVar2.zza = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            BuildersKt__Builders_commonKt.launch$default(zzbo.zzb(zzboVar2).zzc(), null, null, new zzbm(zzhkVar, zzboVar2, null), 3, null);
            this.zze = zzhkVar;
            this.zza = null;
            this.zzb = null;
            this.zzc = 2;
            zzhg zzhgVar = new zzhg(new zzbj(zzboVar2, null));
            if (zzhgVar != coroutine_suspended) {
                zzhkVar2 = zzhkVar;
                obj = zzhgVar;
                this.zze = null;
                this.zzc = 3;
            }
            return coroutine_suspended;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }
}
