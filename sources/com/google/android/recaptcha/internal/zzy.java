package com.google.android.recaptcha.internal;

import android.os.Build;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
final class zzy extends SuspendLambda implements Function2 {
    final /* synthetic */ zzz zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzy(zzz zzzVar, Continuation continuation) {
        super(2, continuation);
        this.zza = zzzVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzy(this.zza, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzy) create((zzhk) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        zzyu zzf = zzyx.zzf();
        zzz zzzVar = this.zza;
        zzyw zzb = zzz.zzb(zzzVar, Build.MANUFACTURER);
        zzyw zzb2 = zzz.zzb(zzzVar, Build.MODEL);
        zzyw zzb3 = zzz.zzb(zzzVar, Build.DEVICE);
        zzyw zzb4 = zzz.zzb(zzzVar, Build.HARDWARE);
        zzyw zzb5 = zzz.zzb(zzzVar, Build.FINGERPRINT);
        zzyw zzb6 = zzz.zzb(zzzVar, Build.PRODUCT);
        zzyw zzb7 = zzz.zzb(zzzVar, Build.BOARD);
        zzyw zzb8 = zzz.zzb(zzzVar, Build.BRAND);
        zzyw zzb9 = zzz.zzb(zzzVar, ArraysKt.joinToString$default(Build.SUPPORTED_ABIS, ",", "[", "]", 0, (CharSequence) null, (Function1) null, 56, (Object) null));
        long j = Build.TIME;
        zzyv zzf2 = zzyw.zzf();
        zzf2.zzv(j);
        zzf.zze(CollectionsKt.listOf((Object[]) new zzyw[]{zzb, zzb2, zzb3, zzb4, zzb5, zzb6, zzb7, zzb8, zzb9, (zzyw) zzf2.zzk(), zzz.zzb(zzzVar, Build.ID), zzz.zzb(zzzVar, Build.BOOTLOADER), zzz.zzb(zzzVar, Build.DISPLAY), zzz.zzb(zzzVar, Build.TYPE), zzz.zzb(zzzVar, Build.TAGS)}));
        return zzas.zzb(zzzVar, (zzyx) zzf.zzk());
    }
}
