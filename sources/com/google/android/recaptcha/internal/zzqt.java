package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zzqt extends IOException {
    zzqt() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    zzqt(long j, long j2, int i, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i))), th);
    }

    zzqt(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
