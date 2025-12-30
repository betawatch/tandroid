package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class zzgb implements zzdw {
    private final zzfp zza;
    private CompletableDeferred zzb = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
    private final Lazy zzc;
    private zzcg zzd;
    private zzxn zze;
    private zzdv zzf;

    public zzgb(zzfp zzfpVar, zzct zzctVar) {
        zzdu zzduVar;
        this.zza = zzfpVar;
        int i = zzby.zza;
        this.zzc = LazyKt.lazy(zzfv.zza);
        zzduVar = zzdv.zza;
        this.zzf = zzduVar;
    }

    public static final /* synthetic */ zzcr zzd(zzgb zzgbVar) {
        return (zzcr) zzgbVar.zzc.getValue();
    }

    public static final /* synthetic */ boolean zzo(zzgb zzgbVar, Exception exc) {
        if (!(exc instanceof zzcg)) {
            return true;
        }
        zzcg zzcgVar = (zzcg) exc;
        return (Intrinsics.areEqual(zzcgVar.zzb(), zzce.zzd) || Intrinsics.areEqual(zzcgVar.zzb(), zzce.zze) || Intrinsics.areEqual(zzcgVar.zzb(), zzce.zzf)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzp(Function1 function1, Continuation continuation) {
        zzfr zzfrVar;
        int i;
        zzcs zzcsVar;
        if (continuation instanceof zzfr) {
            zzfrVar = (zzfr) continuation;
            int i2 = zzfrVar.zzc;
            if ((i2 & TLObject.FLAG_31) != 0) {
                zzfrVar.zzc = i2 - TLObject.FLAG_31;
                Object obj = zzfrVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzfrVar.zzc;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    zzcs zzcsVar2 = new zzcs();
                    zzfrVar.zzd = zzcsVar2;
                    zzfrVar.zzc = 1;
                    if (function1.invoke(zzfrVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    zzcsVar = zzcsVar2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zzcsVar = zzfrVar.zzd;
                    ResultKt.throwOnFailure(obj);
                }
                zzcsVar.zzc();
                return Boxing.boxLong(zzcsVar.zza(TimeUnit.MILLISECONDS));
            }
        }
        zzfrVar = new zzfr(this, continuation);
        Object obj2 = zzfrVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzfrVar.zzc;
        if (i != 0) {
        }
        zzcsVar.zzc();
        return Boxing.boxLong(zzcsVar.zza(TimeUnit.MILLISECONDS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzq(long j, Continuation continuation) {
        return new zzhg(new zzga(this, j, null));
    }

    @Override // com.google.android.recaptcha.internal.zzdw
    public final Object zza(String str, RecaptchaAction recaptchaAction, long j, Continuation continuation) {
        return new zzhg(new zzfq(this, j, str, recaptchaAction, null));
    }

    @Override // com.google.android.recaptcha.internal.zzdw
    public final Object zzb(long j, Continuation continuation) {
        return zzq(j, continuation);
    }

    public final zzdv zze() {
        return this.zzf;
    }
}
