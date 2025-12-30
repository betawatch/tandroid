package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.TimeoutKt;
import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class zzcx {
    public static final zzcx zza = new zzcx();

    private zzcx() {
    }

    public static final Object zzc(long j, int i, long j2, long j3, double d, Function1 function1, Continuation continuation) {
        return TimeoutKt.withTimeout(j, new zzcw(20, 100L, 1000L, 2.0d, function1, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00c8 -> B:17:0x00ce). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(int i, long j, long j2, double d, Function1 function1, Continuation continuation) {
        zzcu zzcuVar;
        int i2;
        double d2;
        Ref$LongRef ref$LongRef;
        zzcu zzcuVar2;
        int i3;
        int i4;
        long j3;
        Function1 function12;
        Function1 function13;
        Ref$LongRef ref$LongRef2;
        long j4;
        double d3;
        int i5;
        int i6;
        long coerceAtMost;
        if (continuation instanceof zzcu) {
            zzcuVar = (zzcu) continuation;
            int i7 = zzcuVar.zzh;
            if ((i7 & TLObject.FLAG_31) != 0) {
                zzcuVar.zzh = i7 - TLObject.FLAG_31;
                Object obj = zzcuVar.zzf;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = zzcuVar.zzh;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref$LongRef ref$LongRef3 = new Ref$LongRef();
                    ref$LongRef3.element = j;
                    d2 = d;
                    ref$LongRef = ref$LongRef3;
                    zzcuVar2 = zzcuVar;
                    i3 = i - 1;
                    i4 = 0;
                    j3 = j2;
                    function12 = function1;
                    if (i4 < i3) {
                    }
                    return coroutine_suspended;
                }
                if (i2 == 1) {
                    i6 = zzcuVar.zze;
                    i5 = zzcuVar.zzd;
                    d3 = zzcuVar.zzb;
                    j4 = zzcuVar.zza;
                    ref$LongRef2 = zzcuVar.zzi;
                    function13 = (Function1) zzcuVar.zzc;
                    try {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    } catch (Exception unused) {
                        coerceAtMost = RangesKt.coerceAtMost((long) (ref$LongRef2.element * d3), j4);
                        ref$LongRef2.element = coerceAtMost;
                        zzcuVar.zzc = function13;
                        zzcuVar.zzi = ref$LongRef2;
                        zzcuVar.zza = j4;
                        zzcuVar.zzb = d3;
                        zzcuVar.zzd = i5;
                        zzcuVar.zze = i6;
                        zzcuVar.zzh = 2;
                        if (DelayKt.delay(coerceAtMost, zzcuVar) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                }
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                int i8 = zzcuVar.zze;
                int i9 = zzcuVar.zzd;
                double d4 = zzcuVar.zzb;
                j4 = zzcuVar.zza;
                Ref$LongRef ref$LongRef4 = zzcuVar.zzi;
                Function1 function14 = (Function1) zzcuVar.zzc;
                ResultKt.throwOnFailure(obj);
                zzcu zzcuVar3 = zzcuVar;
                int i10 = i8;
                int i11 = i9;
                d2 = d4;
                ref$LongRef = ref$LongRef4;
                function12 = function14;
                i4 = i10 + 1;
                j3 = j4;
                zzcuVar2 = zzcuVar3;
                i3 = i11;
                if (i4 < i3) {
                    try {
                    } catch (Exception unused2) {
                        function13 = function12;
                        i6 = i4;
                        ref$LongRef2 = ref$LongRef;
                        d3 = d2;
                        i5 = i3;
                        zzcuVar = zzcuVar2;
                        j4 = j3;
                        coerceAtMost = RangesKt.coerceAtMost((long) (ref$LongRef2.element * d3), j4);
                        ref$LongRef2.element = coerceAtMost;
                        zzcuVar.zzc = function13;
                        zzcuVar.zzi = ref$LongRef2;
                        zzcuVar.zza = j4;
                        zzcuVar.zzb = d3;
                        zzcuVar.zzd = i5;
                        zzcuVar.zze = i6;
                        zzcuVar.zzh = 2;
                        if (DelayKt.delay(coerceAtMost, zzcuVar) != coroutine_suspended) {
                            zzcuVar3 = zzcuVar;
                            i10 = i6;
                            i11 = i5;
                            d2 = d3;
                            ref$LongRef = ref$LongRef2;
                            function12 = function13;
                            i4 = i10 + 1;
                            j3 = j4;
                            zzcuVar2 = zzcuVar3;
                            i3 = i11;
                            if (i4 < i3) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    zzcuVar2.zzc = function12;
                    zzcuVar2.zzi = ref$LongRef;
                    zzcuVar2.zza = j3;
                    zzcuVar2.zzb = d2;
                    zzcuVar2.zzd = i3;
                    zzcuVar2.zze = i4;
                    zzcuVar2.zzh = 1;
                    Object invoke = function12.invoke(zzcuVar2);
                    if (invoke != coroutine_suspended) {
                        return invoke;
                    }
                } else {
                    zzcuVar2.zzc = null;
                    zzcuVar2.zzi = null;
                    zzcuVar2.zzh = 3;
                    Object invoke2 = function12.invoke(zzcuVar2);
                    if (invoke2 != coroutine_suspended) {
                        return invoke2;
                    }
                }
                return coroutine_suspended;
            }
        }
        zzcuVar = new zzcu(this, continuation);
        Object obj2 = zzcuVar.zzf;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = zzcuVar.zzh;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085 A[PHI: r0
      0x0085: PHI (r0v4 java.lang.Object) = (r0v6 java.lang.Object), (r0v1 java.lang.Object) binds: [B:14:0x0082, B:31:0x005e] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00b3 -> B:11:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb(Function1 function1, long j, long j2, double d, Function1 function12, Continuation continuation) {
        zzcv zzcvVar;
        int i;
        long j3;
        long j4;
        double d2;
        Function1 function13;
        zzcv zzcvVar2;
        Function1 function14;
        Function1 function15;
        long j5;
        double d3;
        Exception e;
        if (continuation instanceof zzcv) {
            zzcvVar = (zzcv) continuation;
            int i2 = zzcvVar.zzh;
            if ((i2 & TLObject.FLAG_31) != 0) {
                zzcvVar.zzh = i2 - TLObject.FLAG_31;
                Object obj = zzcvVar.zzf;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzcvVar.zzh;
                if (i == 0) {
                    if (i == 1) {
                        j3 = zzcvVar.zzd;
                        d3 = zzcvVar.zze;
                        j5 = zzcvVar.zzc;
                        function13 = (Function1) zzcvVar.zzb;
                        function15 = (Function1) zzcvVar.zza;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Exception e2) {
                            e = e2;
                            if (((Boolean) function15.invoke(e)).booleanValue()) {
                            }
                        }
                    }
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j3 = zzcvVar.zzd;
                    d3 = zzcvVar.zze;
                    j5 = zzcvVar.zzc;
                    function13 = (Function1) zzcvVar.zzb;
                    function15 = (Function1) zzcvVar.zza;
                    ResultKt.throwOnFailure(obj);
                    Function1 function16 = function15;
                    zzcvVar2 = zzcvVar;
                    function14 = function16;
                    double d4 = d3;
                    j4 = j5;
                    d2 = d4;
                    try {
                    } catch (Exception e3) {
                        e = e3;
                        zzcv zzcvVar3 = zzcvVar2;
                        function15 = function14;
                        zzcvVar = zzcvVar3;
                        long j6 = j4;
                        d3 = d2;
                        j5 = j6;
                        if (((Boolean) function15.invoke(e)).booleanValue()) {
                            throw e;
                        }
                        j3 = RangesKt.coerceAtMost((long) (j3 * d3), j5);
                        zzcvVar.zza = function15;
                        zzcvVar.zzb = function13;
                        zzcvVar.zzc = j5;
                        zzcvVar.zze = d3;
                        zzcvVar.zzd = j3;
                        zzcvVar.zzh = 2;
                        if (DelayKt.delay(j3, zzcvVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Function1 function162 = function15;
                        zzcvVar2 = zzcvVar;
                        function14 = function162;
                        double d42 = d3;
                        j4 = j5;
                        d2 = d42;
                        zzcvVar2.zza = function14;
                        zzcvVar2.zzb = function13;
                        zzcvVar2.zzc = j4;
                        zzcvVar2.zze = d2;
                        zzcvVar2.zzd = j3;
                        zzcvVar2.zzh = 1;
                        obj = function13.invoke(zzcvVar2);
                        if (obj == coroutine_suspended) {
                        }
                    }
                    zzcvVar2.zza = function14;
                    zzcvVar2.zzb = function13;
                    zzcvVar2.zzc = j4;
                    zzcvVar2.zze = d2;
                    zzcvVar2.zzd = j3;
                    zzcvVar2.zzh = 1;
                    obj = function13.invoke(zzcvVar2);
                    return obj == coroutine_suspended ? coroutine_suspended : obj;
                }
                ResultKt.throwOnFailure(obj);
                j3 = j;
                j4 = j2;
                d2 = d;
                function13 = function12;
                zzcvVar2 = zzcvVar;
                function14 = function1;
                zzcvVar2.zza = function14;
                zzcvVar2.zzb = function13;
                zzcvVar2.zzc = j4;
                zzcvVar2.zze = d2;
                zzcvVar2.zzd = j3;
                zzcvVar2.zzh = 1;
                obj = function13.invoke(zzcvVar2);
                if (obj == coroutine_suspended) {
                }
            }
        }
        zzcvVar = new zzcv(this, continuation);
        Object obj2 = zzcvVar.zzf;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzcvVar.zzh;
        if (i == 0) {
        }
    }
}
