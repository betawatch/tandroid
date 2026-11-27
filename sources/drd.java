// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class drd {
    public static final int a(ss ssVar, Object obj, int i) {
        int i2 = ssVar.c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int a = pq3.a(i2, i, ssVar.a);
            if (a < 0 || ur5.a(obj, ssVar.b[a])) {
                return a;
            }
            int i3 = a + 1;
            while (i3 < i2 && ssVar.a[i3] == i) {
                if (ur5.a(obj, ssVar.b[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = a - 1; i4 >= 0 && ssVar.a[i4] == i; i4--) {
                if (ur5.a(obj, ssVar.b[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            bg.b();
            return 0;
        }
    }
}
