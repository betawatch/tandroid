package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzry {
    static final zzry zza = new zzry(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private final Map zzd;

    zzry() {
        this.zzd = new HashMap();
    }

    public final zzsm zza(zzts zztsVar, int i) {
        return (zzsm) this.zzd.get(new zzrx(zztsVar, i));
    }

    zzry(boolean z) {
        this.zzd = Collections.emptyMap();
    }
}
