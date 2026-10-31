package c2;

import e2.l0;
import j$.util.Objects;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class j {
    public static final j e = new j(-1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public j(int i10, int i11, int i12) {
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = l0.M(i12) ? l0.u(i12) * i11 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.a == jVar.a && this.b == jVar.b && this.c == jVar.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.a + ", channelCount=" + this.b + ", encoding=" + this.c + ']';
    }
}
