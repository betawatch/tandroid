// default package

import java.io.IOException;
import java.util.Locale;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ol2 extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ol2(int i, int i2) {
        super(r0.toString());
        StringBuilder sb = new StringBuilder(nm7.s1);
        sb.append("CodedOutputStream was writing to a flat byte array and ran out of space (pos ");
        sb.append(i);
        sb.append(" limit ");
        sb.append(i2);
        sb.append(").");
    }

    public /* synthetic */ ol2(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ol2(long j, long j2, int i, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(r3.toString()), indexOutOfBoundsException);
        Locale locale = Locale.US;
        StringBuilder o = wi8.o(j, "Pos: ", ", limit: ");
        o.append(j2);
        o.append(", len: ");
        o.append(i);
    }

    public ol2(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
    }
}
