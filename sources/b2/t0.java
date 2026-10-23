package b2;

import java.util.Arrays;
import java.util.List;
import v7.c8;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class t0 {
    public final s0[] a;
    public final long b;

    public t0(s0... s0VarArr) {
        this(-9223372036854775807L, s0VarArr);
    }

    public final t0 a(s0... s0VarArr) {
        if (s0VarArr.length == 0) {
            return this;
        }
        String str = e2.m0.a;
        s0[] s0VarArr2 = this.a;
        Object[] copyOf = Arrays.copyOf(s0VarArr2, s0VarArr2.length + s0VarArr.length);
        System.arraycopy(s0VarArr, 0, copyOf, s0VarArr2.length, s0VarArr.length);
        return new t0(this.b, (s0[]) copyOf);
    }

    public final t0 b(t0 t0Var) {
        return t0Var == null ? this : a(t0Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t0.class == obj.getClass()) {
            t0 t0Var = (t0) obj;
            if (Arrays.equals(this.a, t0Var.a) && this.b == t0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return c8.b(this.b) + (Arrays.hashCode(this.a) * 31);
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

    public t0(long j10, s0... s0VarArr) {
        this.b = j10;
        this.a = s0VarArr;
    }

    public t0(List list) {
        this((s0[]) list.toArray(new s0[0]));
    }
}
