package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class zzry {
    static final zzry zza = new zzry(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private final Map zzd;

    public zzry() {
        this.zzd = new HashMap();
    }

    public final zzsm zza(zzts zztsVar, int i7) {
        return (zzsm) this.zzd.get(new zzrx(zztsVar, i7));
    }

    public zzry(boolean z10) {
        this.zzd = Collections.EMPTY_MAP;
    }
}
