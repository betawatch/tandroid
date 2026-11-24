// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
