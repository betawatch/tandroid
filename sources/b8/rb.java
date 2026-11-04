package b8;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class rb {
    public static void a(int i3, int i10, int i11) {
        if (i3 < 0 || i10 > i11) {
            StringBuilder m10 = com.google.android.recaptcha.internal.a.m("fromIndex: ", i3, ", toIndex: ", i10, ", size: ");
            m10.append(i11);
            throw new IndexOutOfBoundsException(m10.toString());
        }
        if (i3 > i10) {
            throw new IllegalArgumentException(a1.g.n(i3, i10, "fromIndex: ", " > toIndex: "));
        }
    }
}
