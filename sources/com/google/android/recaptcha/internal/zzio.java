package com.google.android.recaptcha.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
final class zzio extends SuspendLambda implements Function2 {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zziz zzd;
    final /* synthetic */ zzip zze;
    final /* synthetic */ String zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzio(zziz zzizVar, zzip zzipVar, String str, Continuation continuation) {
        super(2, continuation);
        this.zzd = zzizVar;
        this.zze = zzipVar;
        this.zzf = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzio(this.zzd, this.zze, this.zzf, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzio) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
    
        if (r7 != r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object zzh;
        zzkt zzktVar;
        Object zzg;
        zzzq zzzqVar;
        zzmf zzmfVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zzc;
        try {
        } catch (Exception e) {
            zzip zzipVar = this.zze;
            zziz zzizVar = this.zzd;
            this.zza = null;
            this.zzb = null;
            this.zzc = 2;
            zzh = zzipVar.zzh(e, zzizVar, this);
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            zziz zzizVar2 = this.zzd;
            zzizVar2.zza = new zzcs();
            zzzq zzi = zzzq.zzi(zzpp.zzh().zzj(this.zzf));
            zzi.zzf();
            zzip zzipVar2 = this.zze;
            zzktVar = zzipVar2.zzc;
            zzzo zza = zzktVar.zza(zzi);
            zzmf zzb = zzmf.zzb();
            List zzi2 = zza.zzi();
            this.zza = zzi;
            this.zzb = zzb;
            this.zzc = 1;
            zzg = zzipVar2.zzg(zzi2, zzizVar2, this);
            if (zzg != coroutine_suspended) {
                zzzqVar = zzi;
                zzmfVar = zzb;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        zzmfVar = (zzmf) this.zzb;
        zzzqVar = (zzzq) this.zza;
        ResultKt.throwOnFailure(obj);
        zzmfVar.zzf();
        Boxing.boxLong(zzmfVar.zza(TimeUnit.MICROSECONDS));
        zzzqVar.zzf();
        return Unit.INSTANCE;
    }
}
