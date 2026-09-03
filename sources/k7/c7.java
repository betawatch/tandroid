package k7;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class c7 {
    public static String a(int i10, int i11, String str) {
        if (i10 < 0) {
            return f7.a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return f7.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i11);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void b(long j10, String str, boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException(f7.a(str, Long.valueOf(j10)));
        }
    }

    public static void c(int i10, int i11) {
        String a2;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                a2 = f7.a("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    StringBuilder sb = new StringBuilder(26);
                    sb.append("negative size: ");
                    sb.append(i11);
                    throw new IllegalArgumentException(sb.toString());
                }
                a2 = f7.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(a2);
        }
    }

    public static void d(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(a(i10, i11, "index"));
        }
    }

    public static void e(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException((i10 < 0 || i10 > i12) ? a(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? a(i11, i12, "end index") : f7.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }
}
