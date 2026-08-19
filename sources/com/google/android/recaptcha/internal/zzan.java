package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
final class zzan extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzar zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzan(zzar zzarVar, String str, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzarVar;
        this.zzc = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzan zzanVar = new zzan(this.zzb, this.zzc, continuation);
        zzanVar.zzd = obj;
        return zzanVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzan) create((zzgr) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if (r5 != r0) goto L10;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            zzgrVar = (zzgr) this.zzd;
            zzar zzarVar = this.zzb;
            String str = this.zzc;
            this.zzd = zzgrVar;
            this.zza = 1;
            obj = zzarVar.zze(str, this);
        } else {
            if (i != 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            zzgrVar = (zzgr) this.zzd;
            ResultKt.throwOnFailure(obj);
        }
        this.zzd = null;
        this.zza = 2;
        Object zza = ((zzhg) obj).zza(zzgrVar.zza(), this);
        return zza == coroutine_suspended ? coroutine_suspended : zza;
    }
}
