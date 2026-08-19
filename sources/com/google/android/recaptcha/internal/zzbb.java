package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
final class zzbb extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzbo zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbb(zzbo zzboVar, String str, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzboVar;
        this.zzc = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzbb zzbbVar = new zzbb(this.zzb, this.zzc, continuation);
        zzbbVar.zzd = obj;
        return zzbbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbb) create((zzhk) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006a, code lost:
    
        return (java.lang.String) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhg) r7).zza(r1, r6) != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003b, code lost:
    
        if (r7 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
    
        if (r7 != r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r1 != 3) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005a, code lost:
    
        r7 = r6.zzb;
        r1 = r6.zzc;
        r6.zza = 4;
        r7 = r7.zzm(r1, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0065, code lost:
    
        if (r7 != r0) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        Object obj2 = this.zza;
        try {
        } catch (Exception unused) {
            zzbo zzboVar = this.zzb;
            this.zzd = obj2;
            this.zza = 2;
            obj = zzboVar.zze(this);
            zzhkVar = obj2;
        }
        if (obj2 == 0) {
            ResultKt.throwOnFailure(obj);
            zzhk zzhkVar2 = (zzhk) this.zzd;
            zzbo zzboVar2 = this.zzb;
            String str = this.zzc;
            this.zzd = zzhkVar2;
            this.zza = 1;
            obj = zzboVar2.zzm(str, this);
            obj2 = zzhkVar2;
        } else if (obj2 == 1) {
            zzhk zzhkVar3 = (zzhk) this.zzd;
            ResultKt.throwOnFailure(obj);
            obj2 = zzhkVar3;
        } else if (obj2 != 2) {
            ResultKt.throwOnFailure(obj);
        } else {
            zzhk zzhkVar4 = (zzhk) this.zzd;
            ResultKt.throwOnFailure(obj);
            zzhkVar = zzhkVar4;
            this.zzd = null;
            this.zza = 3;
        }
        return (String) obj;
    }
}
