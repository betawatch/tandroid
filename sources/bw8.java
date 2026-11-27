// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class bw8 {
    public final int a;
    public final boolean b;

    public bw8(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bw8.class != obj.getClass()) {
            return false;
        }
        bw8 bw8Var = (bw8) obj;
        return this.a == bw8Var.a && this.b == bw8Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
