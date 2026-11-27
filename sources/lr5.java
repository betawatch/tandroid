// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class lr5 {
    public final int a;
    public final int b;

    public lr5(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lr5.class == obj.getClass()) {
            lr5 lr5Var = (lr5) obj;
            if (this.a == lr5Var.a && this.b == lr5Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntSize(");
        sb.append(this.a);
        sb.append(", ");
        return uh9.l(sb, this.b, ")");
    }
}
