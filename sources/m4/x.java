package m4;

import a8.fd;
import java.util.List;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
