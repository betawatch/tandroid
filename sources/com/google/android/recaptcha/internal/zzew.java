package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
final class zzew extends SuspendLambda implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfp zzd;
    final /* synthetic */ zzgr zze;
    final /* synthetic */ zzye zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzew(long j, zzfp zzfpVar, zzgr zzgrVar, zzye zzyeVar, Continuation continuation) {
        super(2, continuation);
        this.zzc = j;
        this.zzd = zzfpVar;
        this.zze = zzgrVar;
        this.zzf = zzyeVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzew(this.zzc, this.zzd, this.zze, this.zzf, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzew) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        long j;
        zzev zzevVar;
        Object zzc;
        zzcg zzcgVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.zzb != 0) {
            ref$ObjectRef2 = (Ref$ObjectRef) this.zza;
            try {
                ResultKt.throwOnFailure(obj);
                zzc = obj;
            } catch (Exception e) {
                e = e;
                zzcgVar = (zzcg) ref$ObjectRef2.element;
                if (zzcgVar != null) {
                }
            }
        } else {
            ResultKt.throwOnFailure(obj);
            Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
            try {
                j = this.zzc;
                zzevVar = new zzev(this.zze, this.zzd, this.zzf, ref$ObjectRef3, null);
                ref$ObjectRef = ref$ObjectRef3;
            } catch (Exception e2) {
                e = e2;
                ref$ObjectRef = ref$ObjectRef3;
            }
            try {
                this.zza = ref$ObjectRef;
                this.zzb = 1;
                zzc = zzcx.zzc(j, 20, 100L, 1000L, 2.0d, zzevVar, this);
                if (zzc == coroutine_suspended) {
                    return coroutine_suspended;
                }
                ref$ObjectRef2 = ref$ObjectRef;
            } catch (Exception e3) {
                e = e3;
                ref$ObjectRef2 = ref$ObjectRef;
                zzcgVar = (zzcg) ref$ObjectRef2.element;
                if (zzcgVar != null) {
                    throw zzfp.zzd(this.zzd, e);
                }
                throw zzcgVar;
            }
        }
        return (zzyg) zzc;
    }
}
