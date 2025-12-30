package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class zzhf {
    private final Function2 zza;
    private final Integer zzb;
    private final int zzc;

    public zzhf(int i, Function2 function2, Integer num) {
        this.zzc = i;
        this.zza = function2;
        this.zzb = num;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(zzhk zzhkVar, Continuation continuation) {
        zzhe zzheVar;
        int i;
        zzcg e;
        zzgr zzgrVar;
        if (continuation instanceof zzhe) {
            zzheVar = (zzhe) continuation;
            int i2 = zzheVar.zzc;
            if ((i2 & TLObject.FLAG_31) != 0) {
                zzheVar.zzc = i2 - TLObject.FLAG_31;
                Object obj = zzheVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzheVar.zzc;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    zzgr zzgrVar2 = new zzgr(zzhkVar, this.zzc, this.zzb);
                    try {
                        Function2 function2 = this.zza;
                        zzheVar.zzd = zzgrVar2;
                        zzheVar.zzc = 1;
                        obj = function2.invoke(zzgrVar2, zzheVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        zzgrVar = zzgrVar2;
                    } catch (zzcg e2) {
                        e = e2;
                        zzgrVar = zzgrVar2;
                        zzgrVar.zzc(e);
                        throw e;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zzgrVar = zzheVar.zzd;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (zzcg e3) {
                        e = e3;
                        zzgrVar.zzc(e);
                        throw e;
                    }
                }
                zzgrVar.zzb();
                return obj;
            }
        }
        zzheVar = new zzhe(this, continuation);
        Object obj2 = zzheVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzheVar.zzc;
        if (i != 0) {
        }
        zzgrVar.zzb();
        return obj2;
    }
}
