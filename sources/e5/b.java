package e5;

import d5.g0;
import java.util.Arrays;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b implements h3.g {
    public static final String f;
    public static final String h;
    public static final String n;
    public static final String r;
    public static final a9.m s;
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    public int e;

    static {
        int i10 = g0.a;
        f = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        n = Integer.toString(2, 36);
        r = Integer.toString(3, 36);
        s = new a9.m(27);
    }

    public b(int i10, int i11, int i12, byte[] bArr) {
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = bArr;
    }

    public static int a(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
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
