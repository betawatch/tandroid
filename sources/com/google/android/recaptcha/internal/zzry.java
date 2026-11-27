package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class zzry {
    static final zzry zza = new zzry(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private final Map zzd;

    public zzry() {
        this.zzd = new HashMap();
    }

    public final zzsm zza(zzts zztsVar, int i) {
        return (zzsm) this.zzd.get(new zzrx(zztsVar, i));
    }

    public zzry(boolean z) {
        this.zzd = Collections.EMPTY_MAP;
    }
}
