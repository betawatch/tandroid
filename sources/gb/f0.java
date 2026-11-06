package gb;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class f0 {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public f0(int i7, int i10, String str, boolean z9) {
        this.a = str;
        this.b = i7;
        this.c = i10;
        this.d = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return kotlin.jvm.internal.j.a(this.a, f0Var.a) && this.b == f0Var.b && this.c == f0Var.c && this.d == f0Var.d;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + (this.d ? 1231 : 1237);
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.a + ", pid=" + this.b + ", importance=" + this.c + ", isDefaultProcess=" + this.d + ')';
    }
}
