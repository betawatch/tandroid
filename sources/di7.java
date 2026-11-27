// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class di7 {
    public int a;
    public String b;
    public int c;
    public int d;
    public byte e;
    public int f;
    public int g;

    public final boolean a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.a = i2;
        this.b = nfd.a[3 - i3];
        int i6 = nfd.b[i5];
        this.d = i6;
        if (i2 == 2) {
            i6 /= 2;
            this.d = i6;
        } else if (i2 == 0) {
            i6 /= 4;
            this.d = i6;
        }
        int i7 = (i >>> 9) & 1;
        int i8 = 1152;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    iy8.d();
                    return false;
                }
                i8 = 384;
            }
        } else if (i2 != 3) {
            i8 = 576;
        }
        this.g = i8;
        if (i3 == 3) {
            int i9 = i2 == 3 ? nfd.c[i4 - 1] : nfd.d[i4 - 1];
            this.f = i9;
            this.c = qu6.y(i9, 12, i6, i7) << 2;
        } else {
            int i10 = jn7.Z1;
            if (i2 == 3) {
                int i11 = i3 == 2 ? nfd.e[i4 - 1] : nfd.f[i4 - 1];
                this.f = i11;
                this.c = qu6.y(i11, jn7.Z1, i6, i7);
            } else {
                int i12 = nfd.g[i4 - 1];
                this.f = i12;
                if (i3 == 1) {
                    i10 = 72;
                }
                this.c = qu6.y(i10, i12, i6, i7);
            }
        }
        this.e = ((i >> 6) & 3) == 3 ? (byte) 1 : (byte) 2;
        return true;
    }
}
