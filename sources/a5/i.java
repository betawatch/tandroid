package a5;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
