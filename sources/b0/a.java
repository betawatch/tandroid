package b0;

import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class a {
    public static final int[] a = new int[0];
    public static final long[] b = new long[0];
    public static final Object[] c = new Object[0];

    public static final int a(int i9, int i10, int[] array) {
        i.e(array, "array");
        int i11 = i9 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = array[i13];
            if (i14 < i10) {
                i12 = i13 + 1;
            } else {
                if (i14 <= i10) {
                    return i13;
                }
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    public static final int b(long[] array, int i9, long j10) {
        i.e(array, "array");
        int i10 = i9 - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            long j11 = array[i12];
            if (j11 < j10) {
                i11 = i12 + 1;
            } else {
                if (j11 <= j10) {
                    return i12;
                }
                i10 = i12 - 1;
            }
        }
        return ~i11;
    }
}
