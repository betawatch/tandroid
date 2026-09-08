package c2;

import e2.d0;
import j$.util.Objects;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class f {
    public static final f e = new f(-1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public f(int i10, int i11, int i12) {
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = d0.K(i12) ? d0.t(i12) * i11 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && this.b == fVar.b && this.c == fVar.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.a + ", channelCount=" + this.b + ", encoding=" + this.c + ']';
    }
}
