package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
final class zzhw extends SuspendLambda implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzib zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ String zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzhw(zzib zzibVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.zzc = zzibVar;
        this.zzd = str;
        this.zze = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzhw zzhwVar = new zzhw(this.zzc, this.zzd, this.zze, continuation);
        zzhwVar.zzf = obj;
        return zzhwVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzhw) create((zzhk) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x008c, code lost:
    
        if (r11 != r0) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bf  */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16, types: [com.google.android.recaptcha.internal.zzhk] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ?? r1;
        zzhk zzhkVar;
        zzhk zzhkVar2;
        zzhk zzhkVar3;
        zzhf zzhfVar;
        String str;
        zzhk zzhkVar4;
        ?? r12;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zzb;
        try {
        } catch (Exception unused) {
            r1 = i;
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            zzhk zzhkVar5 = (zzhk) this.zzf;
            zzib zzibVar = this.zzc;
            String str2 = this.zzd;
            this.zzf = zzhkVar5;
            this.zza = zzhkVar5;
            this.zzb = 1;
            obj = new zzhf(25, new zzhx(zzibVar, str2, null), null);
            if (obj != coroutine_suspended) {
                zzhkVar4 = zzhkVar5;
                r12 = zzhkVar5;
            }
        }
        if (i != 1) {
            if (i == 2) {
                ?? r13 = (zzhk) this.zzf;
                ResultKt.throwOnFailure(obj);
                i = r13;
                return (String) obj;
            }
            if (i == 3) {
                zzhk zzhkVar6 = (zzhk) this.zza;
                zzhkVar = (zzhk) this.zzf;
                ResultKt.throwOnFailure(obj);
                zzhkVar2 = zzhkVar6;
                this.zzf = zzhkVar;
                this.zza = null;
                this.zzb = 4;
                obj = ((zzhf) obj).zza(zzhkVar2, this);
                if (obj != coroutine_suspended) {
                    zzhkVar3 = zzhkVar;
                    zzib zzibVar2 = this.zzc;
                    String str3 = this.zzd;
                    String str4 = (String) obj;
                    this.zzf = str4;
                    this.zza = zzhkVar3;
                    this.zzb = 5;
                    zzhfVar = new zzhf(24, new zzhy(zzibVar2, str3, str4, null), null);
                    if (zzhfVar != coroutine_suspended) {
                    }
                }
            }
            if (i != 4) {
                if (i != 5) {
                    String str5 = (String) this.zzf;
                    ResultKt.throwOnFailure(obj);
                    return str5;
                }
                zzhkVar3 = (zzhk) this.zza;
                str = (String) this.zzf;
                ResultKt.throwOnFailure(obj);
                this.zzf = str;
                this.zza = null;
                this.zzb = 6;
                return zzhj.zzb(zzhkVar3, (zzhf) obj, this) == coroutine_suspended ? str : coroutine_suspended;
            }
            zzhkVar3 = (zzhk) this.zzf;
            ResultKt.throwOnFailure(obj);
            zzib zzibVar22 = this.zzc;
            String str32 = this.zzd;
            String str42 = (String) obj;
            this.zzf = str42;
            this.zza = zzhkVar3;
            this.zzb = 5;
            zzhfVar = new zzhf(24, new zzhy(zzibVar22, str32, str42, null), null);
            if (zzhfVar != coroutine_suspended) {
                str = str42;
                obj = zzhfVar;
                this.zzf = str;
                this.zza = null;
                this.zzb = 6;
                if (zzhj.zzb(zzhkVar3, (zzhf) obj, this) == coroutine_suspended) {
                }
            }
        }
        zzhk zzhkVar7 = (zzhk) this.zza;
        zzhk zzhkVar8 = (zzhk) this.zzf;
        try {
            ResultKt.throwOnFailure(obj);
            zzhkVar4 = zzhkVar7;
            r12 = zzhkVar8;
        } catch (Exception unused2) {
            r1 = zzhkVar8;
            zzib zzibVar3 = this.zzc;
            zzib.zza(zzibVar3).zzb();
            String str6 = this.zze;
            this.zzf = r1;
            this.zza = r1;
            this.zzb = 3;
            obj = new zzhf(23, new zzhu(zzibVar3, str6, null), null);
            if (obj != coroutine_suspended) {
                zzhkVar = r1;
                zzhkVar2 = r1;
                this.zzf = zzhkVar;
                this.zza = null;
                this.zzb = 4;
                obj = ((zzhf) obj).zza(zzhkVar2, this);
                if (obj != coroutine_suspended) {
                }
            }
        }
        this.zzf = r12;
        this.zza = null;
        this.zzb = 2;
        obj = ((zzhf) obj).zza(zzhkVar4, this);
        i = r12;
    }
}
