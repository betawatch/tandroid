package gb;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class k {
    public final j a;
    public final j b;
    public final double c;

    public k(j jVar, j jVar2, double d) {
        this.a = jVar;
        this.b = jVar2;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a == kVar.a && this.b == kVar.b && Double.compare(this.c, kVar.c) == 0;
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
