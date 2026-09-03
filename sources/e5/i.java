package e5;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
