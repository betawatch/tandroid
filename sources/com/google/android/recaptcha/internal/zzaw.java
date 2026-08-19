package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
final class zzaw extends SuspendLambda implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzhk zzc;
    final /* synthetic */ zzba zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaw(zzhk zzhkVar, zzba zzbaVar, Continuation continuation) {
        super(2, continuation);
        this.zzc = zzhkVar;
        this.zzd = zzbaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzaw(this.zzc, this.zzd, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaw) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        if (r6 != r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        zzbo zzboVar;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zzb;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                zzhkVar = this.zzc;
                zzba zzbaVar = this.zzd;
                zzboVar = zzbaVar.zza;
                str = zzbaVar.zzd;
                this.zza = zzhkVar;
                this.zzb = 1;
                obj = new zzhg(new zzbb(zzboVar, str, null));
            } else {
                if (i != 1) {
                    ResultKt.throwOnFailure(obj);
                    zzba zzbaVar2 = this.zzd;
                    zzyu zzf = zzyx.zzf();
                    zzyv zzf2 = zzyw.zzf();
                    zzf2.zzw((String) obj);
                    zzf.zzf((zzyw) zzf2.zzk());
                    return zzas.zzb(zzbaVar2, (zzyx) zzf.zzk());
                }
                zzhkVar = (zzhk) this.zza;
                ResultKt.throwOnFailure(obj);
            }
            this.zza = null;
            this.zzb = 2;
            obj = ((zzhg) obj).zza(zzhkVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            zzba zzbaVar22 = this.zzd;
            zzyu zzf3 = zzyx.zzf();
            zzyv zzf22 = zzyw.zzf();
            zzf22.zzw((String) obj);
            zzf3.zzf((zzyw) zzf22.zzk());
            return zzas.zzb(zzbaVar22, (zzyx) zzf3.zzk());
        } catch (Exception e) {
            throw new zzcg(zzce.zzb, zzcd.zzaa, e.getMessage(), e);
        }
    }
}
