package h7;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class o6 {
    public static void a(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            StringBuilder p6 = com.google.android.recaptcha.internal.a.p("fromIndex: ", i10, ", toIndex: ", i11, ", size: ");
            p6.append(i12);
            throw new IndexOutOfBoundsException(p6.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(a9.p.j(i10, i11, "fromIndex: ", " > toIndex: "));
        }
    }
}
