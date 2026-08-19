package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
final class zzeo extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzeq zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ RecaptchaAction zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzeo(zzeq zzeqVar, long j, RecaptchaAction recaptchaAction, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzeqVar;
        this.zzc = j;
        this.zzd = recaptchaAction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzeo zzeoVar = new zzeo(this.zzb, this.zzc, this.zzd, continuation);
        zzeoVar.zze = obj;
        return zzeoVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeo) create((zzgr) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0049, code lost:
    
        if (r10 != r0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067 A[Catch: Exception -> 0x0076, zzcg -> 0x0079, TryCatch #4 {zzcg -> 0x0079, Exception -> 0x0076, blocks: (B:13:0x005e, B:17:0x0067, B:18:0x0075, B:10:0x004b, B:8:0x0045), top: B:7:0x0045 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Exception exc;
        zzgr zzgrVar;
        zzeo zzeoVar;
        Exception e;
        zzcg e2;
        String str;
        long j;
        RecaptchaAction recaptchaAction;
        zzdw zzdwVar;
        String zzb;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        if (i != 0) {
            try {
                if (i != 1) {
                    ResultKt.throwOnFailure(obj);
                    str = (String) obj;
                    if (str.length() == 0) {
                        return str;
                    }
                    throw new zzcg(zzce.zzb, zzcd.zzaW, null, null, 12, null);
                }
                zzgrVar = (zzgr) this.zze;
                ResultKt.throwOnFailure(obj);
                zzeoVar = this;
            } catch (zzcg e3) {
                throw e3;
            } catch (Exception e4) {
                exc = e4;
                throw new zzcg(zzce.zzb, zzcd.zzX, exc.getMessage(), null, 8, null);
            }
        } else {
            ResultKt.throwOnFailure(obj);
            zzgrVar = (zzgr) this.zze;
            try {
                zzeq zzeqVar = this.zzb;
                j = this.zzc;
                recaptchaAction = this.zzd;
                zzeq.zzd(zzeqVar, j, recaptchaAction);
                zzdwVar = zzeqVar.zzb;
                zzb = zzgrVar.zza().zzb();
                this.zze = zzgrVar;
                this.zza = 1;
                zzeoVar = this;
            } catch (zzcg e5) {
                e2 = e5;
                throw e2;
            } catch (Exception e6) {
                e = e6;
                exc = e;
                throw new zzcg(zzce.zzb, zzcd.zzX, exc.getMessage(), null, 8, null);
            }
            try {
                obj = zzdwVar.zza(zzb, recaptchaAction, j, zzeoVar);
            } catch (zzcg e7) {
                e2 = e7;
                throw e2;
            } catch (Exception e8) {
                e = e8;
                exc = e;
                throw new zzcg(zzce.zzb, zzcd.zzX, exc.getMessage(), null, 8, null);
            }
        }
        zzeoVar.zze = null;
        zzeoVar.zza = 2;
        obj = ((zzhg) obj).zza(zzgrVar.zza(), this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        str = (String) obj;
        if (str.length() == 0) {
        }
    }
}
