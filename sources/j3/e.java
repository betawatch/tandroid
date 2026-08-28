package j3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e implements h3.g {
    public static final e h = new e(0, 0, 1, 1, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public android.support.v4.media.c f;

    static {
        int i9 = d5.f0.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public e(int i9, int i10, int i11, int i12, int i13) {
        this.a = i9;
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.e = i13;
    }

    public final android.support.v4.media.c a() {
        if (this.f == null) {
            this.f = new android.support.v4.media.c(this);
        }
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.a == eVar.a && this.b == eVar.b && this.c == eVar.c && this.d == eVar.d && this.e == eVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }
}
