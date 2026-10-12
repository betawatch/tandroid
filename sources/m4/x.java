package m4;

import java.util.List;
import v7.c8;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class x {
    public final e9.n0 a;
    public final int b;
    public final long c;

    public x(long j10, int i10, List list) {
        this.a = e9.n0.u(list);
        this.b = i10;
        this.c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.a.equals(xVar.a) && this.b == xVar.b && this.c == xVar.c;
    }

    public final int hashCode() {
        return c8.b(this.c) + (((this.a.hashCode() * 31) + this.b) * 31);
    }
}
