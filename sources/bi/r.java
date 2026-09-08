package bi;

import j$.util.Objects;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class r extends pg.a {
    public final long c;

    public r(long j3) {
        super(0, false);
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && this.c == ((r) obj).c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.c));
    }
}
