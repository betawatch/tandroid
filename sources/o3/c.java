package o3;

import c8.j1;
import e2.n0;
import e2.p0;
import e2.u;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class c implements p0 {
    public final long a;

    public c(long j3) {
        this.a = j3;
    }

    @Override // e2.p0
    public final /* synthetic */ u a() {
        return null;
    }

    @Override // e2.p0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && c.class == obj.getClass() && this.a == ((c) obj).a;
    }

    public final int hashCode() {
        return j1.b(this.a) + 527;
    }

    public final String toString() {
        return "ThumbnailMetadata: presentationTimeUs=" + this.a;
    }

    @Override // e2.p0
    public final /* synthetic */ void b(n0 n0Var) {
    }
}
