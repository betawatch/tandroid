package da;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class o1 extends s2 {
    public final String a;

    public o1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s2)) {
            return false;
        }
        return this.a.equals(((o1) ((s2) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a8.p0.s(new StringBuilder("User{identifier="), this.a, "}");
    }
}
