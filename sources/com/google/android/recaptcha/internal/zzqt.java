package com.google.android.recaptcha.internal;

import a8.p0;
import java.io.IOException;
import java.util.Locale;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class zzqt extends IOException {
    public zzqt() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzqt(long j3, long j10, int i7, Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(r3.toString()), th2);
        Locale locale = Locale.US;
        StringBuilder t6 = p0.t(j3, "Pos: ", ", limit: ");
        t6.append(j10);
        t6.append(", len: ");
        t6.append(i7);
    }

    public zzqt(Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
    }
}
