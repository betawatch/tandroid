package k7;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class r7 {
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
