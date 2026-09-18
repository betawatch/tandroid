package com.google.android.recaptcha.internal;

import java.io.Closeable;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class zzov implements Closeable {
    private static final ThreadLocal zza = new zzou();
    private int zzb = 0;

    public static int zza() {
        return ((zzov) zza.get()).zzb;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i10 = this.zzb;
        if (i10 <= 0) {
            throw new AssertionError("Mismatched calls to RecursionDepth (possible error in core library)");
        }
        this.zzb = i10 - 1;
    }
}
