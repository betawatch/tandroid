package l4;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class a0 {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public a0(Object obj, long j10) {
        this(-1, -1, -1, j10, obj);
    }

    public final boolean a() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.a.equals(a0Var.a) && this.b == a0Var.b && this.c == a0Var.c && this.d == a0Var.d && this.e == a0Var.e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public a0(a0 a0Var) {
        this.a = a0Var.a;
        this.b = a0Var.b;
        this.c = a0Var.c;
        this.d = a0Var.d;
        this.e = a0Var.e;
    }

    public a0(int i10, int i11, int i12, long j10, Object obj) {
        this.a = obj;
        this.b = i10;
        this.c = i11;
        this.d = j10;
        this.e = i12;
    }
}
