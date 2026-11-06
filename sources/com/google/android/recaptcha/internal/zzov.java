package com.google.android.recaptcha.internal;

import java.io.Closeable;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
