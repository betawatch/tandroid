package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
final class zzli extends SuspendLambda implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzly zzc;
    final /* synthetic */ String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzli(zzly zzlyVar, String str, Continuation continuation) {
        super(2, continuation);
        this.zzc = zzlyVar;
        this.zzd = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzli(this.zzc, this.zzd, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzli) create((zzgr) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            if (this.zzb != 0) {
                String str = (String) this.zza;
                ResultKt.throwOnFailure(obj);
                zza = str;
            } else {
                ResultKt.throwOnFailure(obj);
                zzly zzlyVar = this.zzc;
                zza = zzly.zzm(zzlyVar).zza();
                this.zza = zza;
                this.zzb = 1;
                obj = zzlyVar.zzv(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            ((WebView) obj).loadDataWithBaseURL(zza, this.zzd, "text/html", "utf-8", null);
            return Unit.INSTANCE;
        } catch (Exception e) {
            zzcg zzcgVar = new zzcg(zzce.zzb, zzcd.zzU, e.getMessage(), null, 8, null);
            this.zzc.zzz().completeExceptionally(zzcgVar);
            throw zzcgVar;
        }
    }
}
