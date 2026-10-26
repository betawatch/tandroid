package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
