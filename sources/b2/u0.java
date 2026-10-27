package b2;

import a8.fd;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class u0 {
    public final t0[] a;
    public final long b;

    public u0(t0... t0VarArr) {
        this(-9223372036854775807L, t0VarArr);
    }

    public final u0 a(t0... t0VarArr) {
        if (t0VarArr.length == 0) {
            return this;
        }
        String str = e2.n0.a;
        t0[] t0VarArr2 = this.a;
        Object[] copyOf = Arrays.copyOf(t0VarArr2, t0VarArr2.length + t0VarArr.length);
        System.arraycopy(t0VarArr, 0, copyOf, t0VarArr2.length, t0VarArr.length);
        return new u0(this.b, (t0[]) copyOf);
    }

    public final u0 b(u0 u0Var) {
        return u0Var == null ? this : a(u0Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u0.class == obj.getClass()) {
            u0 u0Var = (u0) obj;
            if (Arrays.equals(this.a, u0Var.a) && this.b == u0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return fd.b(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("entries=");
        sb2.append(Arrays.toString(this.a));
        long j10 = this.b;
        if (j10 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j10;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public u0(long j10, t0... t0VarArr) {
        this.b = j10;
        this.a = t0VarArr;
    }

    public u0(List list) {
        this((t0[]) list.toArray(new t0[0]));
    }
}
