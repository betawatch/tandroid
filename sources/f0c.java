// default package

import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class f0c {
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public final int a;
    public final uzb b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        String str = hac.a;
        f = "0";
        g = "1";
        h = "3";
        i = "4";
    }

    public f0c(uzb uzbVar, boolean z, int[] iArr, boolean[] zArr) {
        int i2 = uzbVar.a;
        this.a = i2;
        boolean z2 = false;
        jte.f(i2 == iArr.length && i2 == zArr.length);
        this.b = uzbVar;
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
        if (obj == null || f0c.class != obj.getClass()) {
            return false;
        }
        f0c f0cVar = (f0c) obj;
        return this.c == f0cVar.c && this.b.equals(f0cVar.b) && Arrays.equals(this.d, f0cVar.d) && Arrays.equals(this.e, f0cVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
    }
}
