package m4;

import java.util.List;
import v7.c8;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class w {
    public final e9.n0 a;
    public final int b;
    public final long c;

    public w(long j10, int i10, List list) {
        this.a = e9.n0.u(list);
        this.b = i10;
        this.c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.a.equals(wVar.a) && this.b == wVar.b && this.c == wVar.c;
    }

    public final int hashCode() {
        return c8.b(this.c) + (((this.a.hashCode() * 31) + this.b) * 31);
    }
}
