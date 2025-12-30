package com.google.android.recaptcha.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes.dex */
public final class zzht {
    private final Lazy zza;
    private final Lazy zzb;

    public zzht() {
        int i = zzby.zza;
        this.zza = LazyKt.lazy(zzhr.zza);
        this.zzb = LazyKt.lazy(zzhs.zza);
    }

    public static final /* synthetic */ zzhn zza(zzht zzhtVar) {
        return (zzhn) zzhtVar.zzb.getValue();
    }

    public static final /* synthetic */ zzig zzb(zzht zzhtVar) {
        return (zzig) zzhtVar.zza.getValue();
    }

    public final Object zzc(String str, zzzd zzzdVar, Continuation continuation) {
        return CoroutineScopeKt.coroutineScope(new zzhq(this, str, zzzdVar, null), continuation);
    }
}
