package com.google.android.recaptcha.internal;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes.dex */
final class zzim extends SuspendLambda implements Function2 {
    public static final /* synthetic */ int zze = 0;
    int zza;
    final /* synthetic */ zziz zzb;
    final /* synthetic */ List zzc;
    final /* synthetic */ zzip zzd;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzim(zziz zzizVar, List list, zzip zzipVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzizVar;
        this.zzc = list;
        this.zzd = zzipVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzim zzimVar = new zzim(this.zzb, this.zzc, this.zzd, continuation);
        zzimVar.zzf = obj;
        return zzimVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzim) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object zzh;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        ResultKt.throwOnFailure(obj);
        if (i == 0) {
            CoroutineScope coroutineScope = (CoroutineScope) this.zzf;
            while (true) {
                zziz zzizVar = this.zzb;
                if (zzizVar.zza() < 0) {
                    break;
                }
                List list = this.zzc;
                if (zzizVar.zza() >= list.size() || !CoroutineScopeKt.isActive(coroutineScope)) {
                    break;
                }
                zzzu zzzuVar = (zzzu) list.get(zzizVar.zza());
                try {
                    zzip.zzf(this.zzd, zzzuVar, zzizVar);
                } catch (Exception e) {
                    zzzuVar.zzk();
                    Boxing.boxInt(zzzuVar.zzg());
                    List zzj = zzzuVar.zzj();
                    final zzip zzipVar = this.zzd;
                    CollectionsKt.joinToString$default(zzj, null, null, null, 0, null, new Function1(zzipVar) { // from class: com.google.android.recaptcha.internal.zzil
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Intrinsics.checkNotNull((zzzt) obj2);
                            return "";
                        }
                    }, 31, null);
                    zziz zzizVar2 = this.zzb;
                    this.zza = 1;
                    zzh = zzipVar.zzh(e, zzizVar2, this);
                    if (zzh == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
