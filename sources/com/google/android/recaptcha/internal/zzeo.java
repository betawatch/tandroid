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

    /* JADX WARN: Removed duplicated region for block: B:10:0x005f A[Catch: Exception -> 0x000f, zzcg -> 0x0011, TryCatch #2 {zzcg -> 0x0011, Exception -> 0x000f, blocks: (B:5:0x000b, B:6:0x0056, B:10:0x005f, B:11:0x006e, B:14:0x0017, B:15:0x0043, B:19:0x0023), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005e A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        zzdw zzdwVar;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                zzgrVar = (zzgr) this.zze;
                zzeq zzeqVar = this.zzb;
                long j = this.zzc;
                RecaptchaAction recaptchaAction = this.zzd;
                zzeq.zzd(zzeqVar, j, recaptchaAction);
                zzdwVar = zzeqVar.zzb;
                String zzb = zzgrVar.zza().zzb();
                this.zze = zzgrVar;
                this.zza = 1;
                obj = zzdwVar.zza(zzb, recaptchaAction, j, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
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
            }
            this.zze = null;
            this.zza = 2;
            obj = ((zzhg) obj).zza(zzgrVar.zza(), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = (String) obj;
            if (str.length() == 0) {
            }
        } catch (zzcg e) {
            throw e;
        } catch (Exception e2) {
            throw new zzcg(zzce.zzb, zzcd.zzX, e2.getMessage(), null, 8, null);
        }
    }
}
