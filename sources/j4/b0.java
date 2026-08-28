package j4;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class b0 {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public b0(Object obj, long j10) {
        this(-1, -1, -1, j10, obj);
    }

    public final boolean a() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.a.equals(b0Var.a) && this.b == b0Var.b && this.c == b0Var.c && this.d == b0Var.d && this.e == b0Var.e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public b0(b0 b0Var) {
        this.a = b0Var.a;
        this.b = b0Var.b;
        this.c = b0Var.c;
        this.d = b0Var.d;
        this.e = b0Var.e;
    }

    public b0(int i9, int i10, int i11, long j10, Object obj) {
        this.a = obj;
        this.b = i9;
        this.c = i10;
        this.d = j10;
        this.e = i11;
    }
}
