package c5;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
