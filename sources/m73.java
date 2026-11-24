// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class m73 {
    public final l73 a;
    public final l73 b;
    public final double c;

    public m73(l73 l73Var, l73 l73Var2, double d) {
        this.a = l73Var;
        this.b = l73Var2;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m73)) {
            return false;
        }
        m73 m73Var = (m73) obj;
        return this.a == m73Var.a && this.b == m73Var.b && Double.compare(this.c, m73Var.c) == 0;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.c);
        return hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.a + ", crashlytics=" + this.b + ", sessionSamplingRate=" + this.c + ')';
    }
}
