package n5;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class r extends d0 {
    public final q a;

    public r(q qVar) {
        this.a = qVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        return this.a.equals(((r) ((d0) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.a + "}";
    }
}
