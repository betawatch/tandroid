package com.google.android.recaptcha.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class zzib {
    private final Lazy zza;
    private final Lazy zzb;

    public zzib() {
        int i = zzby.zza;
        this.zza = LazyKt.lazy(zzhz.zza);
        this.zzb = LazyKt.lazy(zzia.zza);
    }

    public static final /* synthetic */ zzbt zza(zzib zzibVar) {
        return (zzbt) zzibVar.zza.getValue();
    }

    public static final /* synthetic */ zzhn zzb(zzib zzibVar) {
        return (zzhn) zzibVar.zzb.getValue();
    }

    public final Object zzc(zzxn zzxnVar, Continuation continuation) {
        return new zzhg(new zzhv(this, zzxnVar, null));
    }
}
