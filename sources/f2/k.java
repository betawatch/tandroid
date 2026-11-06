package f2;

import h2.m0;
import j$.util.Objects;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class k {
    public static final k e = new k(-1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public k(int i7, int i10, int i11) {
        this.a = i7;
        this.b = i10;
        this.c = i11;
        this.d = m0.M(i11) ? m0.u(i11) * i10 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a == kVar.a && this.b == kVar.b && this.c == kVar.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.a + ", channelCount=" + this.b + ", encoding=" + this.c + ']';
    }
}
