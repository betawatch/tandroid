package b2;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public class z {
    public static final z i = new z(new y());
    public static final String j = Integer.toString(0, 36);
    public static final String k = Integer.toString(1, 36);
    public static final String l = Integer.toString(2, 36);
    public static final String m = Integer.toString(3, 36);
    public static final String n = Integer.toString(4, 36);
    public static final String o = Integer.toString(5, 36);
    public static final String p = Integer.toString(6, 36);
    public static final String q = Integer.toString(7, 36);
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public z(y yVar) {
        this.a = e2.d0.e0(yVar.a);
        this.c = e2.d0.e0(yVar.b);
        this.b = yVar.a;
        this.d = yVar.b;
        this.e = yVar.c;
        this.f = yVar.d;
        this.g = yVar.e;
        this.h = yVar.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.b == zVar.b && this.d == zVar.d && this.e == zVar.e && this.f == zVar.f && this.g == zVar.g && this.h == zVar.h;
    }

    public final int hashCode() {
        long j3 = this.b;
        int i10 = ((int) (j3 ^ (j3 >>> 32))) * 31;
        long j10 = this.d;
        return ((((((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
