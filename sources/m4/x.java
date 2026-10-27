package m4;

import a8.fd;
import java.util.List;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class x {
    public final f9.i0 a;
    public final int b;
    public final long c;

    public x(long j10, int i10, List list) {
        this.a = f9.i0.u(list);
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
        return fd.b(this.c) + (((this.a.hashCode() * 31) + this.b) * 31);
    }
}
