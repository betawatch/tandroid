package com.google.android.recaptcha.internal;

import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.core.integrity.model.StandardIntegrityErrorCode;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;

/* loaded from: classes.dex */
final class zzbe extends SuspendLambda implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzbo zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbe(zzbo zzboVar, Continuation continuation) {
        super(2, continuation);
        this.zzc = zzboVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzbe(this.zzc, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbe) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ad  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef ref$ObjectRef;
        Exception e;
        Throwable th;
        Throwable th2;
        zzcd zzcdVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.zzb != 0) {
            ref$ObjectRef = (Ref$ObjectRef) this.zza;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception e2) {
                e = e2;
                zzbo zzboVar = this.zzc;
                CompletableDeferred zzf = zzboVar.zzf();
                th = (Throwable) ref$ObjectRef.element;
                if (th == null) {
                    th = e;
                }
                zzf.completeExceptionally(th);
                zzboVar.zzc = zzbp.zza;
                zzce zzceVar = zzce.zzb;
                th2 = (Throwable) ref$ObjectRef.element;
                if (th2 == null) {
                    th2 = e;
                }
                if (th2 instanceof StandardIntegrityException) {
                    zzcdVar = zzcd.zza;
                } else {
                    int errorCode = ((StandardIntegrityException) th2).getErrorCode();
                    if (errorCode == -100) {
                        zzcdVar = zzcd.zzaV;
                    } else if (errorCode == -12) {
                        zzcdVar = zzcd.zzaO;
                    } else if (errorCode == -3) {
                        zzcdVar = zzcd.zzaI;
                    } else if (errorCode == -2) {
                        zzcdVar = zzcd.zzaH;
                    } else if (errorCode != -1) {
                        switch (errorCode) {
                            case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                                zzcdVar = zzcd.zzaU;
                                break;
                            case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                                zzcdVar = zzcd.zzaT;
                                break;
                            case -17:
                                zzcdVar = zzcd.zzaS;
                                break;
                            case -16:
                                zzcdVar = zzcd.zzaR;
                                break;
                            case -15:
                                zzcdVar = zzcd.zzaQ;
                                break;
                            case -14:
                                zzcdVar = zzcd.zzaP;
                                break;
                            default:
                                switch (errorCode) {
                                    case -9:
                                        zzcdVar = zzcd.zzaN;
                                        break;
                                    case -8:
                                        zzcdVar = zzcd.zzaM;
                                        break;
                                    case -7:
                                        zzcdVar = zzcd.zzaL;
                                        break;
                                    case -6:
                                        zzcdVar = zzcd.zzaK;
                                        break;
                                    case -5:
                                        zzcdVar = zzcd.zzaJ;
                                        break;
                                    default:
                                        zzcdVar = zzcd.zza;
                                        break;
                                }
                        }
                    } else {
                        zzcdVar = zzcd.zzaG;
                    }
                }
                throw new zzcg(zzceVar, zzcdVar, e.getMessage(), null, 8, null);
            }
        } else {
            ResultKt.throwOnFailure(obj);
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            try {
                zzbd zzbdVar = new zzbd(this.zzc, ref$ObjectRef2, null);
                this.zza = ref$ObjectRef2;
                this.zzb = 1;
                if (TimeoutKt.withTimeout(60000L, zzbdVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Exception e3) {
                ref$ObjectRef = ref$ObjectRef2;
                e = e3;
                zzbo zzboVar2 = this.zzc;
                CompletableDeferred zzf2 = zzboVar2.zzf();
                th = (Throwable) ref$ObjectRef.element;
                if (th == null) {
                }
                zzf2.completeExceptionally(th);
                zzboVar2.zzc = zzbp.zza;
                zzce zzceVar2 = zzce.zzb;
                th2 = (Throwable) ref$ObjectRef.element;
                if (th2 == null) {
                }
                if (th2 instanceof StandardIntegrityException) {
                }
                throw new zzcg(zzceVar2, zzcdVar, e.getMessage(), null, 8, null);
            }
        }
        return Unit.INSTANCE;
    }
}
