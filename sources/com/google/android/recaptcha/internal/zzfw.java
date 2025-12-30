package com.google.android.recaptcha.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
final /* synthetic */ class zzfw extends FunctionReferenceImpl implements Function1 {
    zzfw(Object obj) {
        super(1, obj, zzgb.class, "isRetriable", "isRetriable(Ljava/lang/Exception;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(zzgb.zzo((zzgb) this.receiver, (Exception) obj));
    }
}
