package com.google.android.recaptcha.internal;

import android.content.Context;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class zzkz implements zzlb {
    private final Context zza;

    public zzkz(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.recaptcha.internal.zzlb
    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzla.zza(this, objArr);
    }

    @Override // com.google.android.recaptcha.internal.zzlb
    public final Object zza(Object... objArr) {
        return this.zza.getSharedPreferences("_GRECAPTCHA", 0);
    }
}
