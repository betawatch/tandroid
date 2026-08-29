package i7;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class i7 {
    public static void a(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            StringBuilder o10 = com.google.android.recaptcha.internal.a.o("fromIndex: ", i10, ", toIndex: ", i11, ", size: ");
            o10.append(i12);
            throw new IndexOutOfBoundsException(o10.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(a4.w.k(i10, i11, "fromIndex: ", " > toIndex: "));
        }
    }
}
