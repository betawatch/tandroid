// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class hoe {
    public static int a(rj0 rj0Var, boolean z) {
        int i = rj0Var.b;
        int i2 = rj0Var.c;
        if (!z) {
            i2 = i;
            i = i2;
        }
        byte[][] bArr = (byte[][]) rj0Var.d;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            byte b = -1;
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                byte b2 = z ? bArr[i4][i6] : bArr[i6][i4];
                if (b2 == b) {
                    i5++;
                } else {
                    if (i5 >= 5) {
                        i3 += i5 - 2;
                    }
                    i5 = 1;
                    b = b2;
                }
            }
            if (i5 >= 5) {
                i3 = (i5 - 2) + i3;
            }
        }
        return i3;
    }
}
