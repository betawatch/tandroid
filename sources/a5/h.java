package a5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h implements Comparable {
    public final int a;
    public final c b;

    public h(int i9, c cVar) {
        this.a = i9;
        this.b = cVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.a, ((h) obj).a);
    }
}
