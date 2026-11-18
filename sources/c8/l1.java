package c8;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public abstract class l1 {
    public static long[] a(long[]... jArr) {
        long j3 = 0;
        for (long[] jArr2 : jArr) {
            j3 += jArr2.length;
        }
        int i7 = (int) j3;
        a8.la.d(j3, "the total number of elements (%s) in the arrays must fit in an int", j3 == ((long) i7));
        long[] jArr3 = new long[i7];
        int i10 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, i10, jArr4.length);
            i10 += jArr4.length;
        }
        return jArr3;
    }

    public static int b(long j3) {
        return (int) (j3 ^ (j3 >>> 32));
    }
}
