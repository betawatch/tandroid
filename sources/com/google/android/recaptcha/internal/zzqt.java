package com.google.android.recaptcha.internal;

import aa.d;
import java.io.IOException;
import java.util.Locale;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class zzqt extends IOException {
    public zzqt() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzqt(long j10, long j11, int i9, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(r3.toString()), th);
        Locale locale = Locale.US;
        StringBuilder s10 = d.s(j10, "Pos: ", ", limit: ");
        s10.append(j11);
        s10.append(", len: ");
        s10.append(i9);
    }

    public zzqt(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
