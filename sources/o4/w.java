package o4;

import b8.pd;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class w {
    public final g9.i0 a;
    public final int b;
    public final long c;

    public w(List list, int i3, long j10) {
        this.a = g9.i0.q(list);
        this.b = i3;
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
        return pd.b(this.c) + (((this.a.hashCode() * 31) + this.b) * 31);
    }
}
