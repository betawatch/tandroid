package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
final class zzlf extends SuspendLambda implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzly zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzlf(zzly zzlyVar, Continuation continuation) {
        super(2, continuation);
        this.zzc = zzlyVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzlf(this.zzc, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlf) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006c, code lost:
    
        ((android.webkit.WebView) r7).setWebViewClient(new com.google.android.recaptcha.internal.zzle(r6.zzc));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007a, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        if (r7 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if (r7 != r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002e, code lost:
    
        if (r7 != r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r1 != 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0057, code lost:
    
        r1 = r6.zzc;
        ((android.webkit.WebView) r7).addJavascriptInterface(r1.zzr(), "RN");
        r6.zzb = 4;
        r7 = r1.zzv(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0069, code lost:
    
        if (r7 != r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x007b, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zzb;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            zzly zzlyVar = this.zzc;
            this.zzb = 1;
            obj = zzlyVar.zzv(this);
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i != 2) {
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            ((WebView) obj).getSettings().setJavaScriptEnabled(true);
            zzly zzlyVar2 = this.zzc;
            this.zza = null;
            this.zzb = 3;
            obj = zzlyVar2.zzv(this);
        }
        ((WebView) obj).removeJavascriptInterface("RN");
        zzly zzlyVar3 = this.zzc;
        this.zza = zzlyVar3;
        this.zzb = 2;
        obj = zzlyVar3.zzv(this);
    }
}
