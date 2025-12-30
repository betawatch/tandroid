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

    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
    
        if (r11 != r0) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
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
            return coroutine_suspended;
        }
        if (i == 1) {
            zzhk zzhkVar6 = (zzhk) this.zza;
            zzhk zzhkVar7 = (zzhk) this.zzf;
            try {
                ResultKt.throwOnFailure(obj);
                zzhkVar4 = zzhkVar6;
                r12 = zzhkVar7;
            } catch (Exception unused2) {
                r1 = zzhkVar7;
                zzib zzibVar2 = this.zzc;
                zzib.zza(zzibVar2).zzb();
                String str3 = this.zze;
                this.zzf = r1;
                this.zza = r1;
                this.zzb = 3;
                obj = new zzhf(23, new zzhu(zzibVar2, str3, null), null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                zzhkVar = r1;
                zzhkVar2 = r1;
                this.zzf = zzhkVar;
                this.zza = null;
                this.zzb = 4;
                obj = ((zzhf) obj).zza(zzhkVar2, this);
                if (obj != coroutine_suspended) {
                }
            }
        } else {
            if (i == 2) {
                ?? r13 = (zzhk) this.zzf;
                ResultKt.throwOnFailure(obj);
                i = r13;
                return (String) obj;
            }
            if (i == 3) {
                zzhk zzhkVar8 = (zzhk) this.zza;
                zzhkVar = (zzhk) this.zzf;
                ResultKt.throwOnFailure(obj);
                zzhkVar2 = zzhkVar8;
                this.zzf = zzhkVar;
                this.zza = null;
                this.zzb = 4;
                obj = ((zzhf) obj).zza(zzhkVar2, this);
                if (obj != coroutine_suspended) {
                    return coroutine_suspended;
                }
                zzhkVar3 = zzhkVar;
                zzib zzibVar3 = this.zzc;
                String str4 = this.zzd;
                String str5 = (String) obj;
                this.zzf = str5;
                this.zza = zzhkVar3;
                this.zzb = 5;
                zzhfVar = new zzhf(24, new zzhy(zzibVar3, str4, str5, null), null);
                if (zzhfVar != coroutine_suspended) {
                }
            } else {
                if (i != 4) {
                    if (i != 5) {
                        String str6 = (String) this.zzf;
                        ResultKt.throwOnFailure(obj);
                        return str6;
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
                zzib zzibVar32 = this.zzc;
                String str42 = this.zzd;
                String str52 = (String) obj;
                this.zzf = str52;
                this.zza = zzhkVar3;
                this.zzb = 5;
                zzhfVar = new zzhf(24, new zzhy(zzibVar32, str42, str52, null), null);
                if (zzhfVar != coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = str52;
                obj = zzhfVar;
                this.zzf = str;
                this.zza = null;
                this.zzb = 6;
                if (zzhj.zzb(zzhkVar3, (zzhf) obj, this) == coroutine_suspended) {
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
