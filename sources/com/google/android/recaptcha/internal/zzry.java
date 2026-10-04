package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes.dex */
public final class zzry {
    static final zzry zza = new zzry(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private final Map zzd;

    public zzry() {
        this.zzd = new HashMap();
    }

    public final zzsm zza(zzts zztsVar, int i10) {
        return (zzsm) this.zzd.get(new zzrx(zztsVar, i10));
    }

    public zzry(boolean z10) {
        this.zzd = Collections.EMPTY_MAP;
    }
}
