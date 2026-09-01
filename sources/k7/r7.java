package k7;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
