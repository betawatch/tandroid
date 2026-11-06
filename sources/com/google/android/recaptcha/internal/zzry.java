package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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

    public zzry(boolean z9) {
        this.zzd = Collections.EMPTY_MAP;
    }
}
