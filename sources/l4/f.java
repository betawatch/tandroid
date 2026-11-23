package l4;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class f implements Comparable {
    public final int a;
    public final b b;

    public f(int i7, b bVar) {
        this.a = i7;
        this.b = bVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.a, ((f) obj).a);
    }
}
