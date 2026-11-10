package com.google.android.recaptcha.internal;

import java.io.Closeable;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class zzov implements Closeable {
    private static final ThreadLocal zza = new zzou();
    private int zzb = 0;

    public static int zza() {
        return ((zzov) zza.get()).zzb;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i7 = this.zzb;
        if (i7 <= 0) {
            throw new AssertionError("Mismatched calls to RecursionDepth (possible error in core library)");
        }
        this.zzb = i7 - 1;
    }
}
