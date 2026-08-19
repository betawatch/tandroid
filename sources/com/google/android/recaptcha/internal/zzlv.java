package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
final class zzlv extends SuspendLambda implements Function2 {
    Object zza;
    Object zzb;
    Object zzc;
    Object zzd;
    int zze;
    final /* synthetic */ zzly zzf;
    final /* synthetic */ zzgr zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzlv(zzly zzlyVar, zzgr zzgrVar, Continuation continuation) {
        super(2, continuation);
        this.zzf = zzlyVar;
        this.zzg = zzgrVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzlv(this.zzf, this.zzg, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlv) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e2, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00cc, code lost:
    
        if (r10.await(r9) != r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b3, code lost:
    
        if (com.google.android.recaptcha.internal.zzhj.zzc(r1, (com.google.android.recaptcha.internal.zzhg) r10, r9) != r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a7, code lost:
    
        if (r10 != r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r1 != 4) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00ce, code lost:
    
        r10 = r9.zzf.zzn();
        r1 = com.google.android.recaptcha.internal.zzmc.zzc;
        r9.zze = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00dd, code lost:
    
        if (r10.zzc(r1, r9) != r0) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzly zzlyVar;
        zzxn zzxnVar;
        zzdo zzdoVar;
        zzxn zzxnVar2;
        zzxn zzxnVar3;
        zzly zzlyVar2;
        zzmf zzmfVar;
        zzmf zzmfVar2;
        zzgr zzgrVar;
        zzxn zzxnVar4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zze;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            zzlyVar = this.zzf;
            zzxnVar = zzlyVar.zze;
            if (zzxnVar == null) {
                zzxnVar = null;
            }
            zzxnVar2 = zzlyVar.zze;
            if (zzxnVar2 == null) {
                zzxnVar2 = null;
            }
            zzdoVar = new zzdo(zzxnVar2.zzf());
            this.zza = zzlyVar;
            this.zzb = zzlyVar;
            this.zzc = zzxnVar;
            this.zzd = zzdoVar;
            this.zze = 1;
            Object zzv = zzlyVar.zzv(this);
            if (zzv != coroutine_suspended) {
                zzxnVar3 = zzxnVar;
                obj = zzv;
                zzlyVar2 = zzlyVar;
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            zzdoVar = (zzdo) this.zzd;
            zzxnVar3 = (zzxn) this.zzc;
            zzlyVar = (zzly) this.zzb;
            zzlyVar2 = (zzly) this.zza;
            ResultKt.throwOnFailure(obj);
        } else if (i != 2) {
            ResultKt.throwOnFailure(obj);
            if (i != 3) {
            }
            zzly zzlyVar3 = this.zzf;
            Boxing.boxInt(zzlyVar3.zzz().hashCode());
            CompletableDeferred zzz = zzlyVar3.zzz();
            this.zze = 4;
        } else {
            zzgrVar = (zzgr) this.zza;
            ResultKt.throwOnFailure(obj);
            this.zza = null;
            this.zze = 3;
        }
        zzlyVar2.zzb = zzlyVar.zzB(zzxnVar3, zzdoVar, (WebView) obj);
        zzly zzlyVar4 = this.zzf;
        Boxing.boxInt(zzlyVar4.zzz().hashCode());
        zzmfVar = zzlyVar4.zzg;
        zzmfVar.zzd();
        zzmfVar2 = zzlyVar4.zzg;
        zzmfVar2.zze();
        zzgrVar = this.zzg;
        zzxnVar4 = zzlyVar4.zze;
        if (zzxnVar4 == null) {
            zzxnVar4 = null;
        }
        this.zza = zzgrVar;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = 2;
        obj = new zzhg(new zzlh(zzlyVar4, zzxnVar4, null));
    }
}
