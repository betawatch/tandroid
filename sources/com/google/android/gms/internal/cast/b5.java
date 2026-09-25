package com.google.android.gms.internal.cast;

import java.io.IOException;
import java.util.Locale;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class b5 extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b5(int i10, int i11) {
        super(r0.toString());
        StringBuilder sb2 = new StringBuilder(108);
        sb2.append("CodedOutputStream was writing to a flat byte array and ran out of space (pos ");
        sb2.append(i10);
        sb2.append(" limit ");
        sb2.append(i11);
        sb2.append(").");
    }

    public /* synthetic */ b5(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b5(long j3, long j10, int i10, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(r3.toString()), indexOutOfBoundsException);
        Locale locale = Locale.US;
        StringBuilder u10 = a4.a.u(j3, "Pos: ", ", limit: ");
        u10.append(j10);
        u10.append(", len: ");
        u10.append(i10);
    }

    public b5(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
    }
}
