package b2;

import java.util.Arrays;
import java.util.List;
import v7.z7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class p0 {
    public final o0[] a;
    public final long b;

    public p0(o0... o0VarArr) {
        this(-9223372036854775807L, o0VarArr);
    }

    public final p0 a(o0... o0VarArr) {
        if (o0VarArr.length == 0) {
            return this;
        }
        String str = e2.d0.a;
        o0[] o0VarArr2 = this.a;
        Object[] copyOf = Arrays.copyOf(o0VarArr2, o0VarArr2.length + o0VarArr.length);
        System.arraycopy(o0VarArr, 0, copyOf, o0VarArr2.length, o0VarArr.length);
        return new p0(this.b, (o0[]) copyOf);
    }

    public final p0 b(p0 p0Var) {
        return p0Var == null ? this : a(p0Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p0.class == obj.getClass()) {
            p0 p0Var = (p0) obj;
            if (Arrays.equals(this.a, p0Var.a) && this.b == p0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return z7.b(this.b) + (Arrays.hashCode(this.a) * 31);
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

    public p0(long j3, o0... o0VarArr) {
        this.b = j3;
        this.a = o0VarArr;
    }

    public p0(List list) {
        this((o0[]) list.toArray(new o0[0]));
    }
}
