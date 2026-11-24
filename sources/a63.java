// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class a63 {
    public final z53 a;
    public final z53 b;
    public final double c;

    public a63(z53 z53Var, z53 z53Var2, double d) {
        this.a = z53Var;
        this.b = z53Var2;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a63)) {
            return false;
        }
        a63 a63Var = (a63) obj;
        return this.a == a63Var.a && this.b == a63Var.b && Double.compare(this.c, a63Var.c) == 0;
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
