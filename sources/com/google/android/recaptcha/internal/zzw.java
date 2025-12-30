package com.google.android.recaptcha.internal;

import android.content.ContentResolver;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class zzw implements Function0 {
    public static final zzw zza = new zzw();

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = zzby.zza;
        Object zzb = zzbx.zza().zzb(ContentResolver.class.getName().hashCode());
        if (zzb != null) {
            return (ContentResolver) zzb;
        }
        throw new zzcg(zzce.zzb, zzcd.zzaA, null, null, 12, null);
    }
}
