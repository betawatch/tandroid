package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.Locale;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class zzqt extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzqt(long j, long j2, int i, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(r3.toString()), th);
        Locale locale = Locale.US;
        StringBuilder o = ik8.o(j, "Pos: ", ", limit: ");
        o.append(j2);
        o.append(", len: ");
        o.append(i);
    }

    public zzqt() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzqt(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
