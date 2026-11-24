// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class axc implements Comparable {
    public final int a;
    public final wwc b;

    public axc(int i, wwc wwcVar) {
        this.a = i;
        this.b = wwcVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.a, ((axc) obj).a);
    }
}
