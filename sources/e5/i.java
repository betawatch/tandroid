package e5;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class i implements Comparable {
    public final int a;
    public final d b;

    public i(int i10, d dVar) {
        this.a = i10;
        this.b = dVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.a, ((i) obj).a);
    }
}
