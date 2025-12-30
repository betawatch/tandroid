package com.google.android.recaptcha.internal;

import java.util.concurrent.Executors;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorsKt;

/* loaded from: classes.dex */
public final class zzcm implements zzcr {
    private final CoroutineScope zza = CoroutineScopeKt.MainScope();
    private final CoroutineScope zzb;
    private final CoroutineScope zzc;
    private final CoroutineScope zzd;

    public zzcm() {
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(Executors.newSingleThreadExecutor()));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new zzcl(null), 3, null);
        this.zzb = CoroutineScope;
        this.zzc = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());
        CoroutineScope CoroutineScope2 = CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(Executors.newSingleThreadExecutor()));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope2, null, null, new zzck(null), 3, null);
        this.zzd = CoroutineScope2;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(Executors.newSingleThreadExecutor())), null, null, new zzcj(null), 3, null);
    }

    @Override // com.google.android.recaptcha.internal.zzcr
    public final CoroutineScope zza() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzcr
    public final CoroutineScope zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzcr
    public final CoroutineScope zzc() {
        return this.zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzcr
    public final CoroutineScope zzd() {
        return this.zzb;
    }
}
