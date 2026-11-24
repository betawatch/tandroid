// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class j90 extends wz2 {
    public final int a;

    public j90(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wz2) {
            if (this.a == ((j90) ((wz2) obj)).a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 1000003 ^ this.a;
    }

    public final String toString() {
        return hg9.k(new StringBuilder("ProfilingTrigger{trigger="), this.a, "}");
    }
}
