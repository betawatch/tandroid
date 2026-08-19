package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.ranges.RangesKt;
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

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c4, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r5, r1) != r3) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00c4 -> B:17:0x004f). Please report as a decompilation issue!!! */
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
                    if (i4 >= i3) {
                    }
                    return coroutine_suspended;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    i6 = zzcuVar.zze;
                    i5 = zzcuVar.zzd;
                    d3 = zzcuVar.zzb;
                    j4 = zzcuVar.zza;
                    ref$LongRef2 = zzcuVar.zzi;
                    function13 = (Function1) zzcuVar.zzc;
                    ResultKt.throwOnFailure(obj);
                    zzcu zzcuVar3 = zzcuVar;
                    int i8 = i6;
                    int i9 = i5;
                    d2 = d3;
                    ref$LongRef = ref$LongRef2;
                    function12 = function13;
                    i4 = i8 + 1;
                    j3 = j4;
                    zzcuVar2 = zzcuVar3;
                    i3 = i9;
                    if (i4 >= i3) {
                        try {
                        } catch (Exception unused) {
                            function13 = function12;
                            i6 = i4;
                            ref$LongRef2 = ref$LongRef;
                            d3 = d2;
                            i5 = i3;
                            zzcuVar = zzcuVar2;
                            j4 = j3;
                            long coerceAtMost = RangesKt.coerceAtMost((long) (ref$LongRef2.element * d3), j4);
                            ref$LongRef2.element = coerceAtMost;
                            zzcuVar.zzc = function13;
                            zzcuVar.zzi = ref$LongRef2;
                            zzcuVar.zza = j4;
                            zzcuVar.zzb = d3;
                            zzcuVar.zzd = i5;
                            zzcuVar.zze = i6;
                            zzcuVar.zzh = 2;
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
                i6 = zzcuVar.zze;
                i5 = zzcuVar.zzd;
                d3 = zzcuVar.zzb;
                j4 = zzcuVar.zza;
                ref$LongRef2 = zzcuVar.zzi;
                function13 = (Function1) zzcuVar.zzc;
                try {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                } catch (Exception unused2) {
                    long coerceAtMost2 = RangesKt.coerceAtMost((long) (ref$LongRef2.element * d3), j4);
                    ref$LongRef2.element = coerceAtMost2;
                    zzcuVar.zzc = function13;
                    zzcuVar.zzi = ref$LongRef2;
                    zzcuVar.zza = j4;
                    zzcuVar.zzb = d3;
                    zzcuVar.zzd = i5;
                    zzcuVar.zze = i6;
                    zzcuVar.zzh = 2;
                }
            }
        }
        zzcuVar = new zzcu(this, continuation);
        Object obj2 = zzcuVar.zzf;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = zzcuVar.zzh;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00af, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r7, r1) != r3) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00af -> B:11:0x003f). Please report as a decompilation issue!!! */
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
                if (i != 0) {
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
                    Object invoke = function13.invoke(zzcvVar2);
                    if (invoke != coroutine_suspended) {
                    }
                } else {
                    if (i != 1) {
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
                        long j6 = j5;
                        d2 = d3;
                        j4 = j6;
                        try {
                        } catch (Exception e2) {
                            e = e2;
                            zzcv zzcvVar3 = zzcvVar2;
                            function15 = function14;
                            zzcvVar = zzcvVar3;
                            double d4 = d2;
                            j5 = j4;
                            d3 = d4;
                            if (((Boolean) function15.invoke(e)).booleanValue()) {
                            }
                        }
                        zzcvVar2.zza = function14;
                        zzcvVar2.zzb = function13;
                        zzcvVar2.zzc = j4;
                        zzcvVar2.zze = d2;
                        zzcvVar2.zzd = j3;
                        zzcvVar2.zzh = 1;
                        Object invoke2 = function13.invoke(zzcvVar2);
                        return invoke2 != coroutine_suspended ? coroutine_suspended : invoke2;
                    }
                    j3 = zzcvVar.zzd;
                    d3 = zzcvVar.zze;
                    j5 = zzcvVar.zzc;
                    function13 = (Function1) zzcvVar.zzb;
                    function15 = (Function1) zzcvVar.zza;
                    try {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    } catch (Exception e3) {
                        e = e3;
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
                    }
                }
            }
        }
        zzcvVar = new zzcv(this, continuation);
        Object obj2 = zzcvVar.zzf;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzcvVar.zzh;
        if (i != 0) {
        }
    }
}
