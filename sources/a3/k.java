package a3;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
