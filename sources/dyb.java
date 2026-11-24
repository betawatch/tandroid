// default package

import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class dyb {
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public final int a;
    public final sxb b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        String str = g8c.a;
        f = "0";
        g = "1";
        h = "3";
        i = "4";
    }

    public dyb(sxb sxbVar, boolean z, int[] iArr, boolean[] zArr) {
        int i2 = sxbVar.a;
        this.a = i2;
        boolean z2 = false;
        gre.f(i2 == iArr.length && i2 == zArr.length);
        this.b = sxbVar;
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
        if (obj == null || dyb.class != obj.getClass()) {
            return false;
        }
        dyb dybVar = (dyb) obj;
        return this.c == dybVar.c && this.b.equals(dybVar.b) && Arrays.equals(this.d, dybVar.d) && Arrays.equals(this.e, dybVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
    }
}
