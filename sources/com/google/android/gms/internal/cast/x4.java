package com.google.android.gms.internal.cast;

import java.io.IOException;
import java.util.Locale;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class x4 extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x4(int i10, int i11) {
        super(r0.toString());
        StringBuilder sb2 = new StringBuilder(zs.t1);
        sb2.append("CodedOutputStream was writing to a flat byte array and ran out of space (pos ");
        sb2.append(i10);
        sb2.append(" limit ");
        sb2.append(i11);
        sb2.append(").");
    }

    public /* synthetic */ x4(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x4(long j10, long j11, int i10, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(r3.toString()), indexOutOfBoundsException);
        Locale locale = Locale.US;
        StringBuilder s10 = a1.g.s(j10, "Pos: ", ", limit: ");
        s10.append(j11);
        s10.append(", len: ");
        s10.append(i10);
    }

    public x4(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
    }
}
