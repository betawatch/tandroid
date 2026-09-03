package k7;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class q7 {
    public static void a(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            StringBuilder m9 = e2.c.m("fromIndex: ", i10, ", toIndex: ", i11, ", size: ");
            m9.append(i12);
            throw new IndexOutOfBoundsException(m9.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(android.support.v4.media.a.k(i10, i11, "fromIndex: ", " > toIndex: "));
        }
    }
}
