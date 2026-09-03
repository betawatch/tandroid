package l3;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class d implements j3.g {
    public static final d h = new d(0, 0, 1, 1, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public ja.c f;

    static {
        int i10 = h5.d0.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public d(int i10, int i11, int i12, int i13, int i14) {
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = i13;
        this.e = i14;
    }

    public final ja.c a() {
        if (this.f == null) {
            this.f = new ja.c(this);
        }
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.a == dVar.a && this.b == dVar.b && this.c == dVar.c && this.d == dVar.d && this.e == dVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }
}
