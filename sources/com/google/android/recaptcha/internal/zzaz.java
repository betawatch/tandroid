package com.google.android.recaptcha.internal;

import android.app.Application;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class zzaz implements Function0 {
    public static final zzaz zza = new zzaz();

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = zzby.zza;
        Object zzb = zzbx.zza().zzb(Application.class.getName().hashCode());
        if (zzb != null) {
            return (Application) zzb;
        }
        throw new zzcg(zzce.zzb, zzcd.zzaA, null, null, 12, null);
    }
}
