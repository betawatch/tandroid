package com.google.android.recaptcha.internal;

import a1.g;
import java.io.IOException;
import java.util.Locale;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        StringBuilder t10 = g.t(j10, "Pos: ", ", limit: ");
        t10.append(j11);
        t10.append(", len: ");
        t10.append(i10);
    }

    public zzqt(Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
    }
}
