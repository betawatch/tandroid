// default package

import java.util.Arrays;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class e2c {
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public final int a;
    public final t1c b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        String str = gcc.a;
        f = "0";
        g = "1";
        h = "3";
        i = "4";
    }

    public e2c(t1c t1cVar, boolean z, int[] iArr, boolean[] zArr) {
        int i2 = t1cVar.a;
        this.a = i2;
        boolean z2 = false;
        yve.f(i2 == iArr.length && i2 == zArr.length);
        this.b = t1cVar;
        if (z && i2 > 1) {
            z2 = true;
        }
        this.c = z2;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e2c.class != obj.getClass()) {
            return false;
        }
        e2c e2cVar = (e2c) obj;
        return this.c == e2cVar.c && this.b.equals(e2cVar.b) && Arrays.equals(this.d, e2cVar.d) && Arrays.equals(this.e, e2cVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
    }
}
