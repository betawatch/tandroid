package e5;

import d5.f0;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b implements h3.g {
    public static final String f;
    public static final String h;
    public static final String n;
    public static final String r;
    public static final a9.b s;
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    public int e;

    static {
        int i9 = f0.a;
        f = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        n = Integer.toString(2, 36);
        r = Integer.toString(3, 36);
        s = new a9.b(21);
    }

    public b(int i9, int i10, int i11, byte[] bArr) {
        this.a = i9;
        this.b = i10;
        this.c = i11;
        this.d = bArr;
    }

    public static int a(int i9) {
        if (i9 == 1) {
            return 1;
        }
        if (i9 != 9) {
            return (i9 == 4 || i9 == 5 || i9 == 6 || i9 == 7) ? 2 : -1;
        }
        return 6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && Arrays.equals(this.d, bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.d) + ((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31);
        }
        return this.e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(this.a);
        sb2.append(", ");
        sb2.append(this.b);
        sb2.append(", ");
        sb2.append(this.c);
        sb2.append(", ");
        sb2.append(this.d != null);
        sb2.append(")");
        return sb2.toString();
    }
}
