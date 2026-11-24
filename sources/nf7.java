// default package

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class nf7 {
    public final lf7[] a;
    public final long b;

    public nf7(List list) {
        this((lf7[]) list.toArray(new lf7[0]));
    }

    public final nf7 a(lf7... lf7VarArr) {
        if (lf7VarArr.length == 0) {
            return this;
        }
        String str = hac.a;
        lf7[] lf7VarArr2 = this.a;
        Object[] copyOf = Arrays.copyOf(lf7VarArr2, lf7VarArr2.length + lf7VarArr.length);
        System.arraycopy(lf7VarArr, 0, copyOf, lf7VarArr2.length, lf7VarArr.length);
        return new nf7(this.b, (lf7[]) copyOf);
    }

    public final nf7 b(nf7 nf7Var) {
        return nf7Var == null ? this : a(nf7Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nf7.class == obj.getClass()) {
            nf7 nf7Var = (nf7) obj;
            if (Arrays.equals(this.a, nf7Var.a) && this.b == nf7Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return cqe.b(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.a));
        long j = this.b;
        sb.append(j == -9223372036854775807L ? "" : kt6.n(j, ", presentationTimeUs="));
        return sb.toString();
    }

    public nf7(long j, lf7... lf7VarArr) {
        this.b = j;
        this.a = lf7VarArr;
    }

    public nf7(lf7... lf7VarArr) {
        this(-9223372036854775807L, lf7VarArr);
    }
}
