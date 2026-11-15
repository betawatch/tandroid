package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Locale;
import org.telegram.messenger.ns;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class l extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l(int i7, int i10) {
        super(r0.toString());
        StringBuilder sb2 = new StringBuilder(ns.t1);
        sb2.append("CodedOutputStream was writing to a flat byte array and ran out of space (pos ");
        sb2.append(i7);
        sb2.append(" limit ");
        sb2.append(i10);
        sb2.append(").");
    }

    public /* synthetic */ l(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l(long j3, long j10, int i7, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(r3.toString()), indexOutOfBoundsException);
        Locale locale = Locale.US;
        StringBuilder t6 = a8.p0.t(j3, "Pos: ", ", limit: ");
        t6.append(j10);
        t6.append(", len: ");
        t6.append(i7);
    }

    public l(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
    }
}
