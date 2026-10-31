package m4;

import java.util.List;
import v7.d8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class x {
    public final e9.n0 a;
    public final int b;
    public final long c;

    public x(List list, int i10, long j10) {
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
        return d8.b(this.c) + (((this.a.hashCode() * 31) + this.b) * 31);
    }
}
