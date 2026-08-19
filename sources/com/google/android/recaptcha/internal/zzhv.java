package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
final class zzhv extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzib zzb;
    final /* synthetic */ zzxn zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzhv(zzib zzibVar, zzxn zzxnVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzibVar;
        this.zzc = zzxnVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzhv zzhvVar = new zzhv(this.zzb, this.zzc, continuation);
        zzhvVar.zzd = obj;
        return zzhvVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzhv) create((zzhk) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (r9 != r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                zzhkVar = (zzhk) this.zzd;
                zzib zzibVar = this.zzb;
                zzxn zzxnVar = this.zzc;
                String zzM = zzxnVar.zzM();
                String zzN = zzxnVar.zzN();
                this.zzd = zzhkVar;
                this.zza = 1;
                obj = new zzhg(new zzhw(zzibVar, zzN, zzM, null));
            } else {
                if (i != 1) {
                    ResultKt.throwOnFailure(obj);
                    return StringsKt.replace$default(this.zzc.zzl(), "JAVASCRIPT_TAG", (String) obj, false, 4, null);
                }
                zzhkVar = (zzhk) this.zzd;
                ResultKt.throwOnFailure(obj);
            }
            this.zzd = null;
            this.zza = 2;
            obj = ((zzhg) obj).zza(zzhkVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return StringsKt.replace$default(this.zzc.zzl(), "JAVASCRIPT_TAG", (String) obj, false, 4, null);
        } catch (Exception e) {
            if (e instanceof zzcg) {
                throw e;
            }
            throw new zzcg(zzce.zzb, zzcd.zzL, e.getMessage(), null, 8, null);
        }
    }
}
