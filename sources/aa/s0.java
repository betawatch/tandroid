package aa;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class s0 extends r1 {
    public final String a;
    public final String b;
    public final long c;

    public s0(long j10, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            s0 s0Var = (s0) ((r1) obj);
            if (this.a.equals(s0Var.a) && this.b.equals(s0Var.b) && this.c == s0Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j10 = this.c;
        return hashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.a);
        sb2.append(", code=");
        sb2.append(this.b);
        sb2.append(", address=");
        return a1.g.r(sb2, this.c, "}");
    }
}
