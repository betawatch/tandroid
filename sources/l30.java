// default package

import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class l30 {
    public static final l30 e = new l30(-1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public l30(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = hac.N(i3) ? hac.u(i3) * i2 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l30)) {
            return false;
        }
        l30 l30Var = (l30) obj;
        return this.a == l30Var.a && this.b == l30Var.b && this.c == l30Var.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.a + ", channelCount=" + this.b + ", encoding=" + this.c + ']';
    }
}
