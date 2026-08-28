package com.google.android.recaptcha.internal;

import java.io.Closeable;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class zzov implements Closeable {
    private static final ThreadLocal zza = new zzou();
    private int zzb = 0;

    public static int zza() {
        return ((zzov) zza.get()).zzb;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i9 = this.zzb;
        if (i9 <= 0) {
            throw new AssertionError("Mismatched calls to RecursionDepth (possible error in core library)");
        }
        this.zzb = i9 - 1;
    }
}
