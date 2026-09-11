package i4;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
