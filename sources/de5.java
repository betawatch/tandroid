// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public abstract class de5 {
    public static int[] a() {
        return new int[]{10000, 3600, 400, 20, -10787210, -8681059, -14341066, 2000, 1800, kk7.C4, 10, -2013375, -1482439, -7666429, 500, 900, kk7.d3, 7, -1214690, -1214690, -6606592, kk7.Y3, 600, kk7.f2, 4, -1926647, -1926647, -6668800, 100, kk7.W4, kk7.u1, 3, -12539616, -12539616, -15244800, 50, 120, 80, 2, -12147733, -12147733, -16756594, 10, 60, 60, 1, -6988581, -6988581, -11991141, 0, 30, 30, 0, -6988581, -6988581, -11991141};
    }

    public static int b(int i, int i2, int i3) {
        int[] iArr = na7.q1(i).T3;
        for (int i4 = 0; i4 < iArr.length / 7; i4++) {
            int i5 = i4 * 7;
            if (i2 >= iArr[i5]) {
                return iArr[i5 + 1 + i3];
            }
        }
        return 0;
    }
}
