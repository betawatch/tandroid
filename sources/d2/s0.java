package d2;

import b8.pd;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class s0 {
    public final r0[] a;
    public final long b;

    public s0(r0... r0VarArr) {
        this(-9223372036854775807L, r0VarArr);
    }

    public final s0 a(r0... r0VarArr) {
        if (r0VarArr.length == 0) {
            return this;
        }
        String str = g2.n0.a;
        r0[] r0VarArr2 = this.a;
        Object[] copyOf = Arrays.copyOf(r0VarArr2, r0VarArr2.length + r0VarArr.length);
        System.arraycopy(r0VarArr, 0, copyOf, r0VarArr2.length, r0VarArr.length);
        return new s0(this.b, (r0[]) copyOf);
    }

    public final s0 b(s0 s0Var) {
        return s0Var == null ? this : a(s0Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s0.class == obj.getClass()) {
            s0 s0Var = (s0) obj;
            if (Arrays.equals(this.a, s0Var.a) && this.b == s0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return pd.b(this.b) + (Arrays.hashCode(this.a) * 31);
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

    public s0(long j10, r0... r0VarArr) {
        this.b = j10;
        this.a = r0VarArr;
    }

    public s0(List list) {
        this((r0[]) list.toArray(new r0[0]));
    }
}
