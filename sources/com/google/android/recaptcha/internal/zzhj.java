package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function2;
import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class zzhj {
    public static final Object zza(zzhh zzhhVar, Function2 function2, Continuation continuation) {
        return function2.invoke(new zzhk(zzhhVar), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object zzb(zzhk zzhkVar, zzhf zzhfVar, Continuation continuation) {
        zzhi zzhiVar;
        int i;
        try {
            if (continuation instanceof zzhi) {
                zzhiVar = (zzhi) continuation;
                int i2 = zzhiVar.zzb;
                if ((i2 & TLObject.FLAG_31) != 0) {
                    zzhiVar.zzb = i2 - TLObject.FLAG_31;
                    Object obj = zzhiVar.zza;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzhiVar.zzb;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        zzhiVar.zzb = 1;
                        if (zzhfVar.zza(zzhkVar, zzhiVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            return Unit.INSTANCE;
        } catch (Exception unused) {
            return Unit.INSTANCE;
        }
        zzhiVar = new zzhi(continuation);
        Object obj2 = zzhiVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzhiVar.zzb;
    }

    public static final Object zzc(zzgr zzgrVar, zzhg zzhgVar, Continuation continuation) {
        Object zza = zzhgVar.zza(zzgrVar.zza(), continuation);
        return zza == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? zza : Unit.INSTANCE;
    }

    public static final Object zzd(int i, int i2, Function2 function2, Continuation continuation) {
        return new zzhf(i, function2, Boxing.boxInt(i2));
    }

    public static final Object zze(zzhk zzhkVar, int i, Function2 function2, Continuation continuation) {
        return new zzhf(i, function2, null).zza(zzhkVar, continuation);
    }
}
