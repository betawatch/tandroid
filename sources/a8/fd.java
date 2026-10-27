package a8;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class fd {
    public static long[] a(long[]... jArr) {
        long j10 = 0;
        for (long[] jArr2 : jArr) {
            j10 += jArr2.length;
        }
        int i10 = (int) j10;
        yb.c(j10, "the total number of elements (%s) in the arrays must fit in an int", j10 == ((long) i10));
        long[] jArr3 = new long[i10];
        int i11 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, i11, jArr4.length);
            i11 += jArr4.length;
        }
        return jArr3;
    }

    public static int b(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }
}
