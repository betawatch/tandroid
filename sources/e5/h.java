package e5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class h implements Comparable {
    public final int a;
    public final c b;

    public h(int i10, c cVar) {
        this.a = i10;
        this.b = cVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.a, ((h) obj).a);
    }
}
