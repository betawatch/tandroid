package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class zzdj {
    private Object zza;
    private final Mutex zzb = MutexKt.Mutex$default(false, 1, null);

    public zzdj(Object obj) {
        this.zza = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(Object obj, Continuation continuation) {
        zzdg zzdgVar;
        int i;
        Mutex mutex;
        try {
            if (continuation instanceof zzdg) {
                zzdgVar = (zzdg) continuation;
                int i2 = zzdgVar.zzd;
                if ((i2 & TLObject.FLAG_31) != 0) {
                    zzdgVar.zzd = i2 - TLObject.FLAG_31;
                    Object obj2 = zzdgVar.zzb;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzdgVar.zzd;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj2);
                        mutex = this.zzb;
                        zzdgVar.zze = (zzmc) obj;
                        zzdgVar.zza = mutex;
                        zzdgVar.zzd = 1;
                        if (mutex.lock(null, zzdgVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Mutex mutex2 = (Mutex) zzdgVar.zza;
                        zzmc zzmcVar = zzdgVar.zze;
                        ResultKt.throwOnFailure(obj2);
                        mutex = mutex2;
                        obj = zzmcVar;
                    }
                    return Boxing.boxBoolean(Intrinsics.areEqual(this.zza, obj));
                }
            }
            return Boxing.boxBoolean(Intrinsics.areEqual(this.zza, obj));
        } finally {
            mutex.unlock(null);
        }
        zzdgVar = new zzdg(this, continuation);
        Object obj22 = zzdgVar.zzb;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzdgVar.zzd;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb(Object[] objArr, Continuation continuation) {
        zzdh zzdhVar;
        int i;
        Mutex mutex;
        try {
            if (continuation instanceof zzdh) {
                zzdhVar = (zzdh) continuation;
                int i2 = zzdhVar.zzd;
                if ((i2 & TLObject.FLAG_31) != 0) {
                    zzdhVar.zzd = i2 - TLObject.FLAG_31;
                    Object obj = zzdhVar.zzb;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzdhVar.zzd;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.zzb;
                        zzdhVar.zze = (zzmc[]) objArr;
                        zzdhVar.zza = mutex;
                        zzdhVar.zzd = 1;
                        if (mutex.lock(null, zzdhVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Mutex mutex2 = (Mutex) zzdhVar.zza;
                        zzmc[] zzmcVarArr = zzdhVar.zze;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex2;
                        objArr = zzmcVarArr;
                    }
                    return Boxing.boxBoolean(ArraysKt.contains(objArr, this.zza));
                }
            }
            return Boxing.boxBoolean(ArraysKt.contains(objArr, this.zza));
        } finally {
            mutex.unlock(null);
        }
        zzdhVar = new zzdh(this, continuation);
        Object obj2 = zzdhVar.zzb;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzdhVar.zzd;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(Object obj, Continuation continuation) {
        zzdi zzdiVar;
        int i;
        Mutex mutex;
        try {
            if (continuation instanceof zzdi) {
                zzdiVar = (zzdi) continuation;
                int i2 = zzdiVar.zzd;
                if ((i2 & TLObject.FLAG_31) != 0) {
                    zzdiVar.zzd = i2 - TLObject.FLAG_31;
                    Object obj2 = zzdiVar.zzb;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzdiVar.zzd;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj2);
                        mutex = this.zzb;
                        zzdiVar.zze = (zzmc) obj;
                        zzdiVar.zza = mutex;
                        zzdiVar.zzd = 1;
                        if (mutex.lock(null, zzdiVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Mutex mutex2 = (Mutex) zzdiVar.zza;
                        zzmc zzmcVar = zzdiVar.zze;
                        ResultKt.throwOnFailure(obj2);
                        mutex = mutex2;
                        obj = zzmcVar;
                    }
                    this.zza = obj;
                    Unit unit = Unit.INSTANCE;
                    mutex.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            this.zza = obj;
            Unit unit2 = Unit.INSTANCE;
            mutex.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        zzdiVar = new zzdi(this, continuation);
        Object obj22 = zzdiVar.zzb;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzdiVar.zzd;
        if (i != 0) {
        }
    }
}
