package com.google.android.recaptcha.internal;

import java.io.Closeable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class zzov implements Closeable {
    private static final ThreadLocal zza = new zzou();
    private int zzb = 0;

    public static int zza() {
        return ((zzov) zza.get()).zzb;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.zzb;
        if (i > 0) {
            this.zzb = i - 1;
        } else {
            hz6.e("Mismatched calls to RecursionDepth (possible error in core library)");
        }
    }
}
