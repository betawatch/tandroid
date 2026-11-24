// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class k3f {
    public static void a(int i, int i2) {
        String a;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                a = l3f.a("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    u36.j(hg9.j(i2, "negative size: "));
                    return;
                }
                a = l3f.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(a);
        }
    }

    public static void b(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? c(i, i3, "start index") : (i2 < 0 || i2 > i3) ? c(i2, i3, "end index") : l3f.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String c(int i, int i2, String str) {
        if (i < 0) {
            return l3f.a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return l3f.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        u36.j(hg9.j(i2, "negative size: "));
        return null;
    }
}
