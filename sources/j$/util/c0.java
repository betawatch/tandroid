package j$.util;

/* loaded from: classes2.dex */
public final class c0 {
    public static final c0 c = new c0();
    public final boolean a;
    public final int b;

    public c0() {
        this.a = false;
        this.b = 0;
    }

    public c0(int i9) {
        this.a = true;
        this.b = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        boolean z10 = c0Var.a;
        boolean z11 = this.a;
        return (z11 && z10) ? this.b == c0Var.b : z11 == z10;
    }

    public final int hashCode() {
        if (this.a) {
            return this.b;
        }
        return 0;
    }

    public final String toString() {
        if (this.a) {
            return "OptionalInt[" + this.b + "]";
        }
        return "OptionalInt.empty";
    }
}
