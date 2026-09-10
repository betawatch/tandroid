package i4;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
