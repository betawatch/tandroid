package com.google.android.recaptcha.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class zzif {
    private final Lazy zza;

    public zzif() {
        int i = zzby.zza;
        this.zza = LazyKt.lazy(zzie.zza);
    }

    public static final /* synthetic */ zzhm zza(zzif zzifVar) {
        return (zzhm) zzifVar.zza.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object zzc(zzif zzifVar, zzcy zzcyVar, zzye zzyeVar, Continuation continuation) {
        zzic zzicVar;
        int i;
        if (continuation instanceof zzic) {
            zzicVar = (zzic) continuation;
            int i2 = zzicVar.zzc;
            if ((i2 & TLObject.FLAG_31) != 0) {
                zzicVar.zzc = i2 - TLObject.FLAG_31;
                Object obj = zzicVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzicVar.zzc;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                zzid zzidVar = new zzid(zzifVar, zzcyVar, zzyeVar, null);
                zzicVar.zzc = 1;
                Object coroutineScope = CoroutineScopeKt.coroutineScope(zzidVar, zzicVar);
                return coroutineScope == coroutine_suspended ? coroutine_suspended : coroutineScope;
            }
        }
        zzicVar = new zzic(zzifVar, continuation);
        Object obj2 = zzicVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzicVar.zzc;
        if (i == 0) {
        }
    }

    public final Object zzb(zzcy zzcyVar, zzye zzyeVar, Continuation continuation) {
        return zzc(this, zzcyVar, zzyeVar, continuation);
    }
}
