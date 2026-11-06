package e2;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class q0 {
    public final p0[] a;
    public final long b;

    public q0(p0... p0VarArr) {
        this(-9223372036854775807L, p0VarArr);
    }

    public final q0 a(p0... p0VarArr) {
        if (p0VarArr.length == 0) {
            return this;
        }
        String str = h2.m0.a;
        p0[] p0VarArr2 = this.a;
        Object[] copyOf = Arrays.copyOf(p0VarArr2, p0VarArr2.length + p0VarArr.length);
        System.arraycopy(p0VarArr, 0, copyOf, p0VarArr2.length, p0VarArr.length);
        return new q0(this.b, (p0[]) copyOf);
    }

    public final q0 b(q0 q0Var) {
        return q0Var == null ? this : a(q0Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q0.class == obj.getClass()) {
            q0 q0Var = (q0) obj;
            if (Arrays.equals(this.a, q0Var.a) && this.b == q0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return c8.f1.b(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("entries=");
        sb2.append(Arrays.toString(this.a));
        long j3 = this.b;
        if (j3 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j3;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public q0(long j3, p0... p0VarArr) {
        this.b = j3;
        this.a = p0VarArr;
    }

    public q0(List list) {
        this((p0[]) list.toArray(new p0[0]));
    }
}
