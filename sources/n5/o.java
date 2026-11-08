package n5;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class o extends a0 {
    public final r a;

    public o(r rVar) {
        z zVar = z.a;
        this.a = rVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        if (!this.a.equals(((o) ((a0) obj)).a)) {
            return false;
        }
        Object obj2 = z.a;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ z.a.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.a + ", productIdOrigin=" + z.a + "}";
    }
}
