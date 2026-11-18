package c8;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public abstract class d0 {
    public static void a(int i7, int i10, int i11) {
        if (i7 < 0 || i10 > i11) {
            StringBuilder n10 = i5.c.n("fromIndex: ", i7, ", toIndex: ", i10, ", size: ");
            n10.append(i11);
            throw new IndexOutOfBoundsException(n10.toString());
        }
        if (i7 > i10) {
            throw new IllegalArgumentException(a8.p0.m(i7, i10, "fromIndex: ", " > toIndex: "));
        }
    }
}
