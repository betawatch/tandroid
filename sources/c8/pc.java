package c8;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public abstract class pc {
    public static void a(int i7, int i10) {
        String a10;
        if (i7 < 0 || i7 >= i10) {
            if (i7 < 0) {
                a10 = qc.a("%s (%s) must not be negative", "index", Integer.valueOf(i7));
            } else {
                if (i10 < 0) {
                    throw new IllegalArgumentException(jg.g.j(i10, "negative size: "));
                }
                a10 = qc.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i7), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(a10);
        }
    }

    public static void b(int i7, int i10, int i11) {
        if (i7 < 0 || i10 < i7 || i10 > i11) {
            throw new IndexOutOfBoundsException((i7 < 0 || i7 > i11) ? c(i7, i11, "start index") : (i10 < 0 || i10 > i11) ? c(i10, i11, "end index") : qc.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i7)));
        }
    }

    public static String c(int i7, int i10, String str) {
        if (i7 < 0) {
            return qc.a("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i10 >= 0) {
            return qc.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(jg.g.j(i10, "negative size: "));
    }
}
