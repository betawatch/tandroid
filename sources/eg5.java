// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public abstract class eg5 {
    public static int[] a() {
        return new int[]{10000, 3600, 400, 20, -10787210, -8681059, -14341066, 2000, 1800, jn7.C4, 10, -2013375, -1482439, -7666429, 500, 900, jn7.d3, 7, -1214690, -1214690, -6606592, jn7.Y3, 600, jn7.f2, 4, -1926647, -1926647, -6668800, 100, jn7.W4, jn7.u1, 3, -12539616, -12539616, -15244800, 50, jn7.E1, 80, 2, -12147733, -12147733, -16756594, 10, 60, 60, 1, -6988581, -6988581, -11991141, 0, 30, 30, 0, -6988581, -6988581, -11991141};
    }

    public static int b(int i, int i2, int i3) {
        int[] iArr = uc7.s1(i).T3;
        for (int i4 = 0; i4 < iArr.length / 7; i4++) {
            int i5 = i4 * 7;
            if (i2 >= iArr[i5]) {
                return iArr[i5 + 1 + i3];
            }
        }
        return 0;
    }
}
