package com.google.android.recaptcha.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class zzhg {
    private final Function2 zza;

    public zzhg(Function2 function2) {
        this.zza = function2;
    }

    public final Object zza(zzhk zzhkVar, Continuation continuation) {
        return this.zza.invoke(zzhkVar, continuation);
    }
}
