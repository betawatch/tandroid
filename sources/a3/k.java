package a3;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class k implements Comparable {
    public final boolean a;
    public final boolean b;

    public k(e2.u uVar, int i7) {
        this.a = (uVar.e & 1) != 0;
        this.b = jg.g.c(i7, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        k kVar = (k) obj;
        return h9.w.a.c(this.b, kVar.b).c(this.a, kVar.a).e();
    }
}
