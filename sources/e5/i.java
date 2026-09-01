package e5;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
