package com.google.android.recaptcha.internal;

import a1.g;
import java.io.IOException;
import java.util.Locale;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class zzqt extends IOException {
    public zzqt() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzqt(long j10, long j11, int i10, Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(r3.toString()), th2);
        Locale locale = Locale.US;
        StringBuilder s10 = g.s(j10, "Pos: ", ", limit: ");
        s10.append(j11);
        s10.append(", len: ");
        s10.append(i10);
    }

    public zzqt(Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
    }
}
