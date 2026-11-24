// default package

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ld7 {
    public final jd7[] a;
    public final long b;

    public ld7(List list) {
        this((jd7[]) list.toArray(new jd7[0]));
    }

    public final ld7 a(jd7... jd7VarArr) {
        if (jd7VarArr.length == 0) {
            return this;
        }
        String str = g8c.a;
        jd7[] jd7VarArr2 = this.a;
        Object[] copyOf = Arrays.copyOf(jd7VarArr2, jd7VarArr2.length + jd7VarArr.length);
        System.arraycopy(jd7VarArr, 0, copyOf, jd7VarArr2.length, jd7VarArr.length);
        return new ld7(this.b, (jd7[]) copyOf);
    }

    public final ld7 b(ld7 ld7Var) {
        return ld7Var == null ? this : a(ld7Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ld7.class == obj.getClass()) {
            ld7 ld7Var = (ld7) obj;
            if (Arrays.equals(this.a, ld7Var.a) && this.b == ld7Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return zne.b(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.a));
        long j = this.b;
        sb.append(j == -9223372036854775807L ? "" : ls6.n(j, ", presentationTimeUs="));
        return sb.toString();
    }

    public ld7(long j, jd7... jd7VarArr) {
        this.b = j;
        this.a = jd7VarArr;
    }

    public ld7(jd7... jd7VarArr) {
        this(-9223372036854775807L, jd7VarArr);
    }
}
