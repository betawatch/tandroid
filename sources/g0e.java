// default package

import java.util.Arrays;

/* loaded from: classes.dex */
public final class g0e {
    public static final g0e e = new g0e(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public boolean d;

    public g0e(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.d = z;
    }

    public static g0e b() {
        return new g0e(0, new int[8], new Object[8], true);
    }

    public final void a(int i, Object obj) {
        if (!this.d) {
            gxc.b();
            return;
        }
        int i2 = this.a;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.b = Arrays.copyOf(iArr, i3);
            this.c = Arrays.copyOf(this.c, i3);
        }
        int[] iArr2 = this.b;
        int i4 = this.a;
        iArr2[i4] = i;
        this.c[i4] = obj;
        this.a = i4 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof g0e)) {
            return false;
        }
        g0e g0eVar = (g0e) obj;
        int i = this.a;
        if (i == g0eVar.a) {
            int[] iArr = this.b;
            int[] iArr2 = g0eVar.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = g0eVar.c;
                    int i3 = this.a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
