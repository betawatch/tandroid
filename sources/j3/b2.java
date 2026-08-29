package j3;

import i7.o6;
import java.util.Arrays;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b2 implements g {
    public final Object a;
    public final int b;
    public final f1 c;
    public final Object d;
    public final int e;
    public final long f;
    public final long h;
    public final int n;
    public final int r;

    static {
        int i10 = f5.d0.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public b2(Object obj, int i10, f1 f1Var, Object obj2, int i11, long j10, long j11, int i12, int i13) {
        this.a = obj;
        this.b = i10;
        this.c = f1Var;
        this.d = obj2;
        this.e = i11;
        this.f = j10;
        this.h = j11;
        this.n = i12;
        this.r = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b2.class == obj.getClass()) {
            b2 b2Var = (b2) obj;
            if (this.b == b2Var.b && this.e == b2Var.e && this.f == b2Var.f && this.h == b2Var.h && this.n == b2Var.n && this.r == b2Var.r && o6.a(this.a, b2Var.a) && o6.a(this.d, b2Var.d) && o6.a(this.c, b2Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.h), Integer.valueOf(this.n), Integer.valueOf(this.r)});
    }
}
