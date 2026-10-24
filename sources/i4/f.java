package i4;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class f implements Comparable {
    public final int a;
    public final b b;

    public f(int i10, b bVar) {
        this.a = i10;
        this.b = bVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.a, ((f) obj).a);
    }
}
